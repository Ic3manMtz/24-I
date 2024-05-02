package Invertir;

import java.util.Random;

public class Principal {
  private static Random random = new Random();
  private static final int N = 20;

  public static void invertirArreglo(int[] arreglo){
    for(int i=0; i<N/2; i++){
      int  temp = arreglo[i];
      arreglo[i] = arreglo[N-1-i];
      arreglo[N-1-i] = temp;
    }
  }

  public static void imprimir(int[] x){
    for(int i=0; i<x.length; i++)
      System.out.print(x[i]+" ");

    System.out.println();
  }


  public static void main(String[] args) {
    int[] x = new int[N];

    for(int i=0; i<N; i++)
      x[i] = random.nextInt(20)+1; // A
      
      
    System.out.print("Array original: \n");
    imprimir(x);
    
    System.out.print("\n\nArray invertido:\n");
    invertirArreglo(x);
    imprimir(x);
  }
}
