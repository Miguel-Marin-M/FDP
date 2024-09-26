import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un String:");
    String str1 = sc.nextLine(), str2 = "";

    System.out.println("Ingrese un segundo String");
    while (true) {
      System.out.println("(Debe ser de menor tamaño que el primero): ");
      str2 = sc.nextLine();
      if (str2.length() < str1.length()) {
        break;
      }
    }

    if (str1.indexOf(str2) != -1) {
      System.out.println("El String: '" + str2 + "' es substring del String: '" + str1 + "'");
    } else{
      System.out.println("El String: '" + str2 + "' no es substring del String: '" + str1 + "'");
    }

  }
}