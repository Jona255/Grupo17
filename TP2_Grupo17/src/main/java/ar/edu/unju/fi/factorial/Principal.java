package ar.edu.unju.fi.factorial;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,fact; //definición de variables a usar
		boolean band = true;
		fact = 1;
		
		do
		{
			System.out.print("Ingrese un número: ");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			
			if ((num >= 0) && (num <= 10))
			{
				while (num != 0) {
					fact = fact * num;
					num = num - 1;
				}
				band = false;
				System.out.println("El factorial del número es: "+fact);
			} else
			{
				System.out.println("Debe ingresar un número entre 1 y 10.");
			}
			
		} while (band);
	}
}
