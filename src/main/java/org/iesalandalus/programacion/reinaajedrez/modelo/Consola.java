package org.iesalandalus.programacion.reinaajedrez.modelo;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	private Consola() {
		
	}
	
	public static void mostrarMenu() {
		
		System.out.println("-------- MENU TABLERO --------");
		System.out.println("1-> CREAR REINA POR DEFECTO");
		System.out.println("2-> CREAR REINA ELIGIENDO COLOR");
		System.out.println("3-> MOVER");
		System.out.println("4-> SALIR");
	}
	
	public static void elegirOpcionMenu() {
		
		int opcion;
		System.out.println("---- ELIGE UNA OPCION (1 - 4) ----");
		do {
			opcion = Entrada.entero();
			if (opcion < 1 || opcion > 4) {
				System.out.println("ERROR: Opción fuera de parámetros");
			}
		} while (opcion < 1 || opcion > 4);
		
	}
	
	
	
//	public static void main(String[] args) {
//		Consola.mostrarMenu();
//	}
}
