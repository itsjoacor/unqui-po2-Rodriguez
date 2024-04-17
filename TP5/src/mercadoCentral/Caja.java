package mercadoCentral;


import java.util.List;

public class Caja {
	protected List<Producto> productosDeLCliente;
	protected MercadoCentral miMercado;
	protected Cliente        cliente;
	
	public Caja(Cliente cliente, MercadoCentral miMercado){
		this.productosDeLCliente = cliente.getProductosDelCliente();
		this.miMercado           = miMercado;
	}
	

	public Double getPrecioTotalDeCompra(){
		
		
		return this.productosDeLCliente.stream()
				.mapToDouble(p -> p.getPrecio())
				.sum();
		
	}
	
	public void confirmarCompra(){
		for (Producto p : this.productosDeLCliente){
            miMercado.ajustarStock(p);
        }
	}
	/*
	 * Modificar implementacion de caja.
	 * 
	 */

	
}



