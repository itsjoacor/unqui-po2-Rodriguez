package creditosBanco;

abstract class CreditoGeneral {
	protected Cliente cliente;
	protected Double  monto;
	protected int     meses;
	
	
	
	public CreditoGeneral(Cliente cliente, Double monto, int meses) {
		this.cliente = cliente;
		this.monto   = monto;
		this.meses   = meses;
	}
	
	public double getMonto(){
		return this.monto;
	}
}
