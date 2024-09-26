import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un String para invertirlo");
    String str = sc.nextLine(), strInv = "";

    for(int i = str.length() - 1; i >= 0; i--){
      strInv += str.charAt(i);
    }
    System.out.println(strInv);
  }
}