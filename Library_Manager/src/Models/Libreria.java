package Models;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Libreria implements Iterator <Libro>{
    private List<Libro> libros;

    public Libreria(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void ordenarLibros(){
        Collections.sort(libros, new LibroComparator());
    }

    public void agregarLibro(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del libro: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();

        System.out.print("Ingrese el año de publicacion del libro: ");
        int añoPublicacion = scanner.nextInt();

        System.out.print("Ingrese el ISBN del libro: ");
        Integer isbn = scanner.nextInt();

        Libro libroAAgregar = new Libro(nombre, autor,añoPublicacion, isbn);
        int index = Collections.binarySearch(libros, libroAAgregar, new LibroComparator());
        if (index >= 0){
            System.out.println("El libro ya está registrado en la biblioteca.");
        }else{
            libros.add(libroAAgregar);
            ordenarLibros();
            System.out.println("El libro ha sido agregado exitosamente.");
        }
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        ordenarLibros();

        Libro libroABuscar = new Libro(titulo,"",0,0);

        int index = Collections.binarySearch(libros, libroABuscar, new TituloComparator());

        if (index >= 0){
            return libros.get(index);
        } else {
            return null;
        }
    }

    public void eliminarLibro(){
        Iterator<Libro> iterator = this.iterator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del libro que desea eliminar: ");
        String titulo = scanner.nextLine();

        Libro libroAEliminar = buscarLibroPorTitulo(titulo);

        if (libroAEliminar != null){
            libros.remove(libroAEliminar);
            System.out.println("El libro se ha eliminado correctamente!");
        }else{
            System.out.println("No existe el libro indicado.");
        }
    }

    public Iterator<Libro> iterator() {
        return libros.iterator();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Libro next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    public void mostrarLibros(){
        this.libros.forEach(System.out::println);
    }
}
