package uam.fundamentos.referencia;

import java.util.Scanner;

public class Racionales {
  private static Scanner scanner;

  public static int[] calculadora(int a, int b, int c, int d){
    int[] resultados = new int[8];
    resultados[0] = (a*d) + (b*c);
    resultados[1] = b*d;

    resultados[2] = (a*d) - (b*c);
    resultados[3] = resultados[1];

    resultados[4] = a*c;
    resultados[5] = b*d;

    resultados[6] = a*d;
    resultados[7] = b*c;

    return resultados;
}
  public static void main(String[] args) {
    int[] resultados = new int[8];
    scanner = new Scanner(System.in);
    
    System.out.println("\n\tCALCULADORA DE NUMEROS RACIONALES");
    System.out.print("Ingresa el numerador del primero número racional...");
    int numerador1 = scanner.nextInt();
    System.out.print("Ingresa el denominador del primer número racional...");
    int denominador1 = scanner.nextInt();
    System.out.print("Ingresa el numerador del segundo número racional...");
    int numerador2 = scanner.nextInt();
    System.out.print("Ingresa el denominador del segundo número racional...");
    int denominador2 = scanner.nextInt();
    resultados = calculadora(numerador1, denominador1, numerador2, denominador2);

    System.out.println("\nOperaciones realizadas son");
    System.out.println("\tSuma: ("+numerador1+"/"+denominador1+") + ("+numerador2+"/"+denominador2+") = "+resultados[0]+"/"+resultados[1]);
    System.out.println("\tResta: ("+numerador1+"/"+denominador1+") - ("+numerador2+"/"+denominador2+") = "+resultados[2]+"/"+resultados[3]);
    System.out.println("\tMultiplicacion: ("+numerador1+"/"+denominador1+") * ("+numerador2+"/"+denominador2+") = "+resultados[4]+"/"+resultados[5]);
    System.out.println("\tDivision: ("+numerador1+"/"+denominador1+") / ("+numerador2+"/"+denominador2+") = "+resultados[6]+"/"+resultados[7]);

  }
}
