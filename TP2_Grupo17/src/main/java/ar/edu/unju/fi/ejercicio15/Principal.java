package ar.edu.unju.fi.ejercicio15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre:");
		String nombre = sc.next();
		
		System.out.println("Ingrese la fecha de nacimiento:");
		String fechaStr = sc.next();
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			LocalDate fecha = LocalDate.parse(fechaStr, formateador);

			Persona persona1 = new Persona(nombre,fecha);
			
			System.out.println("Edad: " + persona1.Edad());
			System.out.println("Signo del zodíaco: " + persona1.zodiaco());
			System.out.println("Estación del año: " + persona1.estacionAnio());

		} catch (DateTimeParseException e) { System.out.println("Error: " +
				e.getMessage()); }catch (Exception e) { System.out.println(e.getMessage()); 
		}
		
		
	}

}
