import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Aplicación uso de List en JAVA
public class ListJava {
    public static void main(String[] args) {
        List<String> librosUDB = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenidos a la biblioteca UDB Virtual.");

        librosUDB.add("Economía: Una introducción de Mankiw");
        librosUDB.add("El gen egoísta de Richard Dawkins");
        librosUDB.add("El origen de las especies");

        System.out.print("¿Deseas ver nuestro catálogo de libros virtuales? (yes/no): ");
        String inputUsuario = input.nextLine().toLowerCase();

        if (inputUsuario.equals("yes")){
            for (String libro : librosUDB){
                System.out.println("Nombre: " + libro);
            }
        }
        else {
            System.out.println("Gracias por ingresar, vuelve pronto");
        }
    }
}
