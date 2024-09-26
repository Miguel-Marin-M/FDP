import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = 0, counter = 0;
    System.out.println("Ingresa el tamaño de la lista (Debe ser par)");
    x = sc.nextInt();
    while (x % 2 != 0) {
      System.out.println("El tamaño debe ser par");
      x = sc.nextInt();
    }
    int[] arreglo1 = new int[x];
    float[] arreglo2 = new float[x / 2];

    for (int i = 0; i < arreglo1.length; i++) {
      arreglo1[i] = (int) (Math.random() * 100);
    }
    for (int i = 0; i < arreglo1.length; i += 2) {
      arreglo2[counter] = ((float)(arreglo1[i]) + (float)(arreglo1[i + 1])) / 2;
      counter++;
    }

    System.out.println("Arreglo original:");
    printIntList(arreglo1);
    System.out.println("\n\nArreglo con promedio de 2 consecutivos:");
    printFloatList(arreglo2);

  }

  public static void printIntList(int[] list) {
    for (int i : list) {
      System.out.print(i + " | ");
    }
  }

  public static void printFloatList(float[] list) {
    for (float i : list) {
      System.out.print(i + " | ");
    }
  }
}