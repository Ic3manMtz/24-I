import java.util.Scanner;

public class Ejercicio4 {
  static final double PI = 3.1416;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);        
    
    
    System.out.print("Ingresa el radio del círculo...");
    double radio = sc.nextDouble();

    double area = PI * radio * radio;
    System.out.print("\n\tEl área del círculo es "+area);
  }
}

