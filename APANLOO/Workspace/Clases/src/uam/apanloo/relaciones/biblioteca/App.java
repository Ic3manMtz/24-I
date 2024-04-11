package uam.apanloo.relaciones.biblioteca;

import java.util.LinkedList;

public class App {
  public static void main(String[] args) {
    Biblioteca biblioteca =  new Biblioteca();
    Editorial editorial =  new Editorial();
    Libro l1 = new Libro("Z", "Jorge Martinez", "a", 1, 1, 2024, "Español", editorial);
    Libro l2 = new Libro("M", "Jorge Martinez", "z", 1, 1, 2024, "Español", editorial);
    Libro l3 = new Libro("N", "Jorge Martinez", "c", 1, 1, 2024, "Español", editorial);
    Libro l4 = new Libro("A", "Jorge Martinez", "b", 1, 1, 2024, "Español", editorial);
    Libro l5 = new Libro("J", "Jorge Martinez", "f", 1, 1, 2024, "Español", editorial);
    Libro l6 = new Libro("K", "Jorge Martinez", "t", 1, 1, 2024, "Español", editorial);

    biblioteca.agregarLibro(l1);
    biblioteca.agregarLibro(l2);
    biblioteca.agregarLibro(l3);
    biblioteca.agregarLibro(l4);
    biblioteca.agregarLibro(l5);
    biblioteca.agregarLibro(l6);

    System.out.println(biblioteca.contarLibros() + " libros en la biblioteca");

    LinkedList<Libro> listaOrdenada = (LinkedList<Libro>) biblioteca.ordernarLibros("titulo");

    for (Libro libro : listaOrdenada) {
      System.out.println(libro);
    }

    if(biblioteca.eliminarLibro("t")!=null){
        System.out.println("Libro eliminado correctamente");
    }

    System.out.println(biblioteca.contarLibros());
  }
}
