package ar.edu.unju.fi.ejercicio15;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
	private String Nombre;
	private LocalDate fechaNac;
	
	public Persona(String nombre, LocalDate fechaNac) {
		super();
		Nombre = nombre;
		this.fechaNac = fechaNac;
	}
	
	public int Edad() {
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(fechaNac, hoy);
		return periodo.getYears();
	}
	
	public String zodiaco() {
		switch(this.fechaNac.getMonthValue()) {
			case 1:
				if(this.fechaNac.getDayOfMonth()>=21) {
					return "Acuario";
				}else {
					return "Capricornio";
				}
			case 2:
				if(this.fechaNac.getDayOfMonth()>=20) {
					return "Piscis";
				}else {
					return "Acuario";
				}
			case 3:
				if(this.fechaNac.getDayOfMonth()>=20) {
					return "Aries";
				}else {
					return "Piscis";
				}
			case 4:
				if(this.fechaNac.getDayOfMonth()>=21) {
					return "Tauro";
				}else {
					return "Aries";
				}
			case 5:
				if(this.fechaNac.getDayOfMonth()>=21) {
					return "Géminis";
				}else {
					return "Tauro";
				}
			case 6:
				if(this.fechaNac.getDayOfMonth()>=21) {
					return "Cáncer";
				}else {
					return "Géminis";
				}
			case 7:
				if(this.fechaNac.getDayOfMonth()>=21) {
					return "Leo";
				}else {
					return "Cáncer";
				}
			case 8:
				if(this.fechaNac.getDayOfMonth()>=21) {
					return "Virgo";
				}else {
					return "Leo";
				}
			case 9:
				if(this.fechaNac.getDayOfMonth()>=21) {
					return "Libra";
				}else {
					return "Virgo";
				}
			case 10:
				if(this.fechaNac.getDayOfMonth()>=21) {
					return "Escorpio";
				}else {
					return "Libra";
				}
			case 11:
				if(this.fechaNac.getDayOfMonth()>=21) {
					return "Sagitario";
				}else {
					return "Escorpio";
				}
			case 12:
				if(this.fechaNac.getDayOfMonth()>=21) {
					return "Capricornio";
				}else {
					return "Sagitario";
				}
			default:
				return "";
		}
		
	}

	public String estacionAnio() {
		switch(this.fechaNac.getMonthValue()){
			case 1:
			case 2:
				return "Verano";
			case 3:
				if(this.fechaNac.getDayOfMonth() >= 21) {
					return "Otoño";
				}else {
					return "Verano";
				}
			case 4:
			case 5:
				return "Otoño";
			case 6:
				if(this.fechaNac.getDayOfMonth() >= 21) {
					return "Invierno";
				}else {
					return "Otoño";
				}
			case 7:
			case 8:
				return "Invierno";
			case 9:
				if(this.fechaNac.getDayOfMonth() >= 21) {
					return "Primavera";
				}else {
					return "Invierno";
				}
			case 10:
			case 11:
				return "Primavera";
			case 12:
				if(this.fechaNac.getDayOfMonth() >= 21) {
					return "Verano";
				}else {
					return "Primavera";
				}
			default:
				return "";
		}
	}
}
