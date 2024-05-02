package uam.fundamentos.mcm;

import java.util.Scanner;

public class App {

  private static Scanner scanner;
  
  private static int calcularMCD(int a, int b){
    if (a%b == 0)
      return b;
    else
      return calcularMCD(b, a % b);
  }

  public static void calcuclarMCM(int a, int b, int[] resultado){
    int mcd = calcularMCD(a, b);
    resultado[0] = a * b / mcd;
  }
  public static void main(String[] args) {
    scanner = new Scanner(System.in);

    System.out.print("Ingresa el primer número...");
    int num1 = scanner.nextInt();
    System.out.print("Ingresa el segundo número...");
    int num2 = scanner.nextInt();
    
    int[] respuesta = new int[1];
    calcuclarMCM(num1, num2, respuesta);
    System.out.println("\nEl  MCM de " + num1 + " y " + num2 + " es: " + respuesta[0]); 
  }
}


