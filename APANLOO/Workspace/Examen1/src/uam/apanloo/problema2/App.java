package uam.apanloo.problema2;

import java.util.Random;

public class App {
  private static Random rand = new Random();

  public static void llenarArreglo(int[] arreglo){
    for(int i=0 ;i<arreglo.length; i++)
      arreglo[i] = rand.nextInt(1000);
  }

  public static void mostrarArreglo(int[] arreglo){
    for(int i=0; i<arreglo.length; i++)
      System.out.print(arreglo[i]+" ");
  }

  public static void ordenarBurbuja(int[] arreglo){
    for (int i = 0; i < arreglo.length-1; i++) {
      for (int j = 0; j < arreglo.length-i-1; j++) {
          if (arreglo[j] > arreglo[j+1]) {
              // intercambiar array[j+1] y array[i]
              int temp = arreglo[j];
              arreglo[j] = arreglo[j+1];
              arreglo[j+1] = temp;
          }
      }
    }
  }

  public static void main(String[] args) {
    int[] arreglo = new int[rand.nextInt(30+5)];

    llenarArreglo(arreglo);
    System.out.println("\nArreglo desordenado");
    mostrarArreglo(arreglo);

    ordenarBurbuja(arreglo);
    System.out.println("\nArreglo ordenado");
    mostrarArreglo(arreglo);
  }
}
