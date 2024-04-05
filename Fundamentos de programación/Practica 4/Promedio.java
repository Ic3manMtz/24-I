import java.util.Scanner;

public class Promedio {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    double dato, suma=0.0, promedio;

    System.out.print("Ingresa el número de elementos a promediar...");
    n = sc.nextInt();

    for(int i=0; i<n; i++){
      System.out.print("Ingresa el dato "+(i+1)+": ");
      dato = sc.nextDouble();
      suma += dato;
    }

    promedio = suma/n;

    System.out.println("El promedio de los "+n+" numeros es de "+promedio);

    sc.close();
  }
}




