package es.jmg;
import java.util.Arrays;  // Para usar el método toString, sort

public class Array01{

    public static void main(String[] args){

        String[] arregloNombres = {"Pepe","Manolo","Lola","Clara"};
        int[] arregloEnteros = {4,1,8,5,0,4,10,14,2,28,100};
        int[] arregloEnteros3 = {12,7,8,12};
        int[] arregloEnteros4 = {8,7,12,12};

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

        // Comparación del tamaño de dos arreglos.Resultados posibles: +1, 0, -1 
        /* El método Arrays.compare() compara los arreglos de manera lexicográfica:

        ¿Qué hace Arrays.compare()?: Compara los elementos de los arreglos de forma secuencial. 
        Si encuentra una diferencia en los elementos de las mismas posiciones, retorna:
        Valor negativo si el primer arreglo es "menor" (en términos lexicográficos).
        Valor positivo si el primer arreglo es "mayor".
        Cero si ambos arreglos son iguales en contenido hasta el final del arreglo o hasta donde coincidan.
        */
        System.out.println("Comparación de los valores de cada uno de los dos arreglos: \n"+
        "12 > 8 entonces el arreglo3 es mayor. \n"+
        
            Arrays.toString(arregloEnteros3)+" y "+Arrays.toString(arregloEnteros4));
        
        if (Arrays.compare(arregloEnteros3,arregloEnteros4) > 0){ //+1
            System.out.println("arregloEnteros3 (el primero) es mayor\n");
        } else if (Arrays.compare(arregloEnteros3,arregloEnteros4) < 0){ //-1
            System.out.println("arregloEnteros4 (el segundo)es mayor\n");
        }
        else { // = 0
            System.out.println("Ambos arreglos tienen el mismo tamaño\n");
        }




        for (int i : arregloEnteros3){
            System.out.println("Enteros3 : "+i);
        }
        for (int i : arregloEnteros4){
            System.out.println("Enteros4 : "+i);
        }

        
        // equals() compara si dos arreglos son exactamente iguales (mismo tamaño, mismos elementos y en el mismo orden).
        /*        int[] arregloEnteros3 = {12,7,8};
                  int[] arregloEnteros4 = {8,7,12,12}; */

        if (arregloEnteros3.equals(arregloEnteros4)){
            System.out.println("Ambos arreglos tienen el mismo contenido.");
            
        } else {
            System.out.println("Ambos arreglos son de contenido distinto. 'equals'");
            Arrays.sort(arregloEnteros3);
            Arrays.sort(arregloEnteros4);
            System.out.println("Aplicando 'sort', ordeno y ya son iguales.");
            for (int i : arregloEnteros3) {
                System.out.println(i);
            }
            for (int i : arregloEnteros4) {
                System.out.println(i);
            }

        }
        if (arregloEnteros3.equals(arregloEnteros4)){
            System.out.println("Tras ser ordenados tienen el mismo contenido en el mismo orden.");
        }
    }
}
