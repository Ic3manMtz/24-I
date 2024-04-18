package uam.apanloo.problema1;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Recursividad recursividad =  new Recursividad();
    Scanner sc = new Scanner(System.in);

    int a, b;

    System.out.print("Ingresa el valor de a...");
    a = sc.nextInt();
    System.out.print("Ingresa el valor de b...");
    b = sc.nextInt();

    System.out.println("El MCD de "+a+" y "+b+" es de "+recursividad.mcd(a, b));

    sc.close();
  }
}
