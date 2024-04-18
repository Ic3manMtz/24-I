package uam.apanloo.problema3;

import java.util.Random;

public class App {
  private static Random rand = new Random();

  public static void llenarArreglo(int[] arreglo){
    for(int i=0 ;i<arreglo.length; i++)
      arreglo[i] = rand.nextInt(1000);
  }

  private static void ordenarBurbuja(int[] arreglo){
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

  public static void mostrarArreglo(int[] arreglo){
    for(int i=0; i<arreglo.length; i++)
      System.out.print(arreglo[i]+" ");
  }

  public static int encontrarNumero(int[] arreglo){
    ordenarBurbuja(arreglo);
    return arreglo[arreglo.length-2];
  }

  public static void main(String[] args) {

    int[] arreglo =  new int[rand.nextInt(20)];

    llenarArreglo(arreglo);
    System.out.println("Arreglo generado");
    mostrarArreglo(arreglo);

    System.out.println("\n\n\tEl segundo número más grande del arreglo es "+encontrarNumero(arreglo));
  }
}
