package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Consola {

	private Consola() {
		
	}
	
	public static void mostrarMenu() {
		
		System.out.println("-------- MENU TABLERO --------");
		System.out.println("---- ELIGE UNA OPCION (1 - 4) ----");
		System.out.println("1-> CREAR REINA POR DEFECTO");
		System.out.println("2-> CREAR REINA ELIGIENDO COLOR");
		System.out.println("3-> MOVER");
		System.out.println("4-> SALIR");
	}
	
	public static void main(String[] args) {
		Consola.mostrarMenu();
	}
}
