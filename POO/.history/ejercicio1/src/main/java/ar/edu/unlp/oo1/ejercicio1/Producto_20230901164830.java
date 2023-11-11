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

    public void setPrecioPorKilo(double precioPorKilo){
        this.precioPorKilo=precioPorKilo;
    }

    public void setPeso(double pesoKg){}
    public double getPeso(){
        return pesoKg;
    }

    public double getPrecio(){
        return precioPorKilo*pesoKg;
    }
}
