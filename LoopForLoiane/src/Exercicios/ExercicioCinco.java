package Exercicios;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		boolean valido = false;

		double pa;
		double pb;
		double taxaA;
		double taxaB;

		do {

			System.out.println("Entre com a população A: ");
			pa = teclado.nextDouble();

			if (pa > 0) {
				valido = true;
			} else {
				System.out.println("Populuação A precisa ser maior que 0.");
			}

		} while (!valido);		// Poderíamos ter colocado    while (valido == false);

		valido = false;
		do {

			System.out.println("Entre com a população B: ");
			pb = teclado.nextDouble();

			if (pb > 0) {
				valido = true;
			} else {
				System.out.println("Populuação B precisa ser maior que 0.");
			}

		} while (!valido);

		valido = false;
		do {

			System.out.println("Entre com a taxa da população A: ");
			taxaA = teclado.nextDouble();

			if (taxaA > 0) {
				valido = true;
			} else {
				System.out.println("A taxa da população A precisa ser maior que 0.");
			}

		} while (!valido);

		valido = false;
		do {

			System.out.println("Entre com a taxa da população B: ");
			taxaB = teclado.nextDouble();

			if (taxaB > 0) {
				valido = true;
			} else {
				System.out.println("A taxa da população B precisa ser maior que 0.");
			}

		} while (!valido);

		pa = 80000;
		pb = 200000;
		int contadoranos = 0;

		while (pa <= pb) {

			pa += (pa/100) * taxaA;
			pb += (pb/100) * taxaB;
			contadoranos++;
		}

		System.out.println("População A: " + pa);
		System.out.println("População B: " + pb);
		System.out.println("Quantidade de anos: " + contadoranos);

	}

}


