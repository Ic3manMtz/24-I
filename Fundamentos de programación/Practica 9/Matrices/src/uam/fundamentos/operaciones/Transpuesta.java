package uam.fundamentos.operaciones;

public class Transpuesta {
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

  private static int[][] transpuesta(int[][] matriz){
    int[][] transp = new int[M][N];
    
    for (int i=0;i<N;i++)
      for (int j=0;j<M;j++)
        transp[j][i] = matriz[i][j];
    
    return transp;
  }

  public static void main(String[] args) {
    int[][] matrizA = llenarMatriz();

    System.out.println("\nMatriz A");
    imprimirMatriz(matrizA);

    int[][] resultado = transpuesta(matrizA);
    System.out.println("\nLa transpuesta de A");
    imprimirMatriz(resultado);
  }
}
