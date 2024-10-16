import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un string: ");
    String str1 = sc.nextLine(), str2 = "";
    System.out.println("Palabra original: " + str1);

    for (int i = str1.length() - 1; i >= 0; i--) {
      str2 = str2 + str1.charAt(i);
    }

    System.out.println("El string invertido es: " + str2);

  }
}