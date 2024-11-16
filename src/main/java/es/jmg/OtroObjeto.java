package es.jmg;
public class OtroObjeto {
// Es instanciada desde otra clase en este mismo directorio: MiPrograma.java
    private String nombre;

    // Constructor que recibe un nombre
    public OtroObjeto(String nombre) {
        this.nombre = nombre; 
        // this se refiere al declarado en la clase. La parte derecha del =, es el argumento
    }

    public void saludar() {
        System.out.println("¡Hola, " + nombre + "!");
    }
}