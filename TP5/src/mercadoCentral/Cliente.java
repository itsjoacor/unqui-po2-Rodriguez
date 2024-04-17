package mercadoCentral;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	protected List<Producto> productosQueLlevo;
	
	public Cliente() {
		this.productosQueLlevo = new ArrayList<Producto>();
		
	}
	
	public void setProductosALlevar(Producto producto){
		this.productosQueLlevo.add(producto);
		
	}

	public List<Producto> getProductosDelCliente() {
		return this.productosQueLlevo;
	}
}
