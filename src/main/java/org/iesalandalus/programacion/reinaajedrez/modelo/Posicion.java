package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {

	private int fila;
	private char columna;
	
	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}
	
	
	private int getFila() {
		return fila;
	}
	private void setFila(int fila) {
		if (fila < 1 || fila > 8) {
			throw new IllegalArgumentException("Error, fila no válida");
		}
		this.fila = fila;
	}
	private char getColumna() {
		return columna;
	}
	private void setColumna(char columna) {
		if (columna < 'a' || columna > 'h') {
			throw new IllegalArgumentException("Error, columna no válida");
		}
		this.columna = columna;
	}
	
	
	
	
//	public static void main(String[] args) {
//		Posicion posi = new Posicion();
//		posi.setColumna('u');
//	}
	
}

