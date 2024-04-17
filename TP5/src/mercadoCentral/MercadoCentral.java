package mercadoCentral;

import java.util.ArrayList;
import java.util.List;

public class MercadoCentral {
	protected List<Producto> stockProductos;
	
	
	public MercadoCentral() {
		Producto producto1  = new ProductoCooperativa(100d, 1);
		Producto producto2  = new ProductoCooperativa(200d, 2);
		Producto producto3  = new ProductoTradicional(300d, 3);
		Producto producto4  = new ProductoTradicional(400d, 4);

		this.stockProductos = new ArrayList<Producto>();
		setProductoStock(producto1);
		setProductoStock(producto1);
		setProductoStock(producto2);
		setProductoStock(producto2);
		setProductoStock(producto3);
		setProductoStock(producto3);
		setProductoStock(producto4);
		setProductoStock(producto4);
		/*Para poder llevar acabo un ejemplo
		 * inicialmente el supermercado tiene 
		 * 3 productos, el 1, 2 y el 3. 
		 * Con stock de 2u cada uno.*/
	

	}
	
	public void setProductoStock(Producto producto){
		this.stockProductos.add(producto);
		
	}

	public void ajustarStock(Producto p) {
		
		this.stockProductos.remove(p);
		
		
	}
	
	
	
}



























