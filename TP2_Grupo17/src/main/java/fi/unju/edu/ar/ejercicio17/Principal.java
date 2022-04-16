package fi.unju.edu.ar.ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate fecha1= LocalDate.of(2017, 10, 20);
		LocalDate fecha2= LocalDate.of(2021, 03, 15);
		ProcesoFecha pf1 = new ProcesoFecha(fecha1, fecha2);
		System.out.println("la fecha1 es "+pf1.getFecha1());
		System.out.println("la fecha2 es "+pf1.getFecha2());
		
		LocalTime time1= LocalTime.of(12, 30);
		LocalTime time2= LocalTime.of(15, 10);
		ProcesoFecha pf2 = new ProcesoFecha(time1, time2);
		System.out.println("la hora "+pf2.getTime1()+
		" incrementada en 5 horas es "+pf2.getTime1().plusHours(5));
		System.out.println("la hora "+pf2.getTime2()+
		" disminuida en 20 minutos es "+pf2.getTime2().minusMinutes(20));
		
		System.out.println(pf1.compararFecha(fecha1, fecha2));
		
		LocalDateTime dateTime1= LocalDateTime.of(fecha1, time1);
		LocalDateTime dateTime2= LocalDateTime.of(fecha2, time2);
		ProcesoFecha pf3 = new ProcesoFecha(dateTime1, dateTime2);
		System.out.println("el dateTime1 es "+pf3.getDateTime1());
		System.out.println("el dateTime2 es "+pf3.getDateTime2());
		//b.5
				LocalDate fecha3= LocalDate.of(1997, 07, 25);
				LocalDate fecha4= LocalDate.now();
				ProcesoFecha pf4 = new ProcesoFecha(fecha3, fecha4);
				System.out.println("Han transcurrido "+pf4.contarTiempoTranscurrido().getYears()+
				" años, "+pf4.contarTiempoTranscurrido().getMonths()+ " meses y "+
				pf4.contarTiempoTranscurrido().getDays()+ " días desde la fecha "+
				pf4.formatearFecha(fecha3) +" hasta la fecha "+pf4.formatearFecha(fecha4));
				//b.6		
				Scanner scanner = new Scanner(System.in);
				System.out.println("Ingresar una fecha con formato dd/MM/yyyy : "); 
				String fechaStr = scanner.next();
				DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				try {
					LocalDate fecha5 = LocalDate.parse(fechaStr, formateador);
					System.out.println(fecha5); 
					System.out.println(formateador.format(fecha5));
				} catch (DateTimeParseException e) { 
					System.out.println("sdasd" +e.getMessage()); 		
				}catch (Exception e) { 
					System.out.println(e.getMessage()); 
				} finally {
					scanner.close();
				}
			
		

	}

}
