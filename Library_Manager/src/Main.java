import Models.Libreria;
import Models.Libro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Libro> listaLibros = new ArrayList<>();
        Libreria libreria = new Libreria(listaLibros);
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Gestor de Biblioteca");
            System.out.println("1. Agregar un libro");
            System.out.println("2. Buscar un libro por título");
            System.out.println("3. Eliminar un libro");
            System.out.println("4. Mostrar todos los libros");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    libreria.agregarLibro();
                    break;
                case 2:
                    System.out.print("Ingrese el título del libro que desea buscar: ");
                    String titulo = scanner.nextLine();
                    Libro libroBuscado = libreria.buscarLibroPorTitulo(titulo);
                    if (libroBuscado != null) {
                        System.out.println("Libro encontrado:\n" + libroBuscado);
                    } else {
                        System.out.println("El libro no fue encontrado.");
                    }
                    break;
                case 3:
                    libreria.eliminarLibro();
                    break;
                case 4:
                    System.out.println("Lista de libros en la biblioteca:");
                    libreria.mostrarLibros();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
            }
        } while (opcion != 5);
    }
}