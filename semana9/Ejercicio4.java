public class Ejercicio4 {
  public static void main(String[] args) {
    String str1 = "Esta es una prueba de string, que verifica donde un string esta", str2 = "esta", str3 = "string";
    ;

    encontrarPalabra(str1, str2);
    encontrarPalabra(str1, str3);

  }

  // Funcion para encontrar la posicion de una palabra en un string
  // Puede estar más de una vez
  public static void encontrarPalabra(String s1, String s2) {
    int primeraPosicion = s1.toLowerCase().indexOf(s2.toLowerCase());
    if (primeraPosicion != -1) {
      System.out.println("La palabra '" + s2 + "', está en la(s) posición(es): ");
      for (int i = 0; i < s1.length(); i++) {
        if (s1.toLowerCase().indexOf(s2, i) != -1) {
          int posicion = s1.toLowerCase().indexOf(s2.toLowerCase(), i);
          System.out.println(posicion);
          i = posicion + s2.length();

        }
      }
      System.out.println();
    }
  }
}