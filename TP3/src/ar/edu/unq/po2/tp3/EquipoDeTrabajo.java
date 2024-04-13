package ar.edu.unq.po2.tp3;


//E11
public class EquipoDeTrabajo {
	private String nombre;
	private Persona[] integrantes;
	
	
	public EquipoDeTrabajo(String nombre,Persona[] personas){
		this.nombre = nombre;
		this.integrantes = personas;
	}
	
	public String nombreEquipo() {
		return this.nombre;
	}
	
	public Double promedioEdadEquipo(){
		Persona[] equipoTrabajo = this.integrantes;
		
		int cantidadIntegrantes = integrantes.length;
		int sumaEdades = 0;
		
		for (Persona persona : equipoTrabajo) {
			sumaEdades += persona.miEdad();
		}
		return ((double)sumaEdades / cantidadIntegrantes);
	}
}	
	//Falta instanciar 5 personas y calcular el promedio de edad.
