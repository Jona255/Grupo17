package ar.edu.unju.fi.ejercicio16;


public class CalculoMatematico {
	private int n;

	public CalculoMatematico(int n) {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public double calcularSumatoria() {
		double resultado = 0;
		for (int i = 1; i <= this.n; i++) {
			resultado = resultado + Math.pow((i*(i+1))/2 , 2);
		}
		return resultado;
	}
	
	public int calcularProductoria() {
		int resultado = 1;
		for (int i = 1; i <= this.n; i++) {
			resultado = resultado * i*(i+4);
		}
		return resultado;
	}
}
