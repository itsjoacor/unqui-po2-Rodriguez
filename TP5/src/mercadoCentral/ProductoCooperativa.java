package mercadoCentral;

public class ProductoCooperativa extends Producto {

	
	public ProductoCooperativa(Double precio, int codigoId) {
		super(precio, codigoId);
	}
	
	public Double getPrecio(){
		
		return this.precio * 0.9d;
	}

}
