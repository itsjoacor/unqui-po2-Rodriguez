package tp2;
import java.time.LocalDate;

public abstract class EmpleadoPlanta {
	protected String nombre;
	protected String direccion;
	protected boolean estadoCivil;
	protected LocalDate fechaDeNacimiento;
	protected Double sueldoBasico;
	
	protected EmpleadoPlanta(String nombre, String direccion, boolean estadoCivil, LocalDate fechaDeNacimiento,
			Double sueldoBasico) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	public int calcularEdad() {
		int anioNac = this.fechaDeNacimiento.getYear();
		int anioActual = LocalDate.now().getYear();
		
		return anioNac - anioActual;
	}
	
	abstract Double sueldoBruto();
	abstract Double retenciones();
	
	
}
	

