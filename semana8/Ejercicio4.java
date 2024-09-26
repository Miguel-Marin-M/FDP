import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa el tamaño de la matriz cuadrada:");
    int n = sc.nextInt();
    int[][] matriz = new int[n][n], matriz2 = new int[n][n]; ;
    int[] diago = new int[n];
    
    for(int i = 0; i < matriz.length; i++){
      for(int j = 0; j < matriz[i].length; j++){
        matriz[i][j] = (int)(Math.random() * 99);
      }
    }

    for (int i=0; i < matriz.length; i++) {
      for (int j=0; j < matriz[i].length; j++) {
        matriz2[j][i] = matriz[i][j];
      }
    }
    
    for(int i=0;i<matriz2.length;i++){
        for(int j=0;j<matriz2[i].length;j++){
            if(i==j){
                diago[i] = matriz2[i][j];
            }
        }
    }

    System.out.println("\nMatriz original: ");
    printMatriz(matriz);
    System.out.println("\nMatriz transpuesta: ");
    printMatriz(matriz2);
    System.out.println("\nDiagonal de la matriz transpuesta: ");
    printDiago(diago);
  }

  public static void printMatriz(int[][] mtrz) {
    for (int i = 0; i < mtrz.length; i++) {
      for (int j = 0; j < mtrz[0].length; j++) {
        System.out.print(mtrz[i][j] + " ");
      }
      System.out.println("");
    }
  }

  public static void printDiago(int[] diag){
    for(int i=0;i<diag.length;i++){
        System.out.print(diag[i] + " ");
    }
  }
}