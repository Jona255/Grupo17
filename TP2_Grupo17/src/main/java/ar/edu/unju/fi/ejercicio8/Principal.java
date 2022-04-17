package ar.edu.unju.fi.ejercicio8;

public class Principal {

	public static void main(String[] args) {
		// codigo que calcula los multiplos de cuatro
		int multiplo = 4; // se inicializa variable a determinar si guarda multiplo de cuatro

		do {
			if (multiplo % 4 == 0) {// se calcula el resto entre un posible multiplo y cuatro
				System.out.println(multiplo); // si multiplo, se muestra por pantalla
			}
			multiplo++; // incremento en uno la variable a determinar
		} while (multiplo <= 100); // mientras el valor a determinar sea menor igual a 100
		// se sigue calculando

	}

}
