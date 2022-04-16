package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el valor de n: ");
		int n = sc.nextInt();
		
		CalculoMatematico calculo = new CalculoMatematico(n);
		System.out.println("Sumatoria: "+calculo.calcularSumatoria());
		System.out.println("Productoria: "+calculo.calcularProductoria());
		
	}

}
