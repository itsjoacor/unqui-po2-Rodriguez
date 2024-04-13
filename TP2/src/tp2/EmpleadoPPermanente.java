package tp2;
import java.time.LocalDate;

public class EmpleadoPPermanente extends EmpleadoPlanta{
	
	private Double cantidadHijos;
	private Double antiguedad;
	

	public EmpleadoPPermanente(String nombre, String direccion, boolean estadoCivil, LocalDate fechaDeNacimiento,
			Double sueldoBasico, Double cantidadHijos, Double antiguedad) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		
		this.cantidadHijos = cantidadHijos;
		this.antiguedad    = antiguedad;
	}
	
	@Override
	public Double sueldoBruto() {
		
		return  this.sueldoBasico + this.salarioFamiliar();
	
		
		
	}
	public Double salarioFamiliar() {
		
		return
				this.asignacionPorHijo() + this.asignacionPorConyugue() + 
				this.dineroPorAntiguedad()+ this.retenciones();
				
	}
	
	private Double dineroPorAntiguedad() {
		return this.antiguedad * 50d;
	}

	public Double asignacionPorHijo() {
		
		return
				this.cantidadHijos * 150d;
	}
	
	public Double asignacionPorConyugue() {
				if (this.estadoCivil) {
					return 100d;
				}else {
					return 0d;
				}
				
	}
	
	public Double retenciones() {
		return this.retencionObraSocial() +
		this.retencionPorHijos()   +
		this.retencionJubilatorio();
	}
	
	public Double retencionObraSocial() {
		
		return this.sueldoBasico * 0.1d;
			  
	}
	
	public Double retencionJubilatorio() {
		return this.sueldoBasico * 0.15d;
		
	}
	public Double retencionPorHijos() {
		return this.cantidadHijos * 20d;
	}
	

	
}

