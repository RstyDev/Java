package ar.edu.unlp.oo1.ejercicio1;
import java.time.LocalDate;
public class Ticket {
    LocalDate fecha;
    int cantidadDeProductos;
    double pesoTotal;
    double precioTotal;
    public Ticket(int cantidadDeProductos, double pesoTotal, double precioTotal){
        fecha=LocalDate.now();
        this.cantidadDeProductos=cantidadDeProductos;
        this.pesoTotal=pesoTotal;
        this.precioTotal=precioTotal;
    }

    public double impuesto(){
        return 
    }
}
