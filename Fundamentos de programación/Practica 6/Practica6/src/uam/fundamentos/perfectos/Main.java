package uam.fundamentos.perfectos;

import java.util.Scanner;

public class Main {
  public static boolean esPerfecto(int numero){
    int suma=0;
    for(int i=1; i<numero; i++){
      if(numero%i == 0)
        suma+=i;
    }

    return suma==numero;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa cuántos números perfectos quieres encontrar...");
    int cantidad = sc.nextInt();
    int numero=2, contador=0;

    while(contador < cantidad){
      if(esPerfecto(numero)){
        System.out.println(numero + " es un número perfecto.");
        contador++;
      }
      numero++;
    }

    sc.close();
  }
}
