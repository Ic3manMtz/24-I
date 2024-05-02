package Arreglos;

public class Principal {

  public static void imprimir(int[] x){
    for(int i=0; i<x.length; i++)
      System.out.println(x[i]);
  }

  public static void duplicarValores(int[] x){
    for(int i=0; i<x.length; i++)
      x[i] *= 2;
  }


  public static void main(String[] args) {
    int[] x = new int[5];

    for(int i=0; i<x.length; i++)
      x[i] = i+1;

    imprimir(x);

    duplicarValores(x);
    System.out.println("Valores duplicados");
    imprimir(x);
  }
}
