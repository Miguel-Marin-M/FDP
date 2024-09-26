import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el tamaño de la matriz cuadrada");
    int n = sc.nextInt(), o = 0;
    int[][] matriz = new int[n][n];
    System.out.println("");

    System.out.println("\nFunción 1: Llenar matriz manualmente");
    System.out.println("\nFunción 2: LLenar matriz con números aleatorios");
    System.out.println("\nFunción 3: Imprimir matriz");
    System.out.println("\nFunción 4: Resultado de la suma de una fila");
    System.out.println("\nFunción 5: Resultado de la suma de una columna");
    System.out.println("\nFunción 6: Imprimir diagonal principal");
    System.out.println("\nFunción 7: Resultado de la suma de la diagonal principal");
    System.out.println("\nFunción 8: Suma de todos los valores de la matriz");
    System.out.println("\nFunción 9: Valor promedio de todos los valores de la matriz");
    System.out.println("\nFunción 10: Encontrar valor máximo");
    System.out.println("\nFunción 11: Encontrar valor mínimo");
    System.out.println("\nFunción 12: Terminar programa");

    while (o != 12) {
      System.out.println("\nIngresa el número de la función deseada:");
      o = sc.nextInt();
      System.out.println("\n");
      elegirFuncion(o, matriz);
    }

  }

  public static void elegirFuncion(int x, int[][] m) {
    Scanner s = new Scanner(System.in);
    if (x == 1) {
      llenarPorUsuario(m);
    } else if (x == 2) {
      llenarAleatorio(m);
    } else if (x == 3) {
      imprimirMatriz(m);
    } else if (x == 4) {
      imprimirSumaFila(m);
    } else if (x == 5) {
      imprimirSumaColumn(m);
    } else if (x == 6) {
      imprimirDiagPrin(m);
    } else if (x == 7) {
      imprimirSumaDiag(m);
    } else if (x == 8) {
      imprimirSumaTotal(m);
    } else if (x == 9) {
      imprimirPromedioTotal(m);
    } else if (x == 10) {
      imprimirValorMax(m);
    } else if (x == 11) {
      imprimirValorMin(m);
    } else if (x == 12) {
      System.out.println("Gracias por usar el programa");
    }
  }

  public static void llenarPorUsuario(int[][] m) {
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[0].length; j++) {
        System.out.println("Ingrese el valor de la posición [" + i + "][" + j + "]");
        m[i][j] = s.nextInt();
      }
    }
    System.out.println("\n");
  }

  public static void llenarAleatorio(int[][] m) {
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[0].length; j++) {
        m[i][j] = (int) (Math.random() * 100);
      }
    }
  }

  public static void imprimirMatriz(int[][] m) {
    System.out.println("Matriz original:");
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[0].length; j++) {
        System.out.print(m[i][j] + " | ");
      }
      System.out.println("");
    }
    System.out.println("\n");
  }

  public static void imprimirSumaFila(int[][] m) {
    Scanner s = new Scanner(System.in);
    System.out.println("¿Qué fila desea sumar?");
    int f = s.nextInt();
    int acum = 0;
    for (int i = 0; i < m[f].length; i++) {
      acum += m[f][i];
    }
    System.out.println("La suma de la fila " + f + " es: " + acum + "\n");
  }

  public static void imprimirSumaColumn(int[][] m) {
    Scanner s = new Scanner(System.in);
    System.out.println("¿Qué columna desea sumar?");
    int c = s.nextInt();
    int acum = 0;
    for (int i = 0; i < m.length; i++) {
      acum += m[i][c];
    }
    System.out.println("La suma de la columna " + c + " es: " + acum + "\n");
  }

  public static void imprimirDiagPrin(int[][] m) {
    int[] diag = encontrarDiag(m);

    System.out.println("La diagonal principal es: ");
    for (int i : diag) {
      System.out.print(i + " | ");
    }
    System.out.println("\n");
  }

  public static void imprimirSumaDiag(int[][] m) {
    int[] diag = encontrarDiag(m);
    int acum = 0;
    for (int i : diag) {
      acum += i;
    }
    System.out.println("La suma de la diagonal principal es: " + acum + "\n");
  }

  public static void imprimirSumaTotal(int[][] m) {
    int suma = sumaTotal(m);
    System.out.println("La suma total de la matriz es: " + suma);
  }

  public static void imprimirPromedioTotal(int[][] m) {
    int suma = sumaTotal(m);
    float promedio = suma / (m.length * m[0].length);
    System.out.println("El promedio de la matriz es: " + promedio + "\n");
  }

  public static void imprimirValorMax(int[][] m) {
    int max = m[0][0];
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[0].length; j++) {
        if (m[i][j] > max) {
          max = m[i][j];
        }
      }
    }
    System.out.println("El valor máximo de la matriz es: " + max + "\n");
  }

  public static void imprimirValorMin(int[][] m) {
    int min = m[0][0];
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[0].length; j++) {
        if (m[i][j] < min) {
          min = m[i][j];
        }
      }
    }
    System.out.println("El valor mínimo de la matriz es: " + min + "\n");
  }

  public static int sumaTotal(int[][] m) {
    int acum = 0;
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[0].length; j++) {
        acum += m[i][j];
      }
    }
    return acum;
  }

  public static int[] encontrarDiag(int[][] m) {
    int[] diag = new int[m.length];
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[0].length; j++) {
        if (i == j) {
          diag[i] = m[i][j];
        }
      }
    }
    return diag;
  }
}