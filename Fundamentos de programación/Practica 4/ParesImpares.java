import java.util.Scanner;

public class ParesImpares {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, dato, pares=0, impares=0; 

    System.out.print("Ingresa la cantidad de números a registrar...");
    n = sc.nextInt();

    int i=0;  
    while(i<n){
      System.out.print("Ingresa el número "+(i+1)+": ");
      dato = sc.nextInt();

      if(dato%2==0)
        pares++;
      else
        impares++;

      i++;
    }

    System.out.println("De los números ingresados hubo: "+pares+" números pares y "+impares+" números impares");

    sc.close();
  }
}




