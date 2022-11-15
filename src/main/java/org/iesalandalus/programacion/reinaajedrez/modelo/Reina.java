package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {

	private Color color;
	private Posicion posicion;
	
	public Reina() {
		color = Color.BLANCO;
		posicion = new Posicion(1,'d');
	}

	public Reina(Color color) {
		setColor(color);
		if (color == Color.NEGRO ) {
			posicion = new Posicion(8,'d');
		} else {
			posicion = new Posicion(1,'d');
		}
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
	
	
	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
		
		if (direccion == null) {
			throw new IllegalArgumentException("ERROR: Direccion no válida");
		}
		if (pasos <= 0 || pasos > 7) {
			throw new IllegalArgumentException("ERROR: Pasos no válida");
		}
		
		switch (direccion) {
			case NORTE: 
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila() + pasos, posicion.getColumna());
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Posición no válida");
				}
				break;
				
			case NORESTE: 
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila() + pasos, (char)(posicion.getColumna() + pasos));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Posición no válida");
				}
				break;
				
			case ESTE: 
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila(), (char)(posicion.getColumna() + pasos));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Posición no válida");
				}
				break;
				
			case SURESTE: 
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila() - pasos, (char)(posicion.getColumna() + pasos));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Posición no válida");
				}
				break;
				
			case SUR: 
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila() - pasos, posicion.getColumna());
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Posición no válida");
				}
				break;
				
			case SUROESTE: 
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila() - pasos, (char)(posicion.getColumna() - pasos));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Posición no válida");
				}
				break;
				
			case OESTE: 
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila(), (char)(posicion.getColumna() - pasos));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Posición no válida");
				}
				break;
				
			case NOROESTE: 
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila() + pasos, (char)(posicion.getColumna() - pasos));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Posición no válida");
				}
				break;
			
		}
		
	}
	
	
	
}
