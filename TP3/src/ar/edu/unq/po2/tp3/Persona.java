package ar.edu.unq.po2.tp3;
import java.time.LocalDate;
	//E10
public class Persona {
	private String nombre;
	private LocalDate fechaNac;
	
	public Persona(String nombre, LocalDate fechaNac) {
		this.nombre   = nombre;
		this.fechaNac = fechaNac;

	
	}
	
	public String miNombre() {
		return this.nombre;
		
	}
	
	public LocalDate miFechaNac() {
		return this.fechaNac;
	}
	
	public int miEdad(){
		return
		(LocalDate.now().getYear() -		
		this.fechaNac.getYear());
		
	}
	
	public boolean menorQue(Persona p2) {
		int edadP1 = this.miEdad();
		int edadP2 = p2.miEdad();
		
		
		return edadP1 < edadP2;
		
		
		
	}
	
}

/*
 * 1-
 * Si un objeto x pide la edad de la persona, se lo estaria
 * "preguntando" al objeto ya que no sabe como calcularlo, o
 * como es que se implementa miEdad() internamente. 
 * Esto se llama encapsulamiento, esto es de cierta forma ocultar
 * los detalles de implementacion de un objeto para que no se pueda
 * manipular el dado y asi poder mantener una estabilidad y consistencia
 * en los objetos.
 * 
 * 
 * 
 * 
 * */
