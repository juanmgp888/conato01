package es.jmg;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Un Set es una colección que no permite elementos duplicados. Cuando intentas agregar un elemento que ya existe en el Set, este no se agrega. Existen varias implementaciones de la interfaz Set, pero las más comunes son:

    HashSet: Implementación que no garantiza ningún orden en los elementos. 
             Es eficiente para búsquedas, inserciones y eliminaciones.
    LinkedHashSet: Mantiene el orden de inserción de los elementos.
    TreeSet: Ordena los elementos de acuerdo con el orden natural o el comparador 
 */
public class Set01 {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();
        conjunto.add("José");
        conjunto.add("Lucas");
        conjunto.add("Ruth");
        conjunto.add("María");
        conjunto.add("José"); // Repetido, no se añade.

        // No guarda orden de entrada ni muestra duplicados
        System.out.println("HashSet (cualquier orden y sin duplicados): "+conjunto);
        // Aunque se han añadido 5 elementos, el tamaño es 4 (los repetidos no se incluyen en el conjunto).
        System.out.println("Tamaño del HashSet: "+conjunto.size());


        Set<String> conjunto2 = new LinkedHashSet<>();
        conjunto2.add("José");
        conjunto2.add("Lucas");
        conjunto2.add("Ruth");
        conjunto2.add("María");
        conjunto2.add("José"); // Repetido, no se añade.

        // Sí guarda orden de entrada pero no admite duplicados
        System.out.println("LinkedHashSet, respeta orden de entrada y sin duplicados: "+(conjunto2));
        // Aunque se han añadido 5 elementos, el tamaño es 4 (los repetidos no se incluyen en el conjunto).
        System.out.println("Tamaño del LinkedHashSet: "+conjunto2.size());

        // TreeSet ordena de acuerdo al orden natural de los elementos
        Set<String> conjunto3 = new TreeSet<>();
        conjunto3.add("José");
        conjunto3.add("Lucas");
        conjunto3.add("Ruth");
        conjunto3.add("María");
        conjunto3.add("José"); // Repetido, no se añade.

        // Sí guarda orden de entrada pero no admite duplicados
        System.out.println(("TreeSet, ordena por orden natural (numérico, alfabético...) "+conjunto3));
        // Aunque se han añadido 5 elementos, el tamaño es 4 (los repetidos no se incluyen en el conjunto).
        System.out.println("Tamaño del LinkedHashSet: "+conjunto3.size());
    }

}
