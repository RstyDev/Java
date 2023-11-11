package ar.edu.unlp.oo1.ejercicio1;

public class Producto {
    double pesoKg;
    double precioPorKilo;
    String descripcion;
    public Producto(){
    }

    public Producto(double peso,double precioPorKilo, String descripcion){
        this.descripcion=descripcion;
        this.precioPorKilo=precioPorKilo;
        this.pesoKg=peso;
    }

    public double getPeso(){
        return pesoKg;
    }

    public void setPrecioPorKilo(double precioPorKilo){
        thsi.precioPorKilo=precioPorKilo;
    }

    public double getPrecio(){
        return precioPorKilo*pesoKg;
    }
}
