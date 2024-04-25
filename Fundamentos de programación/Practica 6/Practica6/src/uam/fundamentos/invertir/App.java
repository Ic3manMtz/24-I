package uam.fundamentos.invertir;

import java.util.Scanner;

public class App {
  public static void invertir(int numero){
    int numeroInverso = 0;
    while (numero != 0) {
      int digito = numero % 10;
      numeroInverso = numeroInverso * 10 + digito;
      numero /= 10;
    }
    System.out.println("El número en sentido inverso es: " + numeroInverso);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese un número para invertirlo...");
    int numero = sc.nextInt();

    invertir(numero);
    sc.close();
  }
}


