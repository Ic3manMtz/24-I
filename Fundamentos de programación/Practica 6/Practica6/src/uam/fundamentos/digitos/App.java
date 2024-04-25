package uam.fundamentos.digitos;

import java.util.Scanner;

public class App {
  public static int numeroDigitos(int numero){
    int digitos=0;

    while(numero != 0) {
      numero = numero / 10;
      digitos++;
    }

    return digitos;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Escribe un número entero para contar sus dígitos...");
    int numero = sc.nextInt();

    System.out.println("El número "+numero+" tiene "+numeroDigitos(numero)+" dígito(s).");
    sc.close();
  }
}


