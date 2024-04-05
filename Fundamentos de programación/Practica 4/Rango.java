import java.util.Scanner;

public class Rango {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    
    System.out.print("Ingresa el numero n...");
    n = sc.nextInt();

    if(n>=100 && n<=200)
      System.out.print("El número n se encuentra dentro del rango");
    else
      System.out.print("El número n se encuentra fuera del rango");

    sc.close();
  }
}




