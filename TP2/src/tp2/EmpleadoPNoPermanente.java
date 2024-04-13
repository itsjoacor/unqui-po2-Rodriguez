package tp2;
import java.time.LocalDate;

public class EmpleadoPNoPermanente extends EmpleadoPlanta{
	
	private LocalDate fechaFin;
	private Double cantidadHorasExtras;
	
	public EmpleadoPNoPermanente(String nombre, String direccion, boolean estadoCivil, LocalDate fechaDeNacimiento,
			Double sueldoBasico, LocalDate fechaFin, Double cantidadHorasExtras) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		
		this.fechaFin            = fechaFin;
		this.cantidadHorasExtras = cantidadHorasExtras;
	}
	
	
	@Override
	public Double sueldoBruto() {
		
		return 
		this.sueldoBasico           + 
		this.dineroPorHorasExtras() +
		this.retenciones();
	
		
		
	}
	
	private Double dineroPorHorasExtras() {
		return this.cantidadHorasExtras * 40d;
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
		this.retencionEdad()              +
		this.retencionJubilatorio()       +
		this.retencionHorasExtra();
	}
	
	
	public Double retencionEdad()       {
		if (this.calcularEdad() > 50) {
			return 25d;
		}else {
			return 0d;
		}
	}

	
	public Double retencionObraSocial() {
		
		return this.sueldoBasico * 0.1d;
			  
	}
	
	public Double retencionJubilatorio() {
		return this.sueldoBasico * 0.1d;
		
	}

	
	public Double retencionHorasExtra() {
		return this.cantidadHorasExtras * 5d;
	}
	

	
	
}
