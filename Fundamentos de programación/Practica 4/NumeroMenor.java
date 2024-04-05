import java.util.Scanner;

public class NumeroMenor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int  num1, num2, num3;

    System.out.print("Ingresa el primer número...");
    num1 = sc.nextInt();

    System.out.print("Ingresa el segundo número...");
    num2 = sc.nextInt();

    System.out.print("Ingresa el tercer número...");
    num3 = sc.nextInt();

    if(num1<num2 && num1<num3)
      System.out.println("El menor número es: "+num1);
    else if(num2<num3 &&  num2<num1)
      System.out.println("El menor número es: "+num2);
    else if(num3<num1 && num3<num2)
      System.out.println( "El menor número es: "+num3);
    else 
      System.out.println("Los tres números son iguales");

    sc.close();
  }
}


