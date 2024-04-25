package creditosBanco;

public class Cliente {
	protected String  nombre;
	protected String  apellido;
	protected String  direccion;
	protected int     edad;
	protected Double  sueldoNetoMensual;
	protected Propiedad propiedad;

	public Cliente(String apellido, String nombre, String direccion, int edad, Double sueldoNetoMensual, Propiedad propiedad) {
		this.apellido          = apellido;
		this.nombre            = nombre;
		this.direccion         = direccion;
		this.edad              = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.propiedad         = propiedad;
	}
	
	
	public void realizarSolicitudCreditoPersonal(Double montoASolicitar, int cantidadDeMeses) {
		
		
		this.banco.gestionarPrestamoPersonal(this, montoASolicitar, cantidadDeMeses)
						
		
	}
	
	public void realizarSolicitudCreditoHipotecario(Cliente this, Double montoASolicitar, int cantidadDeMeses, Propiedad propiedad) {
		
		
		
	}
}
