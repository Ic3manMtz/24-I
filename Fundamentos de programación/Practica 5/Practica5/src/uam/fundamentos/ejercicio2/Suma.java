package uam.fundamentos.ejercicio2;

import java.util.Scanner;

public class Suma {
  public static int suma(int x, int y){
    return x+y;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x, y;
    
    System.out.print("Ingresa el primer sumando...");
    x = sc.nextInt();
    System.out.print("Ingresa el segundo sumando...");
    y = sc.nextInt();

    System.out.println("El resultado de la suma es "+suma(x, y));

    sc.close();
  }
}





