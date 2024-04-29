package creditosBanco;

public class Cliente {
	protected String    nombre;
	protected String    apellido;
	protected String    direccion;
	protected int       edad;
	protected Double    sueldoNetoMensual;
	protected Propiedad propiedad;
	protected Banco     banco;
	protected boolean estadoSolicitud;

	public Cliente(String apellido, String nombre, String direccion, int edad, Double sueldoNetoMensual, Propiedad propiedad, Banco banco) {
		this.apellido          = apellido;
		this.nombre            = nombre;
		this.direccion         = direccion;
		this.edad              = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.propiedad         = propiedad;
		this.banco             = banco;
		this.estadoSolicitud   = false;
		
		
		solicitarRegistroEnBanco();
	}
	
	
	private void solicitarRegistroEnBanco() {
		this.banco.agregarCliente(this);
		
	}


	public double getSueldoAnual() {
		return this.sueldoNetoMensual * 12d;
	}
	
	
	public void realizarSolicitudTipoPersonal(double monto, int plazo) {
		Banco bancoASolicitar = this.banco;
		
		bancoASolicitar.gestionarPrestamoPersonal(this, monto, plazo);
	}
	
	
	public void realizarSolicitudTipoHipot(double monto, int plazo, Propiedad propiedad) {
		Banco bancoASolicitar = this.banco;
		
		bancoASolicitar.gestionarPrestamoHipotecario(this, monto , plazo, this.propiedad);
	}
	
	public void setEstadoSolicitud(boolean estadoSol) {
		
		this.estadoSolicitud = estadoSol;
	}
	
	public double getSueldoMensual() {
		return this.sueldoNetoMensual;
	}
	
	public int getEdad() {
		return this.edad;
	}
}





































































































