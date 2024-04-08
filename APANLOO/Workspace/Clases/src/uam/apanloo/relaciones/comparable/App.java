package uam.apanloo.relaciones.comparable;

import  java.util.Arrays;
import java.util.GregorianCalendar;

public class App {
  public static void main(String[] args){
    Libro[] libros = new Libro[2];
    Libro l1 = new Libro();

    l1.setAutor("Erl");
    l1.setTitulo("Service Oriented Arc...");
    GregorianCalendar fecha1 =  new GregorianCalendar(2018, 11, 11);
    l1.setFpublicacion(fecha1);
    l1.setIsbn("978");
    System.out.println(l1);

    GregorianCalendar f2 = new GregorianCalendar(2017, 7, 7);
    Libro l2 = new Libro("Joyanes", "Big Data", f2,"842-3-16-148410-0");
    System.out.println(l2);
    
    System.out.println("Resultados de compareTo: ");
    System.out.println(l1.compareTo(l2));
    System.out.println(l1.compareTo(l1));
    System.out.println(l2.compareTo(l1));

    libros[0] = l1;
    libros[1] = l2;

    System.out.println("Impresion del arreglo");
    System.out.println(Arrays.toString(libros));

    Arrays.sort(libros);

    System.out.println("Impresion del arreglo ordenado");
    System.out.println(Arrays.toString(libros));
  }
}
