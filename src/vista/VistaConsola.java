package vista;

import java.util.Scanner;

import controlador.Ciudades;
import controlador.Partido;
import modelo.FuncionesCandidato;

public class VistaConsola implements VistaGeneral{
        public static void main(String[] args) throws Exception{
        System.out.print("\033c");
        Scanner sn = new Scanner(System.in);
        int opcion;
        do{
            System.out.print("\033c");
            System.out.println("\nSistema de votaciones Valle 2023\n");
            System.out.println("1- Ver menu de los candidatos.");
            System.out.println("2- Ver resultados.");
            System.out.println("3- Partido con más candidatos inscritos.");
            System.out.println("4- top 3 ciudades con menos candidatos.");
            System.out.println("5- Salir.");

            System.out.print("\nPor favor seleccione una opcion: ");
            opcion = sn.nextInt();
            System.out.print("\033c");
        
            switch(opcion){
                case 1:
                    menuCandidato(args);
                    break;
                case 2:
                    System.out.println("El candidato ganador es:"+FuncionesCandidato.ganador.getNombre());
                    System.out.println("de cédula: "+FuncionesCandidato.ganador.getIdentificacion());
                    System.out.println("Con "+FuncionesCandidato.mas_votos+" votos.");
                    System.out.println("Las propuestas del candidato son: "+FuncionesCandidato.ganador.getPropuestas() + "\n\n");
                    FuncionesCandidato.pressEnterToContinue();
                    break;
                case 3:
                    FuncionesCandidato.ContarPorPartido();
                    break;
                case 4: 
                    FuncionesCandidato.ordenar();
                    break;
                case 5:
                    break;
                default:
                    break;
        }
        }while(opcion!=5);
        sn.close();
    }

    static void menuCandidato(String[] args) throws Exception{
        
        Scanner sn = new Scanner(System.in);
        int opcion2;
        do{
        System.out.println("\nMenu candidatos\n");
        System.out.println("1- Crear un candidato.");
        System.out.println("2- Ver los candidatos.");
        System.out.println("3- Buscar candidato.");
        System.out.println("4- Editar un candidato.");
        System.out.println("5- Eliminar un candidato.");
        System.out.println("6- Asignar votos de los candidatos.");
        System.out.println("7- Volver.");

        System.out.print("\nPor favor seleccione una opcion: ");
        opcion2 = sn.nextInt();
        System.out.print("\033c");

        switch(opcion2){
            case 1:
                FuncionesCandidato.crearCandidato(args);
                break;
            case 2:
                FuncionesCandidato.mostrarCandidato(FuncionesCandidato.lista);
                FuncionesCandidato.pressEnterToContinue();
                System.out.println("\033c");
                break;
            case 3:
                FuncionesCandidato.buscarCandidato();
                FuncionesCandidato.pressEnterToContinue();
                System.out.println("\033c");
                break;
            case 4:
                FuncionesCandidato.actualizarCandidato();
                break;
            case 5:
                FuncionesCandidato.eliminarCandidato();
                break;
            case 6:
                FuncionesCandidato.asignarVotos();
                break;
            case 7:
                break;
            default:
                {System.out.println("Digitaste algo mal vuelve a intentarlo");}
            break;

        }
        }while(opcion2!=7);   
        sn.close();
    }

    @Override
    public void Iniciar() {
        throw new UnsupportedOperationException("Unimplemented method 'Iniciar'");
    }

    @Override
    public String getNombre() {
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }

    @Override
    public String getIdentificacion() {
        throw new UnsupportedOperationException("Unimplemented method 'getIdentificacion'");
    }

    @Override
    public Ciudades getCiudadOrigen() {
        throw new UnsupportedOperationException("Unimplemented method 'getCiudadOrigen'");
    }

    @Override
    public boolean IsDerecha() {
        throw new UnsupportedOperationException("Unimplemented method 'IsDerecha'");
    }

    @Override
    public Partido getPartido() {
        throw new UnsupportedOperationException("Unimplemented method 'getPartido'");
    }

    @Override
    public String getPropuestas() {
        throw new UnsupportedOperationException("Unimplemented method 'getPropuestas'");

    }
}

