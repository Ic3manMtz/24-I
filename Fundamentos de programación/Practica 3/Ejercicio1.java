import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    double a,b,c;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("\nIngresa el primer número...");
    a=sc.nextDouble();

    System.out.print("Ingresa el segundo número...");
    b=sc.nextDouble();

    System.out.print("Ingresa el tercer número...");
    c=sc.nextDouble();

    double total=a+b+c;
    double promedio=total/3;
  
    System.out.println("\n\tEl promedio de los números es "+promedio);
  } 
}
