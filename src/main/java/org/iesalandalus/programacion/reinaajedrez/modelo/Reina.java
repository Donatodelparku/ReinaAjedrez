package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {

	private Color color;
	private Posicion posicion;
	
	public Reina() {
		color = Color.BLANCO;
		Posicion posicion = new Posicion(1,'d');
	}

	
	public Color getColor() {
		return color;
	}
	
	private void setColor(Color color) {
		if (color == null) {
			throw new NullPointerException();
		}
		this.color = color;
	}
	
	public Posicion getPosicion() {
		return posicion;
	}

	private void setPosicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException();
		}
		this.posicion = posicion;
	}
	
	
	
}
