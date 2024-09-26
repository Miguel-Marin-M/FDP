import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa la cantidad de estudiantes:");
    int n = sc.nextInt();
    String[][] matriz = new String[4][n + 1];
    int o = 0;
    matriz[0][0] = "id";
    matriz[1][0] = "edad";
    matriz[2][0] = "año_nacimiento";
    matriz[3][0] = "nro_materias";

    System.out.println("\nFunción 1: Llenar datos de la matriz");
    System.out.println("\nFunción 2: Buscar estudiante por ID");
    System.out.println("\nFunción 3: Cantidad de estudiantes en un rango de edad");
    System.out.println("\nFunción 4: Ver información completa");
    System.out.println("\nFunción 5: Ver estudiantes de un año determinado");
    System.out.println("\nFunción 6: Promedio de materias de toda la matriz");
    System.out.println("\nFunción 7: Terminar programa");

    while (o != 7) {
      System.out.println("\nIngresa el número de la función deseada:");
      o = sc.nextInt();
      elegirFuncion(o, matriz);
    }

  }

  public static void elegirFuncion(int x, String[][] m) {
    Scanner s = new Scanner(System.in);
    if (x == 1) {
      llenarColumnas(m);
    } else if (x == 2) {
      System.out.println("¿Qué id deseas buscar?");
      String id = s.nextLine();
      imprimirPorId(m, id);
    } else if (x == 3) {
      cantidadEnEdad(m);
    } else if (x == 4) {
      imprimirEstudiantes(m);
    } else if (x == 5) {
      System.out.println("¿Qué fecha deseas buscar?");
      int f = s.nextInt();
      imprimirPorFechaNacimiento(m, f);
    } else if (x == 6) {
      imprimirPromedioMaterias(m);
    } else if (x == 7) {
      System.out.println("Gracias por usar el programa");
    }
  }

  public static void llenarColumnas(String[][] m) {
    Scanner s = new Scanner(System.in);
    int columna;
    String d;
    while (true) {
      System.out.println("Qué columna desea llenar");
      columna = s.nextInt();
      if (columna == 0) {
        System.out.println("La columna 0 no se puede modificar");
      } else if (columna > m.length - 1) {
        System.out.println("La columna " + columna + " no existe");
      } else {
        break;
      }
    }

    System.out.println("Ingresa los datos de el estudiante:");

    for (int j = 0; j < m.length; j++) {
      System.out.println("\nIngrese el " + m[j][0] + " del estudiante ");
      d = s.nextLine();
      while (d.equals("")) {
        d = s.nextLine();
      }
      m[j][columna] = d;
    }
  }

  public static void imprimirPorId(String[][] m, String id) {
    for (int i = 0; i < m[0].length; i++) {
      if (m[0][i].equals(id)) {
        System.out.println("\n\nDatos del estudiante con id: " + id);
        for (int j = 0; j < m.length; j++) {
          System.out.println(m[j][0] + ": " + m[j][i]);
        }
        break;
      }
    }
  }

  public static void cantidadEnEdad(String[][] m) {
    Scanner s = new Scanner(System.in);
    int counter = 0;
    System.out.println("Ingrese la edad mínima: ");
    int min = s.nextInt();
    System.out.println("Ingrese la edad máxima: ");
    int max = s.nextInt();

    for (int i = 1; i < m[0].length; i++) {
      if (Integer.parseInt(m[1][i]) >= min && Integer.parseInt(m[1][i]) <= max) {
        counter++;
      }
    }

    System.out.println("Hay " + counter + " estudiantes entre los rangos de edad ingresados");
  }

  public static void imprimirEstudiantes(String[][] mtrz) {
    for (int i = 0; i < mtrz.length; i++) {
      for (int j = 0; j < mtrz[0].length; j++) {
        System.out.print(mtrz[i][j] + " | ");
      }
      System.out.println("");
    }
  }

  public static void imprimirPorFechaNacimiento(String[][] m, int fecha) {
    for (int i = 1; i < m[2].length; i++) {
      if (Integer.parseInt(m[2][i]) == fecha) {
        System.out.println("\n\nEstudiante nacido en: " + fecha);
        for (int j = 0; j < m.length; j++) {
          System.out.println(m[j][0] + ": " + m[j][i]);
        }
      }
    }
  }

  public static void imprimirPromedioMaterias(String[][] m) {
    int acum = 0;

    for (int i = 1; i < m[m.length - 1].length; i++) {
      acum += Integer.parseInt(m[3][i]);
    }

    System.out.println("El promedio de materias es: " + (acum / (m[m.length - 1].length - 1)));
  }
}