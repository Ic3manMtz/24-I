import java.util.Scanner;

public class NumeroMayor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero1, numero2;

    System.out.print("Ingresa el primer número...");
    numero1 = sc.nextInt();

    System.out.print("Ingresa el segundo número...");
    numero2 = sc.nextInt();

    if(numero1>numero2)
      System.out.println("El numero "+numero1+" es el mayor");
    else
      if(numero2>numero1)
        System.out.println("El numero "+numero2+" es el mayor");
      else
        System.out.println("Los números son iguales");

    sc.close();
  }  
}





