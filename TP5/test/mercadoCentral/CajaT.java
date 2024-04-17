package mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaT {
	private Caja                caja;
	private Cliente             cliente;
	private ProductoTradicional productoT1;
	private ProductoCooperativa productoC2;
	private MercadoCentral      mercado;
	
	@BeforeEach
	public void setUp(){
		
		
		cliente    = new Cliente();
		productoT1 = new ProductoTradicional(1000d,3);
		productoC2 = new ProductoCooperativa(2000d,1);
		mercado    = new MercadoCentral();
			/*el mercado tiene 8p
			 * 2c/u 1 2 3 4*/
		caja = new Caja(cliente, mercado);
		cliente.setProductosALlevar(productoT1);
		cliente.setProductosALlevar(productoC2);
		
		
		
		
		
	}
	@Test
	public void testPrecioTotalDeCompra() {
		assertEquals(2800d,     caja.getPrecioTotalDeCompra());
		assertNotEquals(3000d,caja.getPrecioTotalDeCompra());
		
	}
	
	@Test
	public void testStockBeforeCompra() {
		
		assertEquals(8, mercado.stockProductos.size());
		
	}
	
	@Test
	public void testStockPostCompra() {
		caja.confirmarCompra();
		assertEquals(6, mercado.stockProductos.size());
		
	}

}
