package fi.unju.edu.ar.ejercicio7;

public class Principal {

	public static void main(String[] args) {
		// se inicializa el acumulador
		int j = 40;
		// se comprueba si acumulador vale tanto para iniciar serie
		if (j == 40) {
			j = j + 1; // incremento el acumulador
			for (int i = 2; (j > 0); i = i + 2) { // si acumulador positivo calculo los valores de la serie
				j = j + (41 - i); // calculo un elemento de la serie
				if (j != 0) { // no incluyo al cero en la serie
					System.out.println(j); // muestro la serie por pantalla
				}
			}
		}
	}

}
