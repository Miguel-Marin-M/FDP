import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = 0, temp = 0;
    System.out.println("Ingresa el tamaño de la lista");
    x = sc.nextInt();
    int[] arreglo1 = new int[x];

    for (int i = 0; i < arreglo1.length; i++) {
      arreglo1[i] = (int) (Math.random() * 100);
    }
    System.out.println("Arreglo original:");
    printList(arreglo1);

    for (int i = 0; i < arreglo1.length / 2; i++) {
      temp = arreglo1[i];
      arreglo1[i] = arreglo1[arreglo1.length - 1 - i];
      arreglo1[arreglo1.length - 1 - i] = temp;  
    }
    
    System.out.println("\n\nArreglo invertido:");
    printList(arreglo1);

  }

  public static void printList(int[] list) {
    for (int i : list) {
      System.out.print(i + " | ");
    }
  }
}