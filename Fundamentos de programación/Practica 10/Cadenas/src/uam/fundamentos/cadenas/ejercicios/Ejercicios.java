package uam.fundamentos.cadenas.ejercicios;

import java.util.Scanner;

public class Ejercicios {
  private static String cadena;
  private static Scanner scanner;

  private static void leerCadena(){
    scanner = new Scanner(System.in);
    System.out.print("Ingrese una cadena: ");
    cadena = scanner.nextLine();
    scanner.close();
  }

  private static void contarPalabras(){
    String[] palabras = cadena.split(" ");

    System.out.println("La cadena: "+cadena);
    System.out.println("\tTiene "+palabras.length+" palabras");
  }

  private static int[] contarMayusculasMinusculas(){
    int[] contador = new int[2];
    for (int i = 0; i < cadena.length(); i++){
      if(cadena.charAt(i)>=65 && cadena.charAt(i)<=90)
        contador[0]++;
      else if(cadena.charAt(i)>=97 && cadena.charAt(i)<=122)
        contador[1]++;
    }

    return contador;
  }

  private static void invertirCadena(){
    String invertida = "";

    for(int i=cadena.length()-1; i>=0; i--){
      invertida += cadena.charAt(i);
    }

    System.out.println("Cadena original: "+cadena);
    System.out.println("Cadena invertida: "+invertida);
  }

  private static boolean esPalindromo(){
    for(int i=0; i<cadena.length()/2; i++){
      if(cadena.charAt(i)!=cadena.charAt(cadena.length()-1-i)) 
        return false;
    }

    return true;
  }

  public static void main(String[] args) {
    leerCadena();
    if(esPalindromo())
      System.out.println("\tLa cadena ingresada es un palidromo");
    else
      System.out.println("\tLa cadena ingresada no es un palindromo");
  }
}


