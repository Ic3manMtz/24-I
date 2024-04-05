import java.util.Scanner;

public class MaximoMinimo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, dato, maximo=0, minimo=Integer.MAX_VALUE;

    System.out.print("Ingresa la cantida de números a analizar...");
    n = sc.nextInt();

    int i = 0;
    do{
      System.out.print("Ingresa el número "+(i+1)+": ");
      dato = sc.nextInt();

      if(dato>maximo)
        maximo=dato;
      
      if(dato<minimo)
        minimo=dato;

      i++;
    }while(i<n);


    System.out.println("El número máximo es "+maximo+", mientras que el mínimo es "+minimo);
    sc.close();
  }
}



