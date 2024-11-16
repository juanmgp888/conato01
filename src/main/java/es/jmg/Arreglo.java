package es.jmg;

import java.util.Arrays;  // Para ver el contenido real al que apuntan los arrays.
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Arreglo {
    
    // <modificadores> <tipo de retorno> <nombre del método>(<parámetros>) 
    // Método: Público. Con valor de retorno: int[] , un arreglo de enteros.

    public static void calcularAleatorios (int numDado){

        // Declaración de un arreglo de tipo entero con el tamaño del argumento
        int[] coleccion = new int[numDado];

        for (int i=0; i<numDado; i++){
            // Rango de números aleatorios [0-9]. Enteros.
            coleccion[i] = (int) (Math.random()*10);  
        }
        System.out.println(Arrays.toString(coleccion));

        Random random = new Random();  // Crea un objeto Random para generar números aleatorios
        for (int i = 0; i < numDado; i++) {
            coleccion[i] = random.nextInt(10);  // Genera un número aleatorio entre 0 y 9
        }
        System.out.println(Arrays.toString(coleccion));

        for (int i=0; i<numDado; i++){
            // Más aleatorio que los anteriores. Usado en multihilo.
            // Genera un número entre 0 y 9
            coleccion[i] = ThreadLocalRandom.current().nextInt(10);  
        }
        System.out.println(Arrays.toString(coleccion));
    }

    public static void main(String[] args){
        // Al llamar a un método estático, no necesito crear una instancia
        calcularAleatorios(5);
    }
}