package es.jmg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculosConMathTest {

    @Test
    public void testRaizCuadrada() {
        
    // CalculosConMath raiz = new CalculosConMath(); SI NO FUERA STATIC
    // Como lo declaré static en la clase CalculosConMath, tampoco ahora
    // genero una instancia. De ahí la nomenclatura de abajo.
        double resultado = CalculosConMath.raizCuadrada(64d);

        assertEquals(resultado, 8.0,0.00001);
    }
}
