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
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
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
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		}
		if (pasos <= 0 || pasos > 7) {
			throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
		}
		
		switch (direccion) {
			case NORTE: 
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila() + pasos, posicion.getColumna());
					setPosicion(posicionNueva);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}
				break;
				
			case NORESTE: 
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila() + pasos, (char)(posicion.getColumna() + pasos));
					setPosicion(posicionNueva);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}
				break;
				
			case ESTE: 
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila(), (char)(posicion.getColumna() + pasos));
					setPosicion(posicionNueva);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}
				break;
				
			case SURESTE: 
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila() - pasos, (char)(posicion.getColumna() + pasos));
					setPosicion(posicionNueva);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}
				break;
				
			case SUR: 
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila() - pasos, posicion.getColumna());
					setPosicion(posicionNueva);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}
				break;
				
			case SUROESTE: 
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila() - pasos, (char)(posicion.getColumna() - pasos));
					setPosicion(posicionNueva);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}
				break;
				
			case OESTE: 
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila(), (char)(posicion.getColumna() - pasos));
					setPosicion(posicionNueva);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}
				break;
				
			case NOROESTE: 
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila() + pasos, (char)(posicion.getColumna() - pasos));
					setPosicion(posicionNueva);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}
				break;
				
		}
		
		
		
	}

	@Override
	public String toString() {
		return String.format("color=%s, posicion=(%s)", color, posicion);
	}
	
	
	
//	public static void main(String[] args) throws OperationNotSupportedException {
//		Reina reina = new Reina();
//		System.out.println(reina);
//		reina.mover(Direccion.NOROESTE, 2);
//		System.out.println(reina);
//	}
	
}
