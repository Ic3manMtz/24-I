package uam.fundamentos.formulas.ejercicios;

import java.util.Scanner;

public class Conversion {
  private static Scanner sc = new Scanner(System.in);
  
  public static int menuOpciones(){
    int opt=0;

    do{
      if(opt<1 || opt>2)
        System.out.println("Opción incorrecta intente de nuevo");
    
      System.out.println("Seleccione una opción: ");
      System.out.println("1. Convertir de grados Celsius a Fahrenheit");
      System.out.println("2. Convertir de grados Fahrenheit a Celsius");
      opt = sc.nextInt();
    }while(opt<1 || opt>2);

    return opt;
  }

  public static double validarGrados(int opcion){
    if(opcion==1)
      System.out.print("Ingresa los grados Celsius a convertir...");
    else 
      System.out.print("Ingresa los grados Fahrenheir a convertir...");

    return sc.nextDouble();
  }

  public static void conversion(int opcion, double grados){
    double convertidos;
    if(opcion == 1){
      convertidos = (grados * 9/5) + 32;
      System.out.println("La conversion de "+grados+" Celsius es de "+convertidos+" Fahrenheit");
    }else{
      convertidos = (grados - 32)  * 5/9;
      System.out.println("La conersion de "+grados+" Fahrenheit es de "+convertidos+" Celsius");
    }
  }

  public static void main(String[] args) {
    int opcion = menuOpciones();
    double grados = validarGrados(opcion);

    conversion(opcion, grados);
  }
}


