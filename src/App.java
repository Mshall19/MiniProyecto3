
import java.util.Scanner;
import vista.VistaConsola;
import vista.VistaGUI;

public class App {   
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        String opcion;
            
        do {
            System.out.print("\n¿Desea continuar ejecutando el programa en consola? (S/N): ");
            opcion = sn.nextLine();
        } while (!opcion.equalsIgnoreCase("S") && 
                 !opcion.equalsIgnoreCase("N") && 
                 !opcion.equalsIgnoreCase("n"));

            if (opcion.equalsIgnoreCase("S") || 
                opcion.equalsIgnoreCase("s")) {
                VistaConsola.main(args);
            } else {
                VistaGUI();
            }
            sn.close();
        }
}

