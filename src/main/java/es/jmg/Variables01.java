package es.jmg;
import java.text.DecimalFormat;

public class Variables01 {

    public static void main(String[] args){

        // Conversor de pulgadas a centímetros

        final double pulgadas = 2.54; // creo una constante
        double valorDadoCm = 6d;

        double resultadoCm = valorDadoCm / pulgadas;

        // Usando DecimalFormat para limitar a 2 decimales
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println(valorDadoCm + " centimétros = "+ df.format(resultadoCm) + " pulgadas.");
    // -----------------------------------------------------------------------


        // Realizar operaciones matemáticas simples para ver precedencia de operadores
        int a=3, b=5, c=6, d=12;
/*      O así:  
        int a,b,c,d; // Se pueden declarar de una tacada
        a=3;
        b=5;
        c=6;
        d=12; */


        int resultadoCalculo =  (a + b - c) * d;
        System.out.println(resultadoCalculo); // 24
        /*
        En Java, los operadores aritméticos siguen estas reglas de precedencia (de mayor a menor):
        Multiplicación (*) y división (/) tienen mayor precedencia que la suma (+) y la resta (-).
        Los paréntesis (()) tienen la más alta precedencia, pero no los usamos en esta expresión, por lo que la multiplicación se realiza antes que la suma y la resta.
        */
        int resultadoCalculo2 =  a + b - c * d; // Primero resuelve c*d, luego a+b y finalmente se restan
        System.out.println(resultadoCalculo2); //64
    // -----------------------------------------------------------------------

    }
    
}
