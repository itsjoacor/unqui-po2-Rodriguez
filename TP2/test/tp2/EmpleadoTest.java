package tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {
	
	private EmpleadoPPermanente empleado;
	private Empresa empresa;
	
	@BeforeEach
	void setUp() {
		empleado = new EmpleadoPPermanente("sho", "calle siempre viva", false, LocalDate.now(), 100d, 2d, 2d);
		empresa = new Empresa("mi empresa", "12345");
	}

	@Test
	void test() {
		empresa.contratarEmpleado(empleado);
		
		assertEquals("el sueldo que deberia tener", empleado.sueldoBruto());
	}

}
