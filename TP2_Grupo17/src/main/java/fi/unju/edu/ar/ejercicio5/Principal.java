package fi.unju.edu.ar.ejercicio5;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean mesInvalido = false;//variable con la que se finaliza el ingreso de datos
		Scanner entrada = new Scanner(System.in);//se instancia un objeto escanner para permitir la lectura d los datos ingresados
		// codigo que muestra si un nro ingresado corresponde a un mes
		// mientras este corresponda a un mes valido
		do {
			// Pedido de ingreso de datos
			System.out.println("****************************************************");
			System.out.println("ingrese un mes del año en formato numero");
			//se asigna a una variable el nro ingresado
			int mes = entrada.nextInt();
			// se comprueba si el nro ingresado corresponde a un mes valido
			// en caso afirmativo, se muestra por pantalla el mes correspondiente
			switch (mes) {
			case 1:
				System.out.println("El numero ingresado corresponde al mes de Enero");
				break;
			case 2:
				System.out.println("El numero ingresado corresponde al mes de Febrero");
				break;
			case 3:
				System.out.println("El numero ingresado corresponde al mes de Marzo");
				break;
			case 4:
				System.out.println("El numero ingresado corresponde al mes de Abril");
				break;
			case 5:
				System.out.println("El numero ingresado corresponde al mes de Mayo");
				break;
			case 6:
				System.out.println("El numero ingresado corresponde al mes de Junio");
				break;
			case 7:
				System.out.println("El numero ingresado corresponde al mes de Julio");
				break;
			case 8:
				System.out.println("El numero ingresado corresponde al mes de Agosto");
				break;
			case 9:
				System.out.println("El numero ingresado corresponde al mes de Septiembre");
				break;
			case 10:
				System.out.println("El numero ingresado corresponde al mes de Octubre");
				break;
			case 11:
				System.out.println("El numero ingresado corresponde al mes de Noviembre");
				break;
			case 12:
				System.out.println("El numero ingresado corresponde al mes de Diciembre");
				break;
			default:
				System.out.println("El numero ingresado no corresponde a un mes valido");
				mesInvalido = true;//en caso negativo cambia el valor de la variable para 
				//que no se ingresen mas datos
				entrada.close();
			}

		} while (mesInvalido == false);//mientras la variable sea falsa se seguiran ingresando datos

	}

}
