package Exercicios;

import java.util.Scanner;

public class ExercicioQuatorze {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numero;
		boolean validanumero;
		int pares = 0;
		int impares = 0;
		validanumero = false;

		for (int i = 1; i <= 10; i++) {
			do {
				System.out.println("Digite o número " + i);
				numero = teclado.nextInt();
				if (numero % 2 == 0) {
					System.out.println("é par, o número " + i);
					pares += 1;		// ou simplesmente pares++
					validanumero = true;
				} else {
					System.out.println("é ímpar, o número " + i);
					impares += 1;	// ou simplesmente impares++
					validanumero = true;
				} 
			} while (!validanumero);
		}
		
		System.out.print("\nQuantidade de números PARES: " + pares);
		System.out.print("\nQuantidade de números ÍMPARES: " + impares);
	}

}
