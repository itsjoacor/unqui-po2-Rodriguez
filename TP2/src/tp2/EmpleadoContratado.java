package tp2;
import java.time.LocalDate;

public class EmpleadoPContratado extends EmpleadoPlanta{
	
	protected EmpleadoPContratado(String nombre, String direccion, boolean estadoCivil, LocalDate fechaDeNacimiento,
			Double sueldoBasico) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		// TODO Auto-generated constructor stub
	}

	
	

}


/*
 public    -> todo el sistema
 private   -> solo la clase
 protected -> ver la clase y las subclases
 abstract  -> lo que ya se 
 */