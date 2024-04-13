package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
 //E6
public class Multioperador {

	public int suma(ArrayList<Integer> numeros){
		int sumatoria = 0;
		for(int num : numeros) {
			sumatoria += num;
		}
		return sumatoria;
	}

	
	public int resta(ArrayList<Integer> numeros){
		int restaTotal = 0;
		for (int num : numeros) {
			restaTotal -= num;
		}
		return restaTotal;
	}

	
	
	public int multiplicacion(ArrayList<Integer> numeros){
		int multiplicacionTotal = 1;
		for (int num : numeros) {
			multiplicacionTotal *= num;
		}
		return multiplicacionTotal;
	}
	


}	