package ar.edu.unlp.oo1.ejercicio1;


public class Balanza {
	int cantidadDeProductos;
	double precioTotal;
	double pesoTotal;
	
	public Balanza(){
		cantidadDeProductos=0;
		precioTotal=0.0;
		pesoTotal=0.0;
	}
	
	public int getCantidadDeProductos(){
		return cantidadDeProductos;
	}
	public void ponerEnCero() {
		cantidadDeProductos=0;
		precioTotal=0.0;
		pesoTotal=0.0;
	}
	
	public void agregarProducto(Producto producto) {
		cantidadDeProductos++;
		precioTotal+=producto.getPrecio();
		pesoTotal+=producto.getPeso();
	}
	
}
