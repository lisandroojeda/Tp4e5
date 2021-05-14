package test;

import ar.unrn.model.RemeraNacional;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRemeraNacional {
    @Test
    public void calculoDePrecioRemeraNacional(){

        RemeraNacional remeraConEstampa = new RemeraNacional(500.00);
        double precioEsperado = 482.50;
        assertEquals(precioEsperado,remeraConEstampa.obtenerPrecio());

    }
}
