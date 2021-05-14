package ar.unrn.model;

import ar.unrn.model.Remera;

public class RemeraImportada extends Remera {

    private final double porcentajeRecargo = 0.03;
    private final double porcentajeAduanero = 0.05;
    private final double porcentajeComercio = 0.25;



    public RemeraImportada(double precio) {
        super(precio);
    }

    @Override
    protected double calcularImpuestos(double precio) {
        return precio*porcentajeRecargo + precio*porcentajeComercio+ precio*porcentajeAduanero;
    }
}
