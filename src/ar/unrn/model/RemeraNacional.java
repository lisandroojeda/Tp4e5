package ar.unrn.model;

import ar.unrn.model.Remera;

public class RemeraNacional extends Remera {


    private final double porcentajeTransporte = 0.015;
    private final double porcentajeBonificado = -0.20;
    private final double porcentajeComercio = 0.15;

     public RemeraNacional(double precio) {
        super(precio);
    }

    @Override
    protected double calcularImpuestos(double precio) {
        return precio*porcentajeBonificado + precio*porcentajeComercio+ precio*porcentajeTransporte;
    }
}
