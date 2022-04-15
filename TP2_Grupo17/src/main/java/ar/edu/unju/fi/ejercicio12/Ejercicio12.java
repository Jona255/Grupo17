package ar.edu.unju.fi.ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		final double g = 9.8;
		double h=0.0, t=0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la altura desde la que cae el objeto:");
		h = sc.nextDouble();
		
		t = Math.sqrt(2*h/g);
		
		System.out.printf("Tiempo = %.2f segundos",t);

	}

}
