package creditosBanco;

public class CreditoHipotecario extends CreditoGeneral{
	protected Propiedad propiedad;
	
	public CreditoHipotecario(Cliente cliente, Double monto, int meses, Propiedad propiedad) {
		super(cliente, monto, meses);
		this.propiedad = propiedad;
	}

}
