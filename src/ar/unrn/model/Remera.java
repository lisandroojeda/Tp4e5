package ar.unrn.model;

public abstract class Remera {

    protected double precio;

    public Remera(double precio){
        if (precio <0)
            throw new RuntimeException("El monto debe ser mayor a cero");
        this.precio = precio;
    }



    protected abstract double  calcularImpuestos(double precio);

    public double obtenerPrecio(){
        return precio + calcularImpuestos(precio);
    }


}
