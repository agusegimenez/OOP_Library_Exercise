package Models;

import java.util.Comparator;

public class LibroComparator implements Comparator<Libro> {

    @Override
    public int compare(Libro o1, Libro o2) {
        int result = o1.getTitulo().compareTo(o2.getTitulo());

        if (result == 0) {
            result = o1.getAutor().compareTo(o2.getAutor());
        }

        if (result == 0) {
            result = o1.getAñoPublicacion().compareTo(o2.getAñoPublicacion());
        }

        return result;
    }
}
