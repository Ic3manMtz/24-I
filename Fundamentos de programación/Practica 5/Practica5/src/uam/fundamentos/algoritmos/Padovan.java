package uam.fundamentos.algoritmos;

import java.util.Scanner;

public class Padovan {
  public static int padovan(int n){
    if(n <= 2)
      return 1;

    int[] padovan = new int[n+1];
    padovan[0] = 1;
    padovan[1] = 1;
    padovan[2] = 1;

    for(int i=3; i<=n; i++){
      padovan[i] = padovan[i-2] + padovan[i-3];
    }

    return padovan[n];
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Ingresa el valor n de Padovan que quieres encontrar...");
    int n = sc.nextInt();

    System.out.println("El número "+n+" de Padovan es "+padovan(n));
    sc.close();
  }
}


