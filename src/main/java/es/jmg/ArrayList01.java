package es.jmg;

import java.util.ArrayList;

public class ArrayList01 {

    public static void main(String[] args) {
    
    // Antes de Java 5 había diferentes maneras de crear un ArrayList
    
    ArrayList lista1 = new ArrayList(); // reserva espacio para un número de slots por defecto y no da valores iniciales
    ArrayList lista2 = new ArrayList(6); // reserva 6 slots pero no asigna valores
    ArrayList lista3 = new ArrayList(lista2); // indicamos que queremos hacer una copia de otro ArrayList.

    // Hasta que llegaron los genéricos
    ArrayList<String> lista4 = new ArrayList<String>();
    ArrayList<String> lista5 = new ArrayList<>(); // Desde Java 7, se puede omitir (pq se sobreentiende) el tipo en el lado derecho

    lista4.add("cornucopia");
    lista4.add("usucapión");
    lista4.add("subterfugio");
    System.out.println("Contenido de la lista4: "+lista4);
    System.out.println("Tamaño de la lista4: "+lista4.size());

    //método set : cambia un elemento de la lista (sin variar su tamaño) a través de su índice
    lista4.set(1,"abstruso");
    System.out.println("Contenido de la lista4: "+lista4);

    System.out.println("¿Está 'lista5' vacía?: "+lista5.isEmpty());
    System.out.println("Contenido de la lista2 que se creó sin asignarle valores. (Se reservaron slots): "+lista2);
    System.out.println("¿Está 'lista2' vacía?: "+lista2.isEmpty());
    System.out.println("¿Tamaño de 'lista2'?: "+lista2.size());
    System.out.println("¿Tamaño de 'lista1'?: "+lista1.size());
    lista2.add("Canguro");
    System.out.println("¿Tamaño de 'lista2' tras añadir un elemento?: "+lista2.size());
    System.out.println("'lista3' mantiene el tamaño del momento de su creación, aunque lista2 (a la cual copió en ese momento)\n"+
    "haya tenido un elemento añadido posteriormente. lista3.size: "+lista3.size());

    // contains
    System.out.println("lista4 contiene 'subterfugio' ?: "+lista4.contains("subterfugio"));

    }
}
