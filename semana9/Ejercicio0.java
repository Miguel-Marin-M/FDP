import java.util.Scanner;

public class Ejercicio0 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el String #1");
    String str1 = sc.nextLine();
    System.out.println("Ingrese el String #2");
    String str2 = sc.nextLine();

    if (str1.equals(str2)) {
      System.out.println("Los Strings son iguales");
    } else {
      System.out.println("Los Strings son diferentes");
    }

  }
}