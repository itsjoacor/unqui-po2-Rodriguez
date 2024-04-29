package creditosBanco;

import java.util.List;
import java.util.ArrayList;

public class Banco {
	protected List<Cliente> clientes;
	protected List<CreditoGeneral> solicitudesAprobadas;
	protected List<CreditoGeneral> solicitudesRechazadas;
	
	public Banco(){
		this.clientes              = new ArrayList<Cliente>();
		this.solicitudesAprobadas  = new ArrayList<CreditoGeneral>();
		this.solicitudesRechazadas = new ArrayList<CreditoGeneral>();
	}
	
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void removerCliente(Cliente cliente) {
		this.clientes.remove(cliente);
	}
	
	public void gestionarPrestamoPersonal(Cliente cliente, Double monto, int meses) {
		CreditoGeneral prestamoPersonal = new CreditoPersonal(cliente, monto, meses);
		
		 if (corroborarSiCumplePrestamoPersonal(cliente, monto, meses)){
			 desembolsoDinero(cliente, true);
			 agregarAAprobados(prestamoPersonal);
			 
		 } else {
			 desembolsoDinero(cliente, false);
			 agregarARechazados(prestamoPersonal);
		 }
		 	
	}
	
	public void gestionarPrestamoHipotecario(Cliente cliente, Double monto, int meses, Propiedad propiedad) {
		CreditoGeneral prestamoHipotec = new CreditoHipotecario(cliente, monto, meses, propiedad);
		
		 if (corroborarSiCumplePrestamoHipot(cliente, monto, meses, propiedad)){
			 desembolsoDinero(cliente, true);
			 agregarAAprobados(prestamoHipotec);
		 } else {
			 desembolsoDinero(cliente, false);
			 agregarARechazados(prestamoHipotec);
		 }
		 
	}
	
	public void desembolsoDinero(Cliente cliente, boolean siono){
		
		cliente.setEstadoSolicitud(siono);
	}
	
	public boolean corroborarSiCumplePrestamoPersonal(Cliente cliente, double monto,int meses) {
		
		return (cliente.getSueldoAnual() > 15000d) 
				&& ((monto / meses) <= (cliente.getSueldoMensual() * 0.3) );
				
				
	}
	
	public boolean corroborarSiCumplePrestamoHipot(Cliente cliente, double monto,int meses, Propiedad propiedad) {
		
		return ((monto/meses) <= (cliente.getSueldoMensual() * 0.5)) &&
			   (monto <= (propiedad.getValorFiscal() * 0.3)) &&
			   (edadCuandoTermineDePagar(cliente, meses) < 65);
				
	}
	
	public void agregarAAprobados(CreditoGeneral credito) {
		
		this.solicitudesAprobadas.add(credito);
	}
	
	public void agregarARechazados(CreditoGeneral credito) {
		this.solicitudesRechazadas.add(credito);
	}
	
	public int edadCuandoTermineDePagar(Cliente cliente, int meses) {
		
		return (cliente.getEdad() + (Math.round(meses/12)) );
		
	}
	
	public double montoTotalADesembolsar(){
		
		return this.solicitudesAprobadas.stream()
				   .mapToDouble(cred -> cred.getMonto())
				   .sum();
	
	
	}
		
}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
}
