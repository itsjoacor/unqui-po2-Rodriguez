package mercadoCentral;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ProductoTradicionalT {
	
	private ProductoTradicional agua;
	private ProductoTradicional vinagre;
	
	@BeforeEach
	public void setUp() {
		arroz = new ProductoTradicional(1000d, 3);
		vino  = new ProductoTradicional(500d, 4);
	}
	
	
	@Test
	public void testConstructor() {
		assertEquals(3, agua.getID());
		assertEquals(1000d, agua.getPrecio());
		
		assertEquals(4, vinagre.getID());
		assertEquals(500d, vinagre.getPrecio());
	}
	
	
	
}

