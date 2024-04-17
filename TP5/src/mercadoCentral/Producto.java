package mercadoCentral;


abstract class Producto {
	protected Double precio;
	protected int codigoId;
	
	public Producto(Double precio, int codigoId) {
		this.precio   = precio;
		this.codigoId = codigoId;
	}
	
	public Double getPrecio(){
		
		return this.precio;
	}
	
	public int getID(){
		return this.codigoId;
	}

}
