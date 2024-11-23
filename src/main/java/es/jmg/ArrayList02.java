package es.jmg;

import static java.util.Collections.sort;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList02 {

    public static void main(String[] args) {
    
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Pepe");
        lista.add("Juan");
        lista.add("Belén");
        lista.add("Carlos");
        lista.add("Juan");

        lista.set(2,"Beatriz"); // Sustitución por índice
        System.out.println("Contenido de la lista: "+lista+" y su tamaño es: "+lista.size());
        lista.remove("Juan"); // Borra el primero que coincide. Tmb se puede borrar por índice.
        System.out.println("Contenido de la lista: "+lista+" y su tamaño es: "+lista.size());
        System.out.println("¿La lista contiene 'Carlos' ? : "+lista.contains("Carlos"));


        // Ordenar la lista en orden descendente
        sort(lista, Collections.reverseOrder());
        System.out.println("Contenido de la lista en orden inverso: "+lista);

        lista.clone();
        System.out.println("Contenido de la lista tras aplicar 'clone()': "+lista+" y su tamaño es: "+lista.size());
        lista.clear();
        System.out.println("Contenido de la lista tras aplicar 'clear()': "+lista+" y su tamaño es: "+lista.size());


        /*
         * Para ordenar números en orden ascendente (de menor a mayor), usa Collections.sort(lista) o lista.sort(null).
           Para ordenar números en orden descendente (de mayor a menor), 
           usa Collections.sort(lista, Collections.reverseOrder()) o lista.sort(Collections.reverseOrder()).
         */


        // Conversión de ArrayList a arreglo normal (array)
        String[] arreglo = new String[lista.size()];  // Crear un arreglo con el tamaño de la lista
        arreglo = lista.toArray(arreglo);  // Convertir la ArrayList a un arreglo

        // Mostrar el contenido del arreglo
        System.out.print("Contenido del arreglo: ");
        for (String elemento : arreglo) {
            System.out.print(elemento + " ");
        }
    }
}

