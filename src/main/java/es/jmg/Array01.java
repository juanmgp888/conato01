package es.jmg;
import java.util.Arrays;  // Para usar el método toString

public class Array01{


    public static void main(String[] args){

        String[] array01 = {"Pepe","Manolo","Lola","Clara"};

        System.out.println("Contenido del array01 es una dirección de memoria aprox.: "+array01); 
        System.out.println("Contenido del array01 usando toString: "+Arrays.toString(array01));
        System.out.println(array01[0]);

        // Con For Each
        for (String i : array01){  // String sin los corchetes. "i" es propiamente el contenido
        System.out.println("Contenido del array01 es "+i); 
                // Pepe       
                // Manolo
                // Lola
                // Clara
        }
    }
}
