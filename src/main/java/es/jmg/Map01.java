package es.jmg;

import java.util.HashMap;
import java.util.Map;
/*
 * Implementaciones de la colección Map
    • HashMap: Ideal para uso general donde el orden no importa y se requiere alto rendimiento.
    • LinkedHashMap: Útil cuando necesitas mantener el orden de inserción de los elementos.
    • TreeMap: Perfecto cuando necesitas que los elementos estén ordenados según las claves.
    • Hashtable: Uso limitado, reemplazado por HashMap y ConcurrentHashMap.
    • ConcurrentHashMap: Mejor opción para aplicaciones multihilo que requieren acceso concurrente seguro al mapa.
 */
/*
 * Métodos 
 *  • put(): Agregar o actualizar un par clave-valor.
    • get(): Obtener el valor asociado con una clave.
    • remove(): Eliminar un par clave-valor.
    • containsKey(): Verificar si una clave existe.
    • containsValue(): Verificar si un valor existe.
    • size(): Obtener el número de elementos en el mapa.
    • isEmpty(): Verificar si el mapa está vacío.
    • clear(): Eliminar todos los elementos del mapa.
    • keySet(): Obtener un conjunto de las claves.
    • values(): Obtener los valores del mapa.
    • entrySet(): Obtener el conjunto de las entradas (pares clave-valor).
    • putAll(): Agregar todos los elementos de otro mapa.
    • getOrDefault(): Obtener un valor o un valor predeterminado si la clave no existe.
 */
public class Map01 {
public static void main(String[] args) {
    Map<String, Integer> mapa = new HashMap<>();
    // Agregar elementos al Map (pares clave-valor)
    mapa.put("Juan", 25);
    mapa.put("Pepe", 30);
    mapa.put("Carlos", 35);

    // Obtener el valor asociado a la clave "Juan"
    System.out.println("Edad de Juan: " + mapa.get("Juan"));  // Imprime 25

    // Verificar si el Map contiene una clave
    System.out.println("¿Contiene la clave 'Pepe'? " + mapa.containsKey("Pepe"));  // Imprime true

    // Verificar si el Map contiene un valor
    System.out.println("¿Contiene el valor 30? " + mapa.containsValue(30));  // Imprime true

}
}
