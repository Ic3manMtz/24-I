import java.util.Scanner;

public class Salario {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ht;
    double ph, salario;

    System.out.print("Ingresa tus horas trabajadas...");
    ht = sc.nextInt();

    System.out.print("Ingresa el precio por hora...");
    ph = sc.nextDouble();

    if(ht<=40)
      salario=ph*ht;
    else
      salario=ph*(40 + (ht-40)*1.5);
    
    System.out.println("El salario con base en lo establecido es de "+salario);
    
    sc.close();
  }
}



