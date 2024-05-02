package Prefijos;

import java.util.Random;

public class Principal {
    private static Random random = new Random();
  private static final int N = 5;

  public static void imprimir(int[] x){
    for(int i=0; i<x.length; i++)
      System.out.print(x[i]+" ");

    System.out.println();
  }

  public static void sumarPrefijos(int[] x, int[] y){
    int suma = 0;
    for (int i = 0; i < N; ++i){
      suma += x[i];
      y[i] = suma;
    }
  }

  public static void main(String[] args) {
    int[] x = new int[N];
    int[] y = new int[N];

    for(int i=0; i<N; i++)
      x[i] = random.nextInt(20)+1; // A
      
    sumarPrefijos(x, y);

    System.out.println("Arreglo x");
    imprimir(x);
    System.out.println("Arreglo y");
    imprimir(y);
  }
}
