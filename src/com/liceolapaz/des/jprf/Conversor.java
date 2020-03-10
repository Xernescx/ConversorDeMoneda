package com.liceolapaz.des.jprf;

import java.util.Scanner;

public class Conversor {

	private static void escribirMenu() {
		System.out.println(
				"\r\nCONVERSOR DE MONEDAS\r\n" + "1. Dólares\r\n" + "2. Libras\r\n" + "3. Yens\r\n" + "0. Salir");
	}

	private static double leerCantidad() {
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
	}

	private static int leerOpcion() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

	public static void main(String[] args) {
		Moneda moneda = null;
		while (true) {
			escribirMenu();
			pedirOpcion();
			int opcion = leerOpcion();
			if (opcion == 0) {
				System.exit(0);
			} else if ((opcion >= 1) && (opcion <= 3)) {
				pedirCantidad();
				double cantidad = leerCantidad();
				switch (opcion) {
				case 1:
					moneda = new Dolar(cantidad);
					break;
				case 2:
					moneda = new Libra(cantidad);
					break;
				case 3:
					moneda = new Yen(cantidad);
					break;
				}
				double cantidadEnEuros = moneda.cantidadEnEuros();
				System.out.println("La cantidad en euros es: " + cantidadEnEuros + "€");
			} else {
				System.out.println("Opción no válida");
			}
		}
	}

	private static void pedirCantidad() {
		System.out.print("Escriba una cantidad: ");
	}

	private static void pedirOpcion() {
		System.out.print("Escoja una opción: ");
	}

}
