import java.util.Scanner;

public class Minutos{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int minutos;
    double costo;

    System.out.print("Ingresa la cantidad de minutos...");
    minutos = sc.nextInt();

    if(minutos<=10)
      costo=minutos;
    else
      costo=((((minutos-11)/20)+1)*10)+10;

    System.out.println("El costo de la llamada es de "+costo);

    sc.close();
  }
}



