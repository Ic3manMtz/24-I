import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa el número n...");
    int n = sc.nextInt();

    double suma = (n*(n+1))/2;
    System.out.println("\nLa suma de los primeros "+n+" números es "+suma);
  }
}



