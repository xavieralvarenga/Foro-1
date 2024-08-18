import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Foro1 {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("*******************************************");
            System.out.println("Bienvenido a la base de alumnos UDB VIRTUAL");
            System.out.println("*******************************************");
            System.out.println("Por favor seleccione una opción:");
            System.out.println("a. Ingreso de nuevo alumno (carnet/Nombre completo):");
            System.out.println("b. Búsqueda de alumno, búsqueda por carnet:");
            System.out.println("c. Eliminación de alumno, búsqueda por carnet:");
            System.out.println("d. Mostrar todos los alumnos ingresados:");
            System.out.println("e. Salir\n");

            String option = input.nextLine();

            switch (option.toLowerCase()) {
                case "a":
                    limpiarConsola();
                    System.out.println("Ingrese el carnet del alumno: ");
                    String carnet = input.nextLine();

                    if (students.containsKey(carnet)) {
                        System.out.println("Este carnet ya ha sido registrado. Intente con otro.");
                        break;
                    }

                    System.out.println("Ingrese el nombre completo del alumno: ");
                    String nombre = input.nextLine();

                    students.put(carnet, nombre);
                    System.out.println("Alumno ingresado exitosamente.");
                    break;

                // Otras opciones (b, c, d, e) aquí...

                default:
                    limpiarConsola();
                    System.out.println("Opción no válida. Por favor intente de nuevo.");
                    break;
            }

            // Pausar para que el usuario pueda leer el mensaje antes de limpiar la consola.
            System.out.println("\nPresione Enter para continuar...");
            input.nextLine();
            limpiarConsola();
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


