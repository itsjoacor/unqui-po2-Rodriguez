package creditosBanco;

public class Banco {

	
	
	
	public void gestionarPrestamoPersonal(this, Double montoASolicitar, int cantidadDeMeses) {
		
		 if corroborarSiCumplePrestamoPersonal(){
			desombolsoDinero()
			agregarAAprobados()
		 }
		 	agregarARechazados()
		  
	}
	
	public void gestionarPrestamoHipotecario(this, Double montoASolicitar, int cantidadDeMeses) {
		
		 if corroborarSiCumplePrestamoHipot(){
			desombolsoDinero()
			agregarAAprobados()
		 }
		 	agregarARechazados()
		  
	}
}
