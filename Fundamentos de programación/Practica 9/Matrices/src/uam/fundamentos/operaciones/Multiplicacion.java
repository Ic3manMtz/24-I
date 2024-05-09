package uam.fundamentos.operaciones;

public class Multiplicacion {
  private static final int N=3;
  private static final int M=3;

  private static int[][] llenarMatriz(){
    int[][] matriz = new int[N][M];
    int valor=1;
    for (int i=0; i<N; i++){
      for (int j=0;j<M; j++){
        matriz[i][j]=valor++;
      }
    }

    return matriz;
  }

  private static void imprimirMatriz(int[][] matriz){
    for(int i=0; i<N; i++){
      for(int j=0; j<M; j++){
        System.out.print(matriz[i][j]+" ");
      }
      System.out.println();
    }
  }

  private static int[][] multiplicacionMatrices(int[][] matrizA, int[][] matrizB){
    int[][] resultado = new int[N][M];

    for(int i=0; i<N; i++){
      for(int j=0; j<M; j++){
        for(int k=0; k<M; k++){
          resultado[i][j] += matrizA[i][k]*matrizB[k][j];
        }
      }
    }

    return resultado;
  }

  public static void main(String[] args) {
    int[][] matrizA = llenarMatriz();
    int[][] matrizB = llenarMatriz();

    System.out.println("\nMatriz A");
    imprimirMatriz(matrizA);

    System.out.println("\nMatriz B");
    imprimirMatriz(matrizB);

    int[][] resultado = multiplicacionMatrices(matrizA, matrizB);
    System.out.println("\nLa multiplicacion de las matrices A y B es");
    imprimirMatriz(resultado);
  }
}
