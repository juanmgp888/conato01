package es.jmg;
public class String01{
    public static void main(String[] args){

        // Reverse a string
        String origen = "aeiou";
        String destino = "";
  
        for (int i=0;i<origen.length();i++){
            destino += origen.charAt(origen.length()-1-i);
            System.out.println(origen.charAt(origen.length()-1-i));        
            }
        System.out.println(destino);
        

        // Qué posición de la cadena ocupa el carácter 'i'
        for (int i=0;i<origen.length();i++){ // Al ser un String, el length es un método y lleva ()
            if (origen.charAt(i) == 'i'){  // == de comparación, no poner = de asignación !!
                System.out.println("La 'i' ocupa (empezando por cero) la posición número "+i+" en la cadena "+origen);
            }
        }

        // Extrae una subcadena que no contenga ni el caracter inicial ni el final
        System.out.println(origen.substring(1, origen.length()-1));

        // Compara si dos cadenas son iguales siendo case sensitive
        String cadenaComparacion = "AEIOU";
        String cadenaComparacion2 = "aeiou";

        if (origen.equals(cadenaComparacion)){
            System.out.println("Sí, la cadena "+origen+ " es idéntica a "+cadenaComparacion);
        }
        else { System.out.println("No, la cadena "+origen+ " NO es idéntica a "+cadenaComparacion);};
        
        if (origen.equals(cadenaComparacion2)){
            System.out.println("Sí, la cadena "+origen+ " es idéntica a "+cadenaComparacion2);
        }
        else { System.out.println("No, la cadena "+origen+ " NO es idéntica a "+cadenaComparacion2);};

        // Compara sin case sensitive
        if (origen.equalsIgnoreCase(cadenaComparacion)){
            System.out.println("Sí, las vocales de la cadena "+origen+ " son las mismas que las de la cadena: "+cadenaComparacion);
        }
        else { System.out.println("No, las vocales de la cadena "+origen+ " NO son las mismas que las de la cadena: "+cadenaComparacion);};
    }
}
