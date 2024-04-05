import java.util.Scanner;

public class SumaNaturales {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero, suma=0;

    System.out.print("Ingresa el número n...");
    numero = sc.nextInt();

    for(int i=1; i<=numero; i++){
      suma+=i;
    }

    System.out.println("La suma de los primeros N números es de "+suma);

    sc.close();
  }
}


