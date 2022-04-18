package ar.edu.unju.fi.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, fact; // definición de variables a usar
		boolean band1 = true;
		boolean band2 = true;
		Scanner sc = new Scanner(System.in);
		fact = 1;
		do {
			System.out.print("Ingrese un número: ");	
			try {	
				num = sc.nextInt();
				if ((num >= 0) && (num <= 10)) {
					while (num != 0) {
						fact = fact * num;
						num = num - 1;
					}
					band1 = false;
					System.out.println("El factorial del número es: " + fact);
				} else {
					System.out.println("Debe ingresar un número entre 1 y 10.");
				}
			} catch (InputMismatchException ex) {
			System.out.println("Debe ingresar un número.");
			sc.nextLine();
			}
		
		} while ((band1==true));
		sc.close();	
	}	
	
}
