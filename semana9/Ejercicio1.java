import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cont = 0;
    System.out.println("Ingrese el String: ");
    String str = sc.nextLine();
    System.out.println("Ingrese el caracter a buscar: ");
    char caracter = sc.next().charAt(0);

    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == caracter){
        cont++;
      }
    }

    System.out.println("El caracter " + caracter + " se encuentra " + cont + " veces");

  }
}