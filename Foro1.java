import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Foro1 {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        var validator = true;

        while (validator) {
            System.out.println("*******************************************");
            System.out.println("Bienvenido a la base de alumnos UDB VIRTUAL");
            System.out.println("*******************************************");
            System.out.println("a. Ingreso de nuevo alumno (carnet/Nombre completo):");
            System.out.println("b. Búsqueda de alumno, búsqueda por carnet:");
            System.out.println("c. Eliminación de alumno, búsqueda por carnet:");
            System.out.println("d. Mostrar todos los alumnos ingresados:");
            System.out.println("e. Salir\n");

            System.out.print("Por favor seleccione una opción: ");

            //Variables globales
            String option = input.nextLine();
            limpiarConsola();
            String carnet = "";
            String nombre = "";

            switch (option.toLowerCase()) {
                case "a":
                    limpiarConsola();
                    System.out.println("Ingrese el carnet del alumno: ");
                    carnet = input.nextLine();

                    if (students.containsKey(carnet)) {
                        System.out.println("Este carnet ya ha sido registrado. Intente con otro.");
                        break;
                    }

                    System.out.println("Ingrese el nombre completo del alumno: ");
                    nombre = input.nextLine();

                    students.put(carnet, nombre);
                    System.out.println("Alumno ingresado exitosamente.");
                    break;

                case "b":
                    limpiarConsola();
                    System.out.print("Ingrese el carnet del estudiante: ");
                    carnet = input.nextLine();

                    if (students.containsKey(carnet)){
                        String nameStudent = students.get(carnet);
                        System.out.println("Carnet: " + carnet + " Nombre: " + nameStudent);
                    }
                    else {
                        System.out.println("Alumno no encontrado, no se puede mostrar un resultado");
                    }
                    break;
                case "c":
                    limpiarConsola();
                    System.out.println("Ingrese el carnet del alumno que desea eliminar: ");
                    carnet = input.nextLine();
                    if (students.containsKey(carnet)){
                        students.remove(carnet);
                        System.out.println("Alumno fue eliminado correctamente.");
                    }
                    else {
                        System.out.println("Alumno no encontrado, por favor vuelva a intentarlo.");
                    }
                    break;
                case "d":
                    limpiarConsola();
                    System.out.println("Listado de alumnos:");
                    for (Map.Entry<String, String> entry : students.entrySet()){
                        System.out.println("Carnet: " + entry.getKey() + " Nombre: " + entry.getValue());
                    }
                    break;
                case "e":
                    validator = false;
                    break;
                default:
                    limpiarConsola();
                    System.out.println("Opción no válida. Por favor intente de nuevo.");
                    break;
            }

            // Pausar para que el usuario pueda leer el mensaje antes de limpiar la consola.
           System.out.println("\nPresione Enter para continuar.");
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


