package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;

import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
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
		int opcionMenu;
		System.out.println("---- ELIGE UNA OPCION (1 - 4) ----");
		do {
			opcionMenu = Entrada.entero();
			if (opcionMenu < 1 || opcionMenu > 4) {
				System.out.println("ERROR: Opción fuera de parámetros, introdúcela de nuevo: ");
			}
		} while (opcionMenu < 1 || opcionMenu > 4);
		return opcionMenu;
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
	
	public static void mostrarMenuDirecciones() {
		System.out.println("---- ELIGE UNA DIRECCION ----");
		System.out.println("---- 1 <- NORTE ----");
		System.out.println("---- 2 <- NORESTE ----");
		System.out.println("---- 3 <- ESTE ----");
		System.out.println("---- 4 <- SURESTE ----");
		System.out.println("---- 5 <- SUR ----");
		System.out.println("---- 6 <- SUROESTE ----");
		System.out.println("---- 7 <- OESTE ----");
		System.out.println("---- 8 <- NOROESTE ----");
	}
	
	public static Direccion elegirDireccion() {
		int opcion;
		Direccion direccion = null;
		System.out.println("---- ELIGE UNA OPCION (1 - 8) ----");
		do {
			opcion = Entrada.entero();
			if (opcion < 1 || opcion > 8) {
				System.out.println("ERROR: Opción fuera de parámetros, introdúcela de nuevo: ");
			}
		} while (opcion < 1 || opcion > 8);
		
		switch (opcion) {
		case 1: 
			direccion = Direccion.NORTE;
			break;
		case 2:
			direccion = Direccion.NORESTE;
			break;
		case 3:
			direccion = Direccion.ESTE;
			break;
		case 4:
			direccion = Direccion.SURESTE;
			break;
		case 5:
			direccion = Direccion.SUR;
			break;
		case 6:
			direccion = Direccion.SUROESTE;
			break;
		case 7:
			direccion = Direccion.OESTE;
			break;
		case 8:
			direccion = Direccion.NOROESTE;
			break;
		}
		
		return direccion;
		
	}
	
	public static int elegirPasos() {
		int opcionPasos;
		System.out.println("---- ELIGE UN NÚMERO DE PASOS POSITIVOS ----");
		do {
			opcionPasos = Entrada.entero();
			if (opcionPasos <= 0) {
				System.out.println("ERROR: pasos no válidos, introdúcelos de nuevo: ");
			}
		} while (opcionPasos <= 0);
		return opcionPasos;
	}
	
	public static void despedirse() {
		System.out.println("Adiós, socio");
	}


}
