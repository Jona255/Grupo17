package ar.edu.unju.fi.ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		boolean band = true;
		Scanner sc = new Scanner(System.in);

		while (band) {

			System.out.println("Ingrese un numero entero:");
			try {
				num = sc.nextInt();

				if (num == 1) {
					System.out.println("El número " + num + " corresponde al mes Enero.");
				} else {
					if (num == 2) {
						System.out.println("El número " + num + " corresponde al mes Febrero");
					} else {
						if (num == 3) {
							System.out.println("El número " + num + " corresponde al mes Marzo");
						} else {
							if (num == 4) {
								System.out.println("El número " + num + " corresponde al mes Abril");
							} else {
								if (num == 5) {
									System.out.println("El número " + num + " corresponde al mes Mayo");
								} else {
									if (num == 6) {
										System.out.println("El número " + num + " corresponde al mes Junio");
									} else {
										if (num == 7) {
											System.out.println("El número " + num + " corresponde al mes Julio");
										} else {
											if (num == 8) {
												System.out.println("El número " + num + " corresponde al mes Agosto");
											} else {
												if (num == 9) {
													System.out.println(
															"El número " + num + " corresponde al mes Septiembre");
												} else {
													if (num == 10) {
														System.out.println(
																"El número " + num + " corresponde al mes Octubre");
													} else {
														if (num == 11) {
															System.out.println("El número " + num
																	+ " corresponde al mes Noviembre");
														} else {
															if (num == 12) {
																System.out.println("El número " + num
																		+ " corresponde al mes Diciembre");
															} else {
																System.out.println("El número " + num
																		+ " no correspnde a ningún mes del año.");
																band = false;
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}

					}
				}
			} catch (InputMismatchException ex) {
				sc.nextLine();
				System.out.println("Debe ingresar obligatoriamente un número entero.");
			}
		}
		sc.close();
	}
}
