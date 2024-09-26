import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = 0, item = 0;
    System.out.println("Ingresa el tamaño de la lista");
    x = sc.nextInt();
    int[] arr_int = new int[x];

    for (int i = 0; i < x; i++) {
      System.out.println("Ingrese un número entero a la lista");
      item = sc.nextInt();
      arr_int[i] = item * 2;
    }

    for (int i : arr_int) {
      System.out.println(i + " x 3: " + i * 3);
    }
  }
}