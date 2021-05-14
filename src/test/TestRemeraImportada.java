package test;

import ar.unrn.model.RemeraImportada;
import ar.unrn.model.RemeraNacional;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRemeraImportada {
    @Test
    public void calculoDePrecioRemeraNacional(){

        RemeraImportada remeraConEstampa = new RemeraImportada(500.00);
        double precioEsperado = 665;
        assertEquals(precioEsperado,remeraConEstampa.obtenerPrecio());

    }
}
