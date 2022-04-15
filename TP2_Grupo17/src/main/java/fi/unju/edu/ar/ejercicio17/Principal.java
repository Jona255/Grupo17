package fi.unju.edu.ar.ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
		//en el tp dice que se fecha1 y fecha2 pero me crea conflicto que no se solucionar
		LocalDate fecha3= LocalDate.of(1997, 07, 25);
		LocalDate fecha4= LocalDate.now();
		ProcesoFecha pf4 = new ProcesoFecha(fecha3, fecha4);
		

	}

}
