package supermercado;


public class Producto {
	protected String  nombre;
	protected Double  precio;
	protected boolean cuidado; 
	
	public Producto(String nombre, double precio, boolean cuidado) {
		this.nombre  = nombre;
		this.precio  = precio;
		this.cuidado = cuidado; 
	}
	
	public Producto(String nombre, double precio) {
		this.nombre  = nombre;
		this.precio  = precio;
		this.cuidado = false;
	}

	public Double getPrecio() {
		
		return this.precio;
	}

	public String getNombre() {
		
		return this.nombre;
	}

	public boolean esPrecioCuidado() {
		
		return this.cuidado;
	}

	public void aumentarPrecio(double aumento) {
		
		this.precio += aumento;
	}

}
