package ar.edu.unju.fi.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean continua;
		int numero;
		for (int i = 1; i <= 5; i++) {
			do {
				try {
					continua = false;
					System.out.print("Ingrese número "+i+": ");
					numero = sc.nextInt();
					if ((numero % 2) == 0) {
						System.out.println("El número ingresado es par.");
					} else {
						System.out.println("El número no es par.");
					}
				} catch (InputMismatchException ex) {
					System.out.println("Debe ingresar un número entero.");
					sc.nextLine();
					continua = true;
				}

			} while (continua);

		}
		sc.close();
		System.out.println("*************************************");
	}
}
