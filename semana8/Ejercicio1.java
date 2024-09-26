public class Ejercicio1 {
  public static void main(String[] args) {
    int[][] matriz = new int[3][3];

    for(int i = 0; i < matriz.length; i++){
      for(int j = 0; j < matriz[i].length; j++){
        if(i==0){
                matriz[i][j] = j+1;
        }else{
          matriz[i][j] = matriz[i-1][j] + 3;;
        }
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