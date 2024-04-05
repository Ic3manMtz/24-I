import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);        
    
    System.out.print("Ingresa la temperatura en Fahrenheit...");
    double fahrenheit = sc.nextDouble();

    double celsius = (fahrenheit - 32) * 5/9;

    System.out.print("\n\t"+fahrenheit + " grados Fahrenheit son " + celsius + " grados Celsius.");
  }
}
