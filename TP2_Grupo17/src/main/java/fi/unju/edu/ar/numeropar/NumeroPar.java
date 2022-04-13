package fi.unju.edu.ar.numeropar;

import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i <= 5; i++) {
			
			System.out.println("Ingrese un número: ");
			
			Scanner sc = new Scanner(System.in);
			int numero = sc.nextInt();
			
			if ((numero % 2) == 0)
			{
				System.out.println("El número ingresado es par.");
			} else
			{
				System.out.println("El número no es par.");
			}
			
		}
		
	}

}
