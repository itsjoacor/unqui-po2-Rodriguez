package supermercado;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class SupermercadoTest {
	
	private Producto arroz;
	private Producto detergente;
	private Supermercado supermercado;
	
	@BeforeEach
	public void setUp() {
		arroz        = new Producto("Arroz", 18.9d, true);
		detergente   = new Producto("Detergente", 75d);
		supermercado = new Supermercado("Joaco", "Joaco2");
	}
	
	@Test
	public void testCantidadDeProductos() {
		assertEquals(0, supermercado.getCantidadDeProductos());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(2, supermercado.getCantidadDeProductos());
	}
	
	@Test
	public void testPrecioTotal() {
		assertEquals(0.0d, supermercado.getPrecioTotal());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(93.9d, supermercado.getPrecioTotal());
	}
}
