import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("#.##");
        double a=10.3;
        double b=5.4;
        double c=7;
        double d=6.3;
        double r=0;

        Calculadora calc = new Calculadora();

        r = calc.sumar(a,b);
        System.out.println("Suma de " + a + " + " + b + " = " + formato.format(r));
        System.out.println("Valor en memoria: " + formato.format(calc.obtenerMemoria()));

        r = calc.restar(c,d);
        System.out.println("\nResta de " + c + " + " + d + " = " + formato.format(r));
        System.out.println("Valor en memoria: " + formato.format(calc.obtenerMemoria()));

        calc.iniciarMemoria();
        System.out.println("\n---- Se reinicia la memoria ----\n");

        r = calc.multiplicar(c,d);
        System.out.println("\nMultiplicación de " + c + " y " + d + " = " + formato.format(r));
        System.out.println("Valor en memoria: " + formato.format(calc.obtenerMemoria()));

        r = calc.dividir(a,b);
        System.out.println("\nDivisión de " + a + " entre " + b + " = " + formato.format(r));
        System.out.println("Valor en memoria: " + formato.format(calc.obtenerMemoria()));
    }
}                                                                                                  