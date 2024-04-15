package supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> catalogo;
	
	
	public Supermercado(String nombre, String direccion) {
		this.nombre    = nombre;
		this.direccion = direccion;
		this.catalogo = new ArrayList<Producto>();
	}

	public int getCantidadDeProductos() {
		
		
		return this.catalogo.size();
	}

	public void agregarProducto(Producto producto) {
		
		this.catalogo.add(producto);
	}

	public Double getPrecioTotal() {
		
		return this.catalogo.stream()
				.mapToDouble(p -> p.getPrecio())
				.sum();
	}
	


}
