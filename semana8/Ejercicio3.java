import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa la cantidad de columnas de la matriz: ");
    int c = sc.nextInt();
    System.out.println("Ingresa la cantidad de filas de la matriz: ");
    int f = sc.nextInt();
    int[][] matriz = new int[f][c];

    for(int i = 0; i < matriz.length; i++){
      for(int j = 0; j < matriz[i].length; j++){
        matriz[i][j] = (int)(Math.random() * 10);
      }
    }
    
    printMatriz(matriz);
  }

  public static void printMatriz(int[][] mtrz) {
    for (int i = 0; i < mtrz.length; i++) {
      for (int j = 0; j < mtrz[0].length; j++) {
        System.out.print(mtrz[i][j] + " ");
      }
      System.out.println("");
    }
  }
}