import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un string: ");
    String str1 = sc.nextLine();
    String str2 = nuevoString(str1);

    System.out.println(str2);
  }

  public static String nuevoString(String s){
    if(s.length() % 2 == 0){
      return s.substring(0, 1) + s.substring(s.length() - 1, s.length());
    } else {
      return s.substring(0, 1) + s.substring(s.length() / 2, (s.length()/2) + 1) + s.substring(s.length() - 1, s.length());
    }
  }
}