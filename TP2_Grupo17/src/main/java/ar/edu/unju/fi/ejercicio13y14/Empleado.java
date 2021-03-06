package ar.edu.unju.fi.ejercicio13y14;

import java.time.LocalDate;

public class Empleado {
	String nombre;
	LocalDate fechaIngreso= LocalDate.of(1900, 01, 01);
	int legajo= -9999;
	String email;
	double sueldo;
	int horasTrabajadas;
	
	public Empleado() {
		super();
	}
	

	public Empleado(String nombre, int legajo, int horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.horasTrabajadas = horasTrabajadas;
	}


	public Empleado(String nombre, int horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
	}


	public Empleado(String nombre, LocalDate fechaIngreso, int horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.horasTrabajadas = horasTrabajadas;
	}



	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		
		this.fechaIngreso = fechaIngreso;
	}

	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSueldo() {
		setSueldo();
		return sueldo;
	}
	
	public void setSueldo() {
		boolean horasMayor = this.horasTrabajadas >= 160;
		if(horasMayor) {
			this.sueldo=((160*600) + ( this.horasTrabajadas - 160) * 650);
		}else {
			this.sueldo=this.horasTrabajadas*600;
		}
	}
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	
	
	
}
