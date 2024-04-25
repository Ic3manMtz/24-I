package uam.fundamentos.tablas;

import java.util.Scanner;

public class App {
  public static void calcularTablaMultiplicar(int n){
    for(int i=0; i<10; i++)
      System.out.println(n+" x "+(i+1)+" = " + (n*(i+1)));
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Escribe el número del que quieres saber la tabla de multiplicar...");
    int numero = sc.nextInt();

    calcularTablaMultiplicar(numero);
    sc.close();
  }
}


