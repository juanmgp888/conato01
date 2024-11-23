package es.jmg;
import java.util.ArrayList;
import java.util.List;
public class ArrayList03 {
    // https://www.arquitecturajava.com/list-vs-arraylist-que-es-mejor/
    // Usar List a la izquierda del igual, en lugar de ArrayList, por si en el futuro quisiéramos cambiar de implementación
    // List incluye: Vector, ArrayList y LinkedList
      public static void main(String[] args) {
      
        List<String> milista= new ArrayList<String>();
        milista.add("hola");
        milista.add("que");
        milista.add("tal");
        milista.add("estas");
        milista.add("hola");
        
        imprimirLista(milista);
    
      }

      public static void imprimirLista(List<String> lista) {
      // List en lugar de ArrayList, como en la creación de arriba
      /*
       * De esta manera se aporta flexibilidad ya que el método imprimirLista no depende
       * directamente de una implementación concreta de la clase sino de un interface que
       * muchas clases pueden implementar según nuestras necesidades. (ArrayList, Vector o LInkedList)
       */
        for (String cadena: lista) {
          System.out.println(cadena);
        }
      }
    
}
