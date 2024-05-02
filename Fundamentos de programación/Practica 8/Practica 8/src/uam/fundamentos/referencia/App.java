package uam.fundamentos.referencia;

import java.util.Scanner;

public class App {

  private static Scanner scanner;
  
  public static void calculadora(int  num1, int num2, int suma, int resta, int multiplicacion, int division) {
    suma=num1+num2;
    System.out.println();
    System.out.println("\tLa suma dentro del método de "+num1+"+"+num2+" = "+suma);
    resta=num1-num2;
    System.out.println("\tLa resta dentro del método de "+num1+"-"+num2+" = "+resta);
    multiplicacion=num1*num2;
    System.out.println("\tLa multiplicación dentro del método de "+num1+"x"+num2+" = "+multiplicacion);
    division=num1/num2;
    System.out.println("\tLa división dentro del método de "+num1+"/"+num2+" = "+division+"\n");
  }

  public static void calculadora(int num1, int num2, int[] resultados){
    resultados[0]=num1+num2;
    resultados[1]=num1-num2;
    resultados[2]=num1*num2;
    resultados[3]=num1/num2;
  }

  public static void main(String[] args) {
    int[] resultados = new int[4];
    scanner = new Scanner(System.in);

    System.out.println("\n\tCALCULADORA DE NUMEROS ENTEROS");
    
    System.out.print("Ingresa el primer número...");
    int num1 = scanner.nextInt();
    System.out.print("Ingresa el segundo número...");
    int num2 = scanner.nextInt();
    calculadora(num1, num2, resultados);

    System.out.println("\tLa suma en el main de "+num1+"+"+num2+" = "+resultados[0]);
    System.out.println("\tLa resta en el main de "+num1+"-"+num2+" = "+resultados[1]);
    System.out.println("\tLa multiplicación en el main de "+num1+"x"+num2+" = "+resultados[2]);
    System.out.println("\tLa división en el main de "+num1+"/"+num2+" = "+resultados[3]);
  }
}




