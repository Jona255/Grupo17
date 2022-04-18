package ar.edu.unju.fi.ejercicio16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean band = true;
		int n;

		do {
			System.out.println("Ingrese el valor de n: ");
			try {
				n = sc.nextInt();
				CalculoMatematico calculo = new CalculoMatematico(n);
				System.out.println("Sumatoria: " + calculo.calcularSumatoria());
				System.out.println("Productoria: " + calculo.calcularProductoria());
				band = false;
				sc.close();
			} catch (InputMismatchException ex) {
				sc.nextLine();
				System.out.println("Debe ingresar obligatoriamente un número entero.");
			}
		} while (band == true);
		
	}

}
