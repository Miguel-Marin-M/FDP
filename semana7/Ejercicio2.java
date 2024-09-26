import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = 0, counter = 0;
    System.out.println("Ingresa el tamaño de la lista");
    x = sc.nextInt();
    int[] arreglo1 = new int[x], arreglo2 = new int[x];

    for (int i = 0; i < x; i++) {
      arreglo1[i] = (int) (Math.random() * 100);
    }

    for (int i = arreglo1.length - 1; i >= 0; i--) {
      arreglo2[counter] = arreglo1[i];
      counter++;
    }

    System.out.println("Arreglo original:");
    printList(arreglo1);
    System.out.println("\n\nArreglo invertido:");
    printList(arreglo2);

  }

  public static void printList(int[] list){
    for (int i : list) {
      System.out.print(i + " | ");
    }
  }
}