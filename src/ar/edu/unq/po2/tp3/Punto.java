package ar.edu.unq.po2.tp3;

import java.awt.Point;

public class Punto {
	private float x;
	private float y ;
	
	public Punto() {
		this.setXY(0, 0);
	}
	
	public Punto(float x, float y) {
		this.setXY(x, y);
	}

	private void setX(float x) {
		this.x = x;
	}
	
	private float getY() {
		return this.y;
	}
	
	private float getX() {
		return this.x;
	}

	private void setY(float y) {
		this.y = y;
	}
	
	private void setXY(float x, float y) {
		this.setX(x);
		this.setY(y);
	}
	
	public void moverPuntoA(float x, float y) {
		this.setXY(x, y);
	}
	
	public Punto sumarPunto(Punto punto ) {
		Punto resultante = new Punto( this.getX() + punto.getX(), this.getY() + punto.getY());
		
		return resultante;
	}
	
	
}
