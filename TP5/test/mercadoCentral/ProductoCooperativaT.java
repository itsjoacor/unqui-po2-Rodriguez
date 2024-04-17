package mercadoCentral;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ProductoCooperativaT {
	
	private ProductoCooperativa arroz;
	private ProductoCooperativa vino;
	
	@BeforeEach
	public void setUp() {
		arroz = new ProductoCooperativa(200d, 1);
		vino  = new ProductoCooperativa(300d, 2);
	}
	
	
	@Test
	public void testConstructor() {
		assertEquals(1, arroz.getID());
		assertEquals(180d, arroz.getPrecio());
		
		assertEquals(2, vino.getID());
		assertEquals(270d, vino.getPrecio());
	}
	
	
	
}






























