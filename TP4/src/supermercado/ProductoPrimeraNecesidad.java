package supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	private Double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean cuidado, Double descuento) {
		super(nombre, precio, cuidado);
		this.descuento = descuento;
	}
	
	
	public Double getPrecio(){
		
		return (this.precio *((100-this.descuento)/100) );
	}
	

}
 