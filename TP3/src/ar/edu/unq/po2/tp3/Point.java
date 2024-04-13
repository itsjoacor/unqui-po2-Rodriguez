package ar.edu.unq.po2.tp3;
	//E8
public class Point {
    private int parametrox;
    private int parametroy;

    // Constructor que recibe dos parámetros de tipo int
    public Point(int parametrox, int parametroy) {
        this.parametrox = parametrox;
        this.parametroy = parametroy;
    }

	 public Point() {
		 this.parametrox = 0;
	     this.parametroy = 0;
	 }
	 
	 
	 
	 public Point moverDeAaB(Point a, Point b){
		 Point puntoInicial = a;
		 Point puntoFinal   = b;
		 int bx = puntoFinal.parametrox;
		 int by = puntoFinal.parametroy;
		 puntoInicial.parametrox = bx;
		 puntoInicial.parametroy = by;
		 
		 return puntoInicial;
	 }
	 
	 public Point sumatoriaDePuntos(Point a, Point b){
		 int axbx = (a.parametrox + a.parametroy);
		 int bxby = (b.parametrox + b.parametroy);

		Point puntoSumado = new Point (axbx, bxby);
		 return puntoSumado;
		 
	 }
	 

}
