package es.jmg;

import java.util.Random;

public class ContarPares {
     // Creo un objeto de la clase random
    private Random aleatorio = new Random();
  //  private byte contadorPares = 0;  

    // crear un arreglo de 10 elementos y llenarlo con enteros

    public int[] crearArregloYRellenarlo(){
        // Relleno de un arreglo por asignación directa de valores.
        int[] arreglo01 = {23,33,423,1,33,4,5,6,32,12};
        return arreglo01;
    }
    public int[] rellenarArregloConAleatorios(int tamano){
        // Rellenar arreglo de un tamaño dado por argumento, con números aleatorios [0-10]
        // Creación del arreglo y rellenado con ciclo for.
        int[] arreglo02 = new int[tamano];
        for (int i=0;i<tamano;i++){
            arreglo02[i] = aleatorio.nextInt(11);  
        }
        return arreglo02;
    }
    public byte contarNumerosParesEnArreglo(byte[] arregloDado){
        byte contadorPares = 0;  
        for (int i=0;i<arregloDado.length;i++){
            if (arregloDado[i] %2 == 0){
                contadorPares++;
            }
        }
        return contadorPares;
    }
}
