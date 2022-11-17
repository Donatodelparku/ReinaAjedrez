package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;
import javax.naming.OperationNotSupportedException;
import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;

public class MainApp {
	
	private static Reina reina;
	
	private static void crearReinaDefecto() {
		reina = new Reina();
	}
	
	private static void crearReinaColor() {
		Color color = Consola.elegirColor();
		reina = new Reina(color);
	}
	
	private static void mover() {
		Consola.mostrarMenuDirecciones();
		Direccion direccion = Consola.elegirDireccion();
		int pasos = Consola.elegirPasos();
		try {
			reina.mover(direccion, pasos);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
	}
	
	private static void mostrarReina() {
		if (reina == null) {
			System.out.println("ERROR: No hay reina aún");
		} else {
			System.out.println(reina);
		}
	}
	
	private static void ejecutarOpcion(int opcion) {
		switch (opcion) {
		case 1: 
			crearReinaDefecto();
			break;
		case 2:
			crearReinaColor();
			break;
		case 3:
			if (reina != null) {
				mover();
			} 
			break;
		case 4:
			Consola.despedirse();
			break;

		}
	}
	
	public static void main(String[] args) {
		
		int opcion;
		do {
			Consola.mostrarMenu();
			opcion = Consola.elegirOpcionMenu();
			ejecutarOpcion(opcion);
			if (opcion != 4) {
				mostrarReina();
			}
		} while (opcion != 4);
	}
}
