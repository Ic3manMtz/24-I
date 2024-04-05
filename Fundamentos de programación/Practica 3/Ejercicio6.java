import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa el número de horas trabajadas...");
    double ht = sc.nextDouble();

    System.out.print("Ingresa el precio por hora...");
    double ph = sc.nextDouble();

    double salario = ht*ph;

    System.out.println("\n\tEl salario obtenido trabajando "+ht+" y con un precio de "+ph+" es de "+salario);
  }
}
