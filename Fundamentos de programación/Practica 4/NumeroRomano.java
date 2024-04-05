import java.util.Scanner;

public class NumeroRomano {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.print("Ingresa el número a convertir...");
    numero = sc.nextInt();

    switch (numero) {
      case 1: System.out.println("I");
        break;
      case 2: System.out.println("II");
        break;
      case 3: System.out.println("III");
        break;
      case 4: System.out.println("IV");
        break;
      case 5: System.out.println("V");
        break;
      case 6:System.out.println("VI");
        break;
      case 7: System.out.println("VII");
        break;
      case 8: System.out.println("VIII");
        break;
      case 9: System.out.println("IX");
        break;
      case 10: System.out.println("X");
        break;
    
      default: System.err.println("Número inválido, intente de nuevo");
        break;
    }

    sc.close();
  }
}




