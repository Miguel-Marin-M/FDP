public class Calculadora {
    private double memoria;
    public Calculadora() {
        this.memoria = 0.0;
    }
    public double obtenerMemoria() {
        return this.memoria;
    }

    public void iniciarMemoria() {
        this.memoria = 0.0;
    }
    public double sumar(double a, double b) {
        double resultado = a + b;
        this.memoria += resultado;
        return resultado;
    }
    public double restar(double a, double b) {
        double resultado = a - b;
        this.memoria += resultado;
        return resultado;
    }
    public double multiplicar(double a, double b) {
        double resultado = a * b;
        this.memoria += resultado;
        return resultado;
    }
    public double dividir(double a, double b) {
        double resultado = a / b;
        this.memoria += resultado;
        return resultado;
    }
}
