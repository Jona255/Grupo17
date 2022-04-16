package fi.unju.edu.ar.ejercicio13y14;

import java.time.LocalDate;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado empleado1 = new Empleado("Juanito", 100);
		empleado1.setHorasTrabajadas(100);
		System.out.println(empleado1.getSueldo());
		
		
		Empleado empleado2 = new Empleado();
		Empleado empleado3 = new Empleado("Federico", 123, 100);
		Empleado empleado4 = new Empleado("Alejandro", LocalDate.of(2000, 5, 10),50);
		Empleado empleado5 = new Empleado("Martin", 165);
		
		System.out.println("----------------------------------");
		System.out.println("Nombre: "+empleado2.getNombre()+", Fecha de Ingreso: "+empleado2.getFechaIngreso() +", Legajo: "+empleado2.getLegajo()+", Email: "+empleado2.getEmail()+", Sueldo: "+empleado2.getSueldo()+", Horas Trabajadas: "+ empleado2.getHorasTrabajadas());
		System.out.println("Nombre: "+empleado3.getNombre()+", Legajo:"+empleado3.getLegajo()+", Horas Trabajadas: "+ empleado3.getHorasTrabajadas());
		System.out.println("Nombre: "+empleado4.getNombre()+", Fecha de Ingreso: "+empleado4.getFechaIngreso()+", Horas Trabajadas: "+ empleado4.getHorasTrabajadas());
		System.out.println("Nombre: "+empleado5.getNombre()+", Horas Trabajadas: "+empleado5.getHorasTrabajadas());
		
	}

}
