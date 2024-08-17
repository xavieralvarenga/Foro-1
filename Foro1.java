import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Foro1 {
    public static void main(String[] args) {

        System.out.println("*******************************************");
        System.out.println("Bienvenido a la base de alumnos UDB VIRTUAL");
        System.out.println("*******************************************");

        System.out.println("Por favor seleccione una opción:");
        System.out.println("a. Ingreso de nuevo alumno (carnet/Nombre completo):");
        System.out.println("b. Búsqueda de alumno, búsqueda por carnet:");
        System.out.println("c. Eliminación de alumno, búsqueda por carnet:");
        System.out.println("d. Mostrar todos los alumnos ingresados:\n");

        Scanner input = new Scanner(System.in); //Inicializamos el código scanner para leer la entrada del usuario
        String option = input.nextLine(); //Utilizamos el objeto Scanner llamado input para leer toda la entrada

        switch (option){
            case ("a"):
                //Falta colocar el método para borrar en consola sin perder lo ingresado
                limpiarConsola();
                System.out.println("Ingreso de nuevo usuario."); //Mensaje solo para probar si funciona la estructura
                break;
            case ("b"):
                //Testing
                limpiarConsola();
                System.out.println("Por favor introduzca el carnet: ");
                break;
        }
        
    }
    public static void limpiarConsola() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                // Limpia consola Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Limpia consola Linux y Mac
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
