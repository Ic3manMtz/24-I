package uam.fundamentos.formulas.ejercicios;

import java.util.Scanner;

public class Distancia {
  public static double calcularDistancia(int x1, int y1, int x2, int y2){
    return  Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x1, y1, x2, y2;

    System.out.println("Calculadora de distancia entre dos puntos");
    System.out.print("Ingresa el valor de x1...");
    x1 = sc.nextInt();
    System.out.print("Ingresa el valor de y1...");
    y1 = sc.nextInt();
    System.out.print("Ingresa el valor de x2...");
    x2 = sc.nextInt();
    System.out.print("Ingresa el valor de y2: ");
    y2 = sc.nextInt();
    
    double distancia = calcularDistancia(x1,y1,x2,y2);

    System.out.println("La distancia entre los puntos ("+x1+","+y1+") y ("+x2+","+y2+") es de "+distancia);

    sc.close();
  }
}



