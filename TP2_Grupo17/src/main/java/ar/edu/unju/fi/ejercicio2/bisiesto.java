package ar.edu.unju.fi.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bisiesto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int anio;
		boolean band = true;

		do {
			System.out.println("Ingrese un anio: ");
			try {
				anio = sc.nextInt();

				if (((anio % 4) == 0) && ((anio % 100) != 0)) {
					System.out.println("El anio " + anio + " es anio bisiesto.");
				} else {
					if ((anio % 400) == 0) {
						System.out.println("El anio " + anio + " es anio bisiesto.");
					} else {
						System.out.println("El anio " + anio + " no es anio bisiesto.");
					}
				}
				band = false;
			} catch (InputMismatchException ex) {
				sc.nextLine();
				System.out.println("Debe ingresar obligatoriamente un número entero.");
			}

		} while (band == true);

		sc.close();

	}

}
