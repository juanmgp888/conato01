package es.jmg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PromedioTest {

    @Test
    public void testPromedio() {
        
        Promedio promedioEdad = new Promedio();
        int[] arregloEdades = {40,80,60,100};

        double resultadoPromedio = promedioEdad.calcularPromedio(arregloEdades);

        assertEquals(resultadoPromedio, 70,0.00001);
    }
}
