package fi.unju.edu.ar.bisiesto;

import java.util.Scanner;

public class bisiesto {

	public static void main(String[] args) {
		
		System.out.println("Ingrese un anio: ");
		
		Scanner sc = new Scanner(System.in);
		int anio = sc.nextInt();
		
		if (((anio % 4) == 0) && ((anio % 100) != 0))
		{
			System.out.println("El anio "+anio+" es anio bisiesto.");
		} else
		{
			if ((anio % 400) == 0)
			{
				System.out.println("El anio "+anio+" es anio bisiesto.");
			} else
			{
				System.out.println("El anio "+anio+" no es anio bisiesto.");
			}
		}
		
	}
	
}
