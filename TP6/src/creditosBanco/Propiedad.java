package creditosBanco;

public class Propiedad {
	
	protected String descripcion;
	protected String direccion;
	protected int    valorFiscal;
	
	
	public Propiedad(String descripcion, String direccion, int valorFiscal){
		this.descripcion = descripcion;
		this.direccion   = direccion;
		this.valorFiscal = valorFiscal;
	}
	
	public int getValorFiscal() {
		return this.valorFiscal;
	}
	
	
	
}
