import java.util.Scanner;

public class Ejercicio3_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa la cantidad de columnas de la matriz:");
    int c = sc.nextInt();
    System.out.println("\nIngresa la cantidad de filas de la matriz:");
    int f = sc.nextInt();
    int[][] matriz = new int[f][c];
    int[] matriz2 = new int[f];

    for(int i = 0; i < matriz.length; i++){
      for(int j = 0; j < matriz[i].length; j++){
        matriz[i][j] = (int)(Math.random() * 10);
      }
    }

    for(int i = 0; i < matriz2.length; i++){
      matriz2[i] += sumFila(matriz[i]);
    }

    System.out.println("\nMatriz original: ");
    printMatriz(matriz);
    
    System.out.println("\nMatriz con suma de las filas de la matriz anterior: ");
    printList(matriz2);
  }

  public static void printMatriz(int[][] mtrz) {
    for (int i = 0; i < mtrz.length; i++) {
      for (int j = 0; j < mtrz[0].length; j++) {
        System.out.print(mtrz[i][j] + " ");
      }
      System.out.println("");
    }
  }
  
  public static void printList(int[] mtrz) {
    for (int i = 0; i < mtrz.length; i++) {
      System.out.println(mtrz[i] + " ");
    }
  }
  
  public static int sumFila(int[] mtrz) {
    int acum = 0;
    for (int i = 0; i < mtrz.length; i++) {
      acum += mtrz[i];
    }
    return acum;
  }
}