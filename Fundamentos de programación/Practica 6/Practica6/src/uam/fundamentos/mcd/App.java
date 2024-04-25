package uam.fundamentos.mcd;

import java.util.Scanner;

public class App {

  public static int mcd(int a, int b){
    if (a%b == 0)
      return b;
    else
      return mcd(b, a % b);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a, b;
  
    System.out.print("Ingresa el valor de a...");
    a = sc.nextInt();
    System.out.print("Ingresa el valor de b...");
    b = sc.nextInt();
  
    System.out.println("El MCD de "+a+" y "+b+" es de "+mcd(a, b));
  
    sc.close();
  }

}

