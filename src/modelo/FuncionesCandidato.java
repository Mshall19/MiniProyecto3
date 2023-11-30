package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import controlador.Ciudades;
import controlador.Partido;
import javafx.scene.web.WebHistory.Entry;

public class FuncionesCandidato {
    public static ArrayList<Candidato> lista= new ArrayList<Candidato>();
    public static int indice;
    public static int validar = 0;
    public static int mas_votos = 0; 
    public static Candidato ganador = null;

    static int conteoCali, conteoBuenaventura, conteoPalmira, conteoTulua, conteoJamundi, conteoCartago, conteoZarzal = 0;
    static int conteoCandelaria, conteoPradera, conteoGinebra, conteoCerrito, conteoRoldanillo, conteoLaUnion, conteoSevilla = 0;
    static int conteoBuga, conteoGuacari, conteoRozo, conteoCaicedonia, conteoYumbo, conteoFlorida, conteoDagua = 0;

    static int conteoConservador, conteoCentroDemocratico, conteoCambioRadical = 0;
    static int conteoLiberal, conteoAlianzaVerde = 0;

    public static void pressEnterToContinue(){ 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter key to continue...");
        try{
            System.in.read();
            scanner.nextLine();
            }
        catch(Exception e)
        {}
    }
    public static void crearCandidato(String[] args) throws Exception{
        
        boolean salir = true; 
        while(salir){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa el nombre: ");
            String nombreWhile = scanner.nextLine();
            System.out.print("\033c");
            
            System.out.println("Ingrese la Identificación: ");
            String identificacion = scanner.nextLine();
            Ciudades ciudades[] = Ciudades.values();
            System.out.print("\033c");

            System.out.println("Estas son las ciudades: ");  
            System.out.println("-------------------------------------------------------------------------------");          
            for(Integer i=1; i <= ciudades.length ; i++){
                if (((i+1)%4)==0){    
                    System.out.print(i.toString() + ". " + ciudades[i-1] + "\t\t\n" );
                }else {
                    System.out.print(i.toString() + ". " + ciudades[i-1] + "\t\t" );
            }
            }
            System.out.println("\n-------------------------------------------------------------------------------\n"); 

            int variableswitch3;
            Ciudades ciudad = null; 
            do{
                System.out.println("ingrese el número de su ciudad de origen: ");
                variableswitch3 = scanner.nextInt();
                System.out.print("\033c");
                
                switch(variableswitch3){
                    case 1: ciudad = Ciudades.Cali;break;
                    case 2: ciudad = Ciudades.Buenaventura;break;
                    case 3: ciudad = Ciudades.Palmira;break;
                    case 4: ciudad = Ciudades.Tulua;break;
                    case 5: ciudad = Ciudades.Jamundi;break;
                    case 6: ciudad = Ciudades.Cartago;break;
                    case 7: ciudad = Ciudades.Zarzal;break;
                    case 8: ciudad = Ciudades.Candelaria;break;
                    case 9: ciudad = Ciudades.Pradera;break;
                    case 10: ciudad = Ciudades.Ginebra;break;
                    case 11: ciudad = Ciudades.Cerrito;break;
                    case 12: ciudad = Ciudades.Roldanillo;break;
                    case 13: ciudad = Ciudades.Launion;break;
                    case 14: ciudad = Ciudades.Sevilla;break;
                    case 15: ciudad = Ciudades.Buga;break;
                    case 16: ciudad = Ciudades.Guacari;break;
                    case 17: ciudad = Ciudades.Rozo;break;
                    case 18: ciudad = Ciudades.Caicedonia;break;
                    case 19: ciudad = Ciudades.Yumbo;break;
                    case 20: ciudad = Ciudades.Florida;break;
                    case 21: ciudad = Ciudades.Dagua;break;
                    default: System.out.println("ERROR. Digite algo válido");
                }
            }while(variableswitch3 < 1 || variableswitch3 >21 );  
            
            Boolean posicion = false;
            Partido PartidoCan = null;
            int posi;

            do {
                System.out.println("ingrese 0 si es de derecha o 1 si es de Izquierda: ");
                posi = scanner.nextInt();
                System.out.print("\033c");
                if(posi == 0){
                posicion = true; /* se le asigna true cuando el candidato es de derecha */
                int variableswitch;
                do {
                    System.out.println("Estos son los partidos de derecha: ");
                    System.out.println("1. "+Partido.Conservador);
                    System.out.println("2. "+Partido.Centro_democratico);
                    System.out.println("3. "+Partido.Partido_cambio_radical);
                    variableswitch = scanner.nextInt(); 
                    System.out.print("\033c");

                    switch(variableswitch){
                    case 1: {PartidoCan = Partido.Conservador;
                        conteoConservador++;
                        break;}

                    case 2: {PartidoCan = Partido.Centro_democratico;
                        conteoCentroDemocratico++;
                        break;}
                    case 3: {PartidoCan = Partido.Partido_cambio_radical;
                        conteoCambioRadical++;
                        break;}
                    default: System.out.println("Digíte un dato válido");break;
                    }
                
                } while (variableswitch < 1 || variableswitch > 3 );
                }         
                else if(posi == 1){
                    posicion = false; /* se le asigna false cuando el candidato es de izquierda */
                    int variableswitch2;
                    do {
                        System.out.println("Estos son los partidos de izquierda: ");
                        System.out.println("1. "+Partido.Liberal);
                        System.out.println("2. "+Partido.Alianza_verde);
                        variableswitch2 = scanner.nextInt();
                        System.out.print("\033c");
                        
                        switch(variableswitch2){
                        case 1: {PartidoCan = Partido.Liberal;
                            conteoLiberal++;
                            break;}
                        case 2: {PartidoCan = Partido.Alianza_verde;
                            conteoAlianzaVerde++;
                            break;}
                        default: System.out.println("Digíte un dato válido");break;
                    }
                    } while (variableswitch2 < 1 || variableswitch2 > 2);
                    
                }else System.out.println("Dígite un numero válido");
                
            } while (posi > 1 || posi < 0);
            
            System.out.println("Ingrese sus propuestas de campaña: ");
            scanner.nextLine();
            String propuestas = scanner.nextLine();
            System.out.print("\033c");
        
            Candidato candidato = new Candidato(nombreWhile, identificacion, ciudad , posicion, PartidoCan, propuestas);
            lista.add(candidato);
            System.out.println("Si desea salir, ingrese 0: ");
            int continuar = scanner.nextInt();
            System.out.print("\033c");

            if(continuar==0)
                salir = false;
        }
    }

    public static void mostrarCandidato(ArrayList<Candidato> lista2){
        Scanner scanner = new Scanner(System.in);
        lista2.forEach((i) ->{
            String posiToF = null;
            if(i.isDerecha()==true){
                    posiToF = "Derecha";
                }
            else if(i.isDerecha()==false){
                    posiToF = "Izquierda";
                }
            System.out.println("------------------------------------------------------------");
            System.out.println(i.getNombre());            
            System.out.println(i.getIdentificacion());            
            System.out.println(i.getCiudad_origen());            
            System.out.println(posiToF);            
            System.out.println(i.getPartido_politico());            
            System.out.println(i.getPropuestas()); 
            System.out.println("\n");
            System.out.println("\n"); 
        });
    } 

    public static void buscarCandidato(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del candidato a buscar: ");
        String buscado = scanner.nextLine();
        System.out.print("\033c");
        
        lista.forEach((i)->{
            
            if(i.getNombre().contains(buscado)){
                String posiToF = null;
                if(i.isDerecha()==true){
                    posiToF = "Derecha";
                }
                else if(i.isDerecha()==false){
                    posiToF = "Izquierda";
                }
                System.out.println("------------------------------------------------------------");
                System.out.println(i.getNombre());            
                System.out.println(i.getIdentificacion());            
                System.out.println(i.getCiudad_origen());            
                System.out.println(posiToF);            
                System.out.println(i.getPartido_politico());            
                System.out.println(i.getPropuestas()); 
                System.out.print("\n");
            }
        });
    }

    public static void actualizarCandidato(){
        Scanner scanner = new Scanner(System.in);
        
        do{     
        System.out.print("Ingresa la cédula del candidato a actualizar: ");
        String buscado = scanner.nextLine();
        System.out.print("\033c");

        lista.forEach((i)->{
            if(i.getIdentificacion().equals(buscado)){
                indice = lista.indexOf(i);
                validar = 1;
            }
        });
        if(validar!=1){
            System.out.println("Candidato no encontrado, por favor vuelva a intentar");
        }
        }while(validar != 1);
        int opc1 = 2;
        while(validar != 0 || opc1<1 || opc1>4){
        String posiToF = null;
        if(lista.get(indice).isDerecha()){
                        posiToF = "Derecha";
                    }
                else{
                        posiToF = "Izquierda";
                    } 
                System.out.println("------------------------------------------------------------");
                System.out.println("Nombre:     1.    \t"+lista.get(indice).getNombre());            
                System.out.println("Cedula:           \t"+lista.get(indice).getIdentificacion()+"\t(No permitido)");            
                System.out.println("Ciudad de origen: \t"+lista.get(indice).getCiudad_origen()+"\t(No permitido)");            
                System.out.println("Posición:   2.    \t"+posiToF);            
                System.out.println("Partido:    3.    \t"+lista.get(indice).getPartido_politico());            
                System.out.println("Propuestas: 4.    \t"+lista.get(indice).getPropuestas()); 
                System.out.println("\n");
        System.out.println("Ingrese el número del atributo a cambiar: ");
        opc1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("\033c");

        switch(opc1){
            case 1: System.out.println("Ingrese el nuevo nombre: ");          
                    String nombreA = scanner.nextLine();
                    System.out.print("\033c");

                    lista.get(indice).setNombre(nombreA);
                    break;
            case 2: if(lista.get(indice).isDerecha()==true){

                        if(lista.get(indice).getPartido_politico().toString().equals("Conservador")){
                            conteoConservador--;
                        }else if(lista.get(indice).getPartido_politico().toString().equals("Centro_democratico")){
                            conteoCentroDemocratico--;
                        }else{conteoCambioRadical--;}

                        lista.get(indice).setDerecha(false);
                        int variableswitch4;
                            do {
                                System.out.println("Su posición será cambiada a izquierda");
                                System.out.println("Estos son los partidos de izquierda: ");
                                System.out.println("1. "+Partido.Liberal);
                                System.out.println("2. "+Partido.Alianza_verde);
                                variableswitch4 = scanner.nextInt();
                                System.out.print("\033c");
                                
                                switch(variableswitch4){
                                case 1: {lista.get(indice).setPartido_politico(Partido.Liberal);
                                    conteoLiberal++;
                                    break;}
                                case 2: {lista.get(indice).setPartido_politico(Partido.Alianza_verde);
                                    conteoAlianzaVerde++;
                                    break;}
                                default: System.out.println("Digíte un dato válido");break;
                            }
                            }while(variableswitch4 < 1 || variableswitch4 > 2);
                    }
                    else{

                        if(lista.get(indice).getPartido_politico().toString().equals("Liberal")){
                            conteoLiberal--;
                        }else {conteoAlianzaVerde--;}

                        lista.get(indice).setDerecha(true);
                        int variableswitch3;
                        do {
                            System.out.println("Su posición será cambiada a derecha");
                            System.out.println("Estos son los partidos de derecha: ");
                            System.out.println("1. "+Partido.Conservador);
                            System.out.println("2. "+Partido.Centro_democratico);
                            System.out.println("3. "+Partido.Partido_cambio_radical);

                            variableswitch3 = scanner.nextInt(); 
                            System.out.print("\033c");
                            switch(variableswitch3){
                            case 1: {lista.get(indice).setPartido_politico(Partido.Conservador);
                                conteoConservador++;
                                break;}
                            case 2: {lista.get(indice).setPartido_politico(Partido.Centro_democratico);
                                conteoCentroDemocratico++;
                                break;}
                            case 3: {lista.get(indice).setPartido_politico(Partido.Partido_cambio_radical);
                                conteoCambioRadical++;
                                break;}
                            default: System.out.println("Digíte un dato válido");break;
                            }
                        }while(variableswitch3<1 ||  variableswitch3>3);
                    }
                    System.out.println("Posición política cambiada");
                    break;
            case 3: if(lista.get(indice).isDerecha()==true){

                        if(lista.get(indice).getPartido_politico().toString().equals("Conservador")){
                            conteoConservador--;
                        }else if(lista.get(indice).getPartido_politico().toString().equals("Centro_democratico")){
                            conteoCentroDemocratico--;
                        }else{conteoCambioRadical--;}

                        int variableswitch;
                        do {
                            System.out.println("Estos son los partidos de derecha: ");
                            System.out.println("1. "+Partido.Conservador);
                            System.out.println("2. "+Partido.Centro_democratico);
                            System.out.println("3. "+Partido.Partido_cambio_radical);

                            variableswitch = scanner.nextInt(); 
                            System.out.print("\033c");
                            switch(variableswitch){
                            case 1: {lista.get(indice).setPartido_politico(Partido.Conservador);
                                conteoConservador++;
                                break;}
                            case 2: {lista.get(indice).setPartido_politico(Partido.Centro_democratico);
                                conteoCentroDemocratico++;
                                break;}
                            case 3: {lista.get(indice).setPartido_politico(Partido.Partido_cambio_radical);
                                conteoCambioRadical++;
                                break;}
                            default: System.out.println("Digíte un dato válido");break;
                            }
                        }while(variableswitch<1 ||  variableswitch>3);
                        }else{

                            if(lista.get(indice).getPartido_politico().toString().equals("Liberal")){
                            conteoLiberal--;
                            }else {conteoAlianzaVerde--;}
                            
                            int variableswitch2;
                            do {
                                System.out.println("Estos son los partidos de izquierda: ");
                                System.out.println("1. "+Partido.Liberal);
                                System.out.println("2. "+Partido.Alianza_verde);
                                variableswitch2 = scanner.nextInt();
                                System.out.print("\033c");
                                
                                switch(variableswitch2){
                                case 1: {lista.get(indice).setPartido_politico(Partido.Liberal);
                                    conteoLiberal++;
                                    break;}
                                case 2: {lista.get(indice).setPartido_politico(Partido.Alianza_verde);
                                    conteoAlianzaVerde++;
                                    break;}
                                default: System.out.println("Digíte un dato válido");break;
                            }
                            }while(variableswitch2 < 1 || variableswitch2 > 2);
                        }
                    break;
            case 4: System.out.println("Ingrese las nuevas propuestas: ");
                    String propuestA = scanner.nextLine();
                    System.out.print("\033c");
                    lista.get(indice).setPropuestas(propuestA);
                    break;
            default: System.out.println("Dígite algo válido: ");
                     break;
                    }
            validar = 0;
        }
                         
    }

    public static void eliminarCandidato(){
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cédula del candidato a eliminar: ");
        String buscado = scanner.nextLine();
        System.out.print("\033c");

        for(int i = 0; i < FuncionesCandidato.lista.size(); i++){
            if(FuncionesCandidato.lista.get(i).getIdentificacion().equals(buscado)){
                if(lista.get(indice).getPartido_politico().toString().equals("Conservador")){
                    conteoConservador--;
                }else if(lista.get(indice).getPartido_politico().toString().equals("Centro_democratico")){
                    conteoCentroDemocratico--;
                }else if(lista.get(indice).getPartido_politico().toString().equals("Partido_cambio_radical")){
                    conteoCambioRadical--;
                }else if(lista.get(indice).getPartido_politico().toString().equals("Liberal")){
                    conteoLiberal--;
                }else{conteoAlianzaVerde--;}
                
                FuncionesCandidato.lista.remove(i);
            }
        }

    }
    public static void asignarVotos(){
        Scanner scanner = new Scanner(System.in);

        lista.forEach((i)->{
            System.out.println("Asigna la cantidad de votos para el candidato "+ i.getNombre());
            int votos = scanner.nextInt();
            i.setNumero_votos(votos);
            if(votos > mas_votos){
                ganador = i;
                mas_votos = votos;
            }
             System.out.print("\033c");   
        });
    }

    public static void ContarPorPartido(){
        String nombreCiudad="";
        int partidoMayor=-1;

        if(conteoAlianzaVerde>partidoMayor){
            nombreCiudad = Partido.Alianza_verde.toString();
            partidoMayor = conteoAlianzaVerde;
        }if (conteoCambioRadical > partidoMayor){
            partidoMayor = conteoCambioRadical;
            nombreCiudad = Partido.Partido_cambio_radical.toString();
        }if (conteoCentroDemocratico > partidoMayor){
            partidoMayor = conteoCentroDemocratico;
            nombreCiudad = Partido.Centro_democratico.toString();
        }if (conteoConservador > partidoMayor){
            partidoMayor = conteoConservador;
            nombreCiudad = Partido.Conservador.toString();
        }if (conteoLiberal > partidoMayor){
            partidoMayor = conteoLiberal;
            nombreCiudad = Partido.Liberal.toString();
        }

        System.out.println("El partido con más candidatos fue: " + nombreCiudad);
        pressEnterToContinue();
        System.out.print("\033c");
    }

    public static void ordenar(){
        lista.forEach((i)->{
            if(i.getCiudad_origen().equals(Ciudades.Cali)){
                conteoCali++;
            }else if(i.getCiudad_origen().equals(Ciudades.Buenaventura)){
                conteoBuenaventura++;
            }else if(i.getCiudad_origen().equals(Ciudades.Buga)){
                conteoBuga++;
            }else if(i.getCiudad_origen().equals(Ciudades.Caicedonia)){
                conteoCaicedonia++;
            }else if(i.getCiudad_origen().equals(Ciudades.Candelaria)){
                conteoCandelaria++;
            }else if(i.getCiudad_origen().equals(Ciudades.Cartago)){
                conteoCartago++;
            }else if(i.getCiudad_origen().equals(Ciudades.Cerrito)){
                conteoCerrito++;
            }else if(i.getCiudad_origen().equals(Ciudades.Dagua)){
                conteoDagua++;
            }else if(i.getCiudad_origen().equals(Ciudades.Florida)){
                conteoFlorida++;
            }else if(i.getCiudad_origen().equals(Ciudades.Ginebra)){
                conteoGinebra++;
            }else if(i.getCiudad_origen().equals(Ciudades.Guacari)){
                conteoGuacari++;
            }else if(i.getCiudad_origen().equals(Ciudades.Jamundi)){
                conteoJamundi++;
            }else if(i.getCiudad_origen().equals(Ciudades.Launion)){
                conteoLaUnion++;
            }else if(i.getCiudad_origen().equals(Ciudades.Launion)){
                conteoLaUnion++;
            }else if(i.getCiudad_origen().equals(Ciudades.Palmira)){
                conteoPalmira++;
            }else if(i.getCiudad_origen().equals(Ciudades.Pradera)){
                conteoPradera++;
            }else if(i.getCiudad_origen().equals(Ciudades.Roldanillo)){
                conteoRoldanillo++;
            }else if(i.getCiudad_origen().equals(Ciudades.Rozo)){
                conteoRozo++;
            }else if(i.getCiudad_origen().equals(Ciudades.Sevilla)){
                conteoSevilla++;
            }else if(i.getCiudad_origen().equals(Ciudades.Tulua)){
                conteoTulua++;
            }else if(i.getCiudad_origen().equals(Ciudades.Yumbo)){
                conteoYumbo++;
            }else if(i.getCiudad_origen().equals(Ciudades.Zarzal)){
                conteoZarzal++;
            }
        });

        // Crear un HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(conteoCali, Ciudades.Cali.toString());
        hashMap.put(conteoBuenaventura, Ciudades.Buenaventura.toString());
        hashMap.put(conteoBuga, Ciudades.Buga.toString());
        hashMap.put(conteoCaicedonia, Ciudades.Caicedonia.toString());
        hashMap.put(conteoCandelaria , Ciudades.Candelaria.toString());
        hashMap.put(conteoCartago , Ciudades.Cartago.toString());
        hashMap.put(conteoCerrito , Ciudades.Cerrito.toString());
        hashMap.put(conteoDagua , Ciudades.Dagua.toString());
        hashMap.put(conteoFlorida , Ciudades.Florida.toString());
        hashMap.put(conteoGinebra , Ciudades.Ginebra.toString());
        hashMap.put(conteoGuacari , Ciudades.Guacari.toString());
        hashMap.put(conteoJamundi , Ciudades.Jamundi.toString());
        hashMap.put(conteoLaUnion , Ciudades.Launion.toString());
        hashMap.put(conteoPalmira , Ciudades.Palmira.toString());
        hashMap.put(conteoPradera , Ciudades.Pradera.toString());
        hashMap.put(conteoRoldanillo , Ciudades.Roldanillo.toString());
        hashMap.put(conteoRozo , Ciudades.Rozo.toString());
        hashMap.put(conteoSevilla , Ciudades.Sevilla.toString());
        hashMap.put(conteoTulua , Ciudades.Tulua.toString());
        hashMap.put(conteoYumbo , Ciudades.Yumbo.toString());
        hashMap.put(conteoZarzal , Ciudades.Candelaria.toString());


        // Crear un TreeMap a partir del HashMap para ordenar por claves
        TreeMap<Integer , String> treeMap = new TreeMap<>(hashMap);

        // Iterar a través del TreeMap (ordenado por claves)
        int contF = 1;
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            if(entry.getKey() != 0){
                    System.out.println("Top " + contF + "\tCandidatos: " + entry.getKey() + ", Ciudad: " + entry.getValue());
                    contF ++;
            }
            continue;
        }
        pressEnterToContinue();
    }
    
}


