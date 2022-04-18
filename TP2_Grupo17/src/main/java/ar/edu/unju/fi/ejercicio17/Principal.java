package ar.edu.unju.fi.ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Desarollo  b.1
		
		LocalDate fecha1= LocalDate.of(2017, 10, 20); 
		LocalDate fecha2= LocalDate.of(2021, 03, 15);
		
		ProcesoFecha pf1 = new ProcesoFecha(fecha1, fecha2);
		
		System.out.println("la fecha1 es "+pf1.getFecha1());
		System.out.println("la fecha2 es "+pf1.getFecha2());
		
		//Desarrollo b.2
		
		LocalTime time1= LocalTime.of(12, 30);
		LocalTime time2= LocalTime.of(15, 10);
		
		ProcesoFecha pf2 = new ProcesoFecha(time1, time2);
		
		System.out.println("la hora "+pf2.getTime1()+
		" incrementada en 5 horas es "+pf2.getTime1().plusHours(5));
		System.out.println("la hora "+pf2.getTime2()+
		" disminuida en 20 minutos es "+pf2.getTime2().minusMinutes(20));
		
		//Desarrollo b.3
		
		System.out.println(pf1.compararFecha(fecha1, fecha2));
		
		//Desarrollo b.4
		
		LocalDateTime dateTime1= LocalDateTime.of(fecha1, time1);
		LocalDateTime dateTime2= LocalDateTime.of(fecha2, time2);
		
		ProcesoFecha pf3 = new ProcesoFecha(dateTime1, dateTime2);
		 
		System.out.println("el dateTime1 es "+pf3.getDateTime1());
		System.out.println("el dateTime2 es "+pf3.getDateTime2());

		//Desarrollo b.5
		
		LocalDate fecha3= LocalDate.of(1997, 07, 25);
		LocalDate fecha4= LocalDate.now();
		
		ProcesoFecha pf4 = new ProcesoFecha(fecha3, fecha4);

		System.out.println("Han transcurrido "+pf4.contarTiempoTranscurrido().getYears()+
		" años, "+pf4.contarTiempoTranscurrido().getMonths()+ " meses y "+
		pf4.contarTiempoTranscurrido().getDays()+ " días desde la fecha "+
		pf4.formatearFecha(fecha3) +" hasta la fecha "+pf4.formatearFecha(fecha4));
		
		//Desarrollo b.6 y b.7		
		
		Scanner scanner = new Scanner(System.in);
		
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		boolean band = true;
		
		do {
			
			System.out.println("Ingresar fecha 1 con formato dd/MM/yyyy: ");
			
			String fechaStr1 = scanner.next();
		
			try {
				LocalDate fecha5 = LocalDate.parse(fechaStr1, formateador);
			
				ProcesoFecha pf5 = new ProcesoFecha();
				pf5.setFecha1(fecha5);
				
				LocalDate fechaAumento = pf5.getFecha1().plusDays(365);
				
				System.out.println("La fecha "+fecha5+" mas 365 días es "+fechaAumento);
				
				band = false;
				
			} catch (DateTimeParseException e) { 
					System.out.println("Formato de fecha incorrecto." +e.getMessage()); 
				}catch (Exception e) { 
					System.out.println(e.getMessage());
			}
		} while (band);
		
		do {

			System.out.println("Ingresar fecha 2 con formato dd/MM/yy:");
			
			String fechaStr2 = scanner.next();
			
			try {
				
				LocalDate fecha6 = LocalDate.parse(fechaStr2, formateador);
			
				ProcesoFecha pf5 = new ProcesoFecha();
				pf5.setFecha2(fecha6);
				
				LocalDate fechaDecremento = pf5.getFecha2().minusMonths(6);
				
				System.out.println("La fecha "+fecha6+" menos 6 meses es "+fechaDecremento);
				
				band = false;
				
			} catch (DateTimeParseException e) { 
					System.out.println("Formato de fecha incorrecto." +e.getMessage());
					band = true;
				}catch (Exception e) { 
					System.out.println(e.getMessage());
					band = true;
				}
		} while (band);
		scanner.close();
	}

}
