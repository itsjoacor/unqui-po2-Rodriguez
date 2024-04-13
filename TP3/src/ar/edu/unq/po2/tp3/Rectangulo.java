package ar.edu.unq.po2.tp3;
	//E9
@SuppressWarnings("unused")
public class Rectangulo {
	
	private Point esqSupIzq;
	private Point esqSupDer; 
	private Point esqInfDer; 
	private Point esqInfIzq; 
	private int   tamanio;

	//Tener en cuenta como se crea el rectangulo java.
	//En base a un parametro dado del ancho del rectangulo, su altura sera la mitad
	//Si elegis 15,, su altura sera 8.
	//Siempre arranca en el Point (0,0)
	//Siempre va a ser un rectangulo horizontal
	
	public Rectangulo(int size){
		int tamanio      = size;
		int sizeHalf = (Math.round(size)/2);
		
		esqSupIzq = new Point(0, 0);
		esqSupDer = new Point(size, 0);
		esqInfDer = new Point(size, -sizeHalf);
		esqInfIzq = new Point(0, -sizeHalf);
		
	}
	
	public double areaDelRectangulo(Rectangulo r) {
        int base   = r.tamanio;
        int altura = (Math.round(r.tamanio)/2);
        
        return base * altura;
    }


	public double perimetroDelRectangulo(Rectangulo r) {
		int base   = r.tamanio;
        int altura = (Math.round(r.tamanio)/2);
        
        return 2 *(base + altura);
    }
	
	
	public String esVerticalUHorizontal(Rectangulo r){
		
		return "El rectangulo con base" + r.tamanio + "siempre es horizontal.";
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
