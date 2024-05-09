package uam.fundamentos.busqueda;

import java.util.Random;
import java.util.Scanner;

public class Busqueda {
  private static final int N=3;
  private static final int M=3;
  private static Random random;
  private static Scanner scanner;

  private static char[][] llenarMatriz(){
    char[][] matriz=new char[N][M];
    random = new Random();

    for(int i=0;i<N;i++){
      for(int j=0;j<M;j++){
        matriz[i][j]=(char)(random.nextInt('z'-'a'+1) + 'a');
      }
    }
    return matriz;
  }

  private static void imprimirMatriz(char[][] matriz){
    for(int i=0; i<N; i++){
      for(int j=0; j<M; j++){
        System.out.print(matriz[i][j]+" ");
      }
      System.out.println();
    }
  }

  private static void buscarCaracter(char[][] matriz, char buscado){
    int apariciones=0;

    for(int i=0; i<N; i++){
      for(int j=0; j<M; j++){
        if (matriz[i][j]==buscado) apariciones++;
      }
    }

    if(apariciones==0)
      System.out.println("\n\tEl caracter "+buscado+" no se encuentra en la matriz");
    else
      System.out.println("\n\tEl caracter "+buscado+" se encuentra "+apariciones+" veces dentro de la matriz");
  }
  public static void main(String[] args) {
    char matrizA[][]=llenarMatriz(); 
    scanner=new Scanner(System.in);
    
    System.out.println("Matriz de caracteres");
    imprimirMatriz(matrizA);
    System.out.print("\nIngresa el caracter a buscar dentro de la matriz...");
    char buscado=scanner.next().charAt(0);
    buscarCaracter(matrizA, buscado);
  }
}
