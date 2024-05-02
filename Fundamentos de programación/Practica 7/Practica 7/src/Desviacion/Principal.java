package Desviacion;

import java.util.Random;

public class Principal {
  private static Random random = new Random();
  private static final int N = 20;

  public static double calcularDesviacionStd(int[] x){
    double desvStd = 0.0;
    double promedio = calcularPromedio(x);

    for(int i=0; i<x.length; i++){
      desvStd += Math.pow((x[i] - promedio),2);
    }

    return Math.sqrt(desvStd/(N-1));
  }

  private static double calcularPromedio(int[] x) {
    double promedio = 0.0;

    for(int i=0; i<x.length; i++)
      promedio+=x[i];

    return  promedio/N;
  }

  private static void mostrarArreglo(int[] arreglo){
    for(int i=0; i<arreglo.length; i++)
      System.out.print(arreglo[i]+" ");
    
    System.out.println("");
  }
  public static void main(String[] args) {
    int[] x = new int[N];

    for(int i=0; i<N; i++)
      x[i] = random.nextInt(100)+1; // A

    System.out.println("Muestra de datos a analizar");
    mostrarArreglo(x);

    System.out.println("\nEl promedio de la muestra es "+calcularPromedio(x));
    System.out.println("La desviación estándar de la muestra es de "+calcularDesviacionStd(x));
  }
}
