import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);        
    
    System.out.print("Ingresa la distancia en metros...");
    double distancia = sc.nextDouble();

    System.out.print("Ingresa la distancia en segundos...");
    double tiempo = sc.nextDouble();

    double velocidad = distancia/tiempo;

    System.out.print("\n\tLa velocidad es "+velocidad+"m/s");
  }
}

