package ar.edu.unju.fi.ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// codigo para determinar condicion de alumno segun nota ingresada
		boolean notaInvalida = false; // variable cuyo valor permite el ingreso de datos
		Scanner entrada = new Scanner(System.in);
		while (notaInvalida == false) { // se pide el ingreso de datos mientras la variable sea falsa
			// se pide que se ingrese datos
			System.out.println("****************************************************");
			try {
				System.out.println("ingrese un valor de nota en formato numero");
				// se guarda el valor ingresado
				int nota = entrada.nextInt();
				// si se cumplen ciertas condiciones se muestran diferentes mensajes por
				// pantalla
				if ((nota <= 10) && (nota >= 7)) {
					System.out.println("El alumno promociona");
				} else {
					if ((nota < 6) && (nota >= 1)) {
						System.out.println("El alumno desaprueba");
					} else {
						if (nota == 6) {//
							System.out.println("Alumno regulariza");
						} else {
							System.out.println("valor de nota no permitido");
							// si no cumple las anteriores condiciones
							notaInvalida = true; // cambio el valor de la variable para que ya no se ingresen datos
							entrada.close(); // cierro el lector de valores de entrada
						}
					}
				}
			} catch (InputMismatchException ex) {
				System.out.println("Debe ingresar obligatoriamente un número entero.");
				notaInvalida = true;
			}
		}
	}

}
