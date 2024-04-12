package uam.fundamentos.algoritmos;

import java.util.Scanner;

public class Fibonacci {
  public static int fibonacci(int n) {
    int actual=1, anterior=1;
    
    if(n <= 1)
      return  n;

    for(int i=2; i<n; i++){
      int temp=actual;
      actual = actual + anterior;
      anterior = temp;
    }

    return actual;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Ingresa el valor n de Fibonacci que quieres encontrar...");
    int n = sc.nextInt();

    System.out.println("El número "+n+" de Fibonacci es "+fibonacci(n));
    sc.close();
  }
}

