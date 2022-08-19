package Exercicios;

import java.util.Scanner;

public class ExercicioSete {
	//private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		/* int numero, maior;

		Scanner teclado = new Scanner(System.in);

		System.out.print("n1: ");
		numero = teclado.nextInt();
		maior = numero;

		for (int i = 2; i <= 5; i++) {
			System.out.print("n" + i + ": ");
			numero = teclado.nextInt();
			if (numero > maior) {
				maior = numero;
			}
		}
		System.out.println("O maior número é o " + maior); */
		
		
		// ---------------------- FAZENDO DA FORMA DA PROFESSORA LOIANE -----------------------

		Scanner teclado = new Scanner(System.in);
		int numero;
		int maior = Integer.MIN_VALUE;			// Integer.MIN_VALUE   --> significa o menor número possível no Java

		for (int i = 0; i <= 5 - 1; i++) {

			System.out.print("n" + i + ": ");
			numero = teclado.nextInt();

			if (numero > maior) {
				maior = numero;
			}

		}
		
		System.out.println("O maior número é o " + maior);
		
	}
}


