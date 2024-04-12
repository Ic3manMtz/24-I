package uam.fundamentos.algoritmos;

import java.util.Scanner;

public class Factorial {
  public static int factorial(int n){
    int resultado=1;
    for(int i=2; i<=n; i++)
      resultado *= i;
    
      return resultado;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Ingresa el valor n para calcular su factorial...");
    int n = sc.nextInt();

    System.out.println("El número factorial de "+n+"! es "+factorial(n));
    sc.close();
  }
}


