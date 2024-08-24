import java.util.HashMap;
import java.util.Map;

public class EjemploMap {
    public static void main(String[] args) {
        // Crear un Map para almacenar libros (ISBN -> Título)
        Map<String, String> libros = new HashMap<>();

        // Agregar libros
        libros.put("978-1234567890", "Programación en Java");
        libros.put("978-0987654321", "Inteligencia Artificial");
        libros.put("978-1122334455", "Bases de Datos");

        // Mostrar libros
        for (Map.Entry<String, String> libro : libros.entrySet()) {
            System.out.println("ISBN: " + libro.getKey() + ", Título: " + libro.getValue());
        }
    }
}