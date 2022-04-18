package ar.edu.unju.fi.ejercicio12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		final double g = 9.8;
		double h = 0.0, t = 0.0;
		boolean band = true;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Ingrese la altura desde la que cae el objeto:");
			try {
				h = sc.nextDouble();

				t = Math.sqrt(2 * h / g);

				System.out.printf("Tiempo = %.2f segundos", t);
				band = false;
				
			} catch (InputMismatchException ex) {
				sc.nextLine();
				System.out.println("Debe ingresar obligatoriamente un número.");
			}
		} while (band == true);
		sc.close();
	}

}
