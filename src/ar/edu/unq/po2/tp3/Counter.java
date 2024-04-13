package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.String;


public class Counter{
	private ArrayList<Integer> listaNum;
	
	
	public Counter(ArrayList<Integer> listaA) {
		this.listaNum = listaA;
	}	                                          // ver hasta aca creacion arraylist
	
// ------------------------------------
	//E1A
	protected int numPares() {
        int cantidadDePares = 0;
        for (int numero : this.listaNum) {
            if (numero % 2 == 0) {
            	cantidadDePares++;
            }
        }
        
        return cantidadDePares;
    }
	
	//E1B
	protected int numImares() {
        int cantidadDeImpares = 0;
        for (int numero : this.listaNum) {
            if (numero % 2 != 0) {
            	cantidadDeImpares++;
            }
        }
        
        return cantidadDeImpares;
    }
	
	//E1C
	
	protected int multiplosDe(int numeroA) {
        int cantidadDeMultiplos = 0;
        for (int numero : this.listaNum) {
            if (numero % 2 == 0) {
            	cantidadDeMultiplos++;
            }
        }
        
        return cantidadDeMultiplos;
    }

// ----------------------------------------
	//E2
	
	protected int numConMayorCantDigitPares(){
		ArrayList<Integer> nums = this.listaNum;
		Integer numConMayorCantDig = nums.get(0);

		
		 for (int i = 1; i < nums.size(); i++) {
	            if (cantidadDigitosPares(nums.get(i)) > cantidadDigitosPares(numConMayorCantDig)){
	            	numConMayorCantDig = nums.get(i);
	            }
	    }
		return numConMayorCantDig;
	}
	
	
	
	
	protected int cantidadDigitosPares(int num) {
		int cantDigPar = 0;
		
		while (num != 0) {
            int digito = num % 10;
            if (digito % 2 == 0) { 
            	cantDigPar++;
            }
            num = num / 10; 
        }
		
		
		return cantDigPar;
		
	}
	
	
	
	// ----------------------------------------
		//E3
		
	protected int maximoComunMultiplo(int x, int y) {
		int maxNum = -1;
		
		for (int i = 100; i >= 0; i--) {
			if (i % x == 0 && i % y == 0) {
				maxNum = i;
                break;
			}
		}
		return maxNum;
		
		
	}

	
	
	
}




