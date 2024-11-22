package es.jmg;
import java.util.Arrays;  // Para usar el método toString, sort

public class Array01{

    public static void main(String[] args){

        String[] arregloNombres = {"Pepe","Manolo","Lola","Clara"};
        int[] arregloEnteros = {4,1,8,5,0,4,10,14,2,28,100};

        System.out.println("Contenido del array01 es una dirección de memoria aprox.: "+arregloNombres); 
        System.out.println("Contenido del array01 usando toString: "+Arrays.toString(arregloNombres));
        System.out.println(arregloNombres[0]);

        // Con For Each
        for (String i : arregloNombres){  // String sin los corchetes. "i" es propiamente el contenido
        System.out.println("Contenido del array01 es "+i); 
                // Pepe       
                // Manolo
                // Lola
                // Clara
        }
        // Ordenar alfabéticamente el array gracias Arrays.sort()
        Arrays.sort(arregloNombres);
        System.out.println(Arrays.toString(arregloNombres));

        // Mostrar arreglo de enteros
        for (int i : arregloEnteros){
            System.out.println(i);
        }
        
        // Ordenarlo
        Arrays.sort(arregloEnteros);
        // Mostrar arreglo de enteros
        for (int i : arregloEnteros){
            System.out.println(i);
        }

        int[] arregloEnteros2 = {4,1,8,5,0,4,10};
        // Ordenar entre índices datos: {4,1,8,5,0,4,10} ->> {4,1,  0,4,5,8,  10}
        Arrays.sort(arregloEnteros2,2,6); // 2 inicio incluido, índice 6, no incluido.
        System.out.println("Ordenado entre determinados índices dados");
        
        for (int i : arregloEnteros2){
            System.out.println(i);
        }

        // Comparación del tamaño de dos arreglos.Resultados posibles: -1, 0, 1 
        System.out.println("Comparación del tamaño de dos arreglos: \n"+
            Arrays.toString(arregloEnteros)+" y "+Arrays.toString(arregloEnteros2)+" \n");
        
        if (Arrays.compare(arregloEnteros,arregloEnteros2) < 0){ //-1
            System.out.println("arregloEnteros (el primero) es mayor");
        } else if (Arrays.compare(arregloEnteros,arregloEnteros2) > 0){ //+1
            System.out.println("arregloEnteros2 (el segundo)es mayor");
        }
        else { // = 0
            System.out.println("Ambos arreglos tienen el mismo tamaño");
        }
    }
}
