import java.util.ArrayList;
import java.util.Collection;

class Libro {
    String titulo;

    Libro(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return titulo;
    }
}

public class EjemploCollection {
    public static void main(String[] args) {
        Collection<Libro> libros = new ArrayList<>();

        // Agregar libros
        libros.add(new Libro("Programación en Java"));
        libros.add(new Libro("Inteligencia Artificial"));
        libros.add(new Libro("Bases de Datos"));

        // Mostrar libros
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
