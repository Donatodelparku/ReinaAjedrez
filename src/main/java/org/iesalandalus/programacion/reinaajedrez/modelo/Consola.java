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

	public static int elegirOpcionMenu() {
		int opcion;
		System.out.println("---- ELIGE UNA OPCION (1 - 4) ----");
		do {
			opcion = Entrada.entero();
			if (opcion < 1 || opcion > 4) {
				System.out.println("ERROR: Opción fuera de parámetros, introdúcela de nuevo: ");
			}
		} while (opcion < 1 || opcion > 4);
		return opcion;
	}

	public static Color elegirColor() {
		int opcion;
		Color color = null;
		System.out.println("---- ELIGE UN COLOR ----");
		System.out.println("1 <- BLANCO");
		System.out.println("2 <- NEGRO");
		do {
			opcion = Entrada.entero();
			if (opcion < 1 || opcion > 2) {
				System.out.println("ERROR: Opción fuera de parámetros, introdúcela de nuevo");
			}

		} while (opcion < 1 || opcion > 2);

		if (opcion == 1) {
			color = Color.BLANCO;
		} else if (opcion == 2) {
			color = Color.NEGRO;
		}
		return color;

	}
	
	
	

//	public static void main(String[] args) {
//		Consola.mostrarMenu();
//	}
}
