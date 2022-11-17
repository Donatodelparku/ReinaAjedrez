package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;
import javax.naming.OperationNotSupportedException;
import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;

public class MainApp {
	
	private Reina reina;
	
	private void crearReinaDefecto() {
		reina = new Reina();
	}
	
	private void crearReinaColor() {
		Color color = Consola.elegirColor();
		reina = new Reina(color);
	}
	
	private void mover() {
		Consola.mostrarMenuDirecciones();
		Direccion direccion = Consola.elegirDireccion();
		int pasos = Consola.elegirPasos();
		try {
			reina.mover(direccion, pasos);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
	}
	
	private void mostrarReina() {
		if (reina == null) {
			System.out.println("ERROR: No hay reina aún");
		} else {
			reina.toString();
		}
	}
	
	private void ejecutarOpcion(int opcion) {
		switch (opcion) {
		case 1: 
			crearReinaDefecto();
			break;
		case 2:
			crearReinaColor();
			break;
		case 3:
			mover();
			break;
		case 4:
			Consola.despedirse();
			break;

		}
	}
	
	public static void main(String[] args) {
		
	}
}
