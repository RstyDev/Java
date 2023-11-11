package ar.edu.unlp.oo1.ejercicio1;

import java.util.ArrayList;

public class Balanza {
	int cantidadDeProductos;
	double precioTotal;
	double pesoTotal;
	ArrayList<Producto> productos;
	
	public Balanza(){
		cantidadDeProductos=0;
		precioTotal=0.0;
		pesoTotal=0.0;
		productos=new ArrayList<>();
	}
	
	public void ponerEnCero() {
		productos.clear();
		cantidadDeProductos=0;
		precioTotal=0.0;
		pesoTotal=0.0;
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
		cantidadDeProductos++;
		precioTotal+=producto
		
	}
	
}
