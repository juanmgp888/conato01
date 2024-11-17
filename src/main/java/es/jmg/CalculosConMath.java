package es.jmg;

public class CalculosConMath {
    double raiz = 0.0d;

    // Método para calcular
    public static double raizCuadrada(double numDado){
    // Creo el método para poder hacer test. 
    // Y le indico static para no tener que crear instancia new...
        return Math.sqrt(numDado); // sqrt devuelve un double
    }

    // Método para imprimir el resultado
    public static void imprimirRaiz(double numDado) {
        double resultado = raizCuadrada(numDado);
        System.out.println(resultado);
        }
    // Método main exclusivamente para llamar a otros métodos (no para salida de resultados)
    public static void main(String[] args) {
        imprimirRaiz(64);
    }
}

