package Exercicios;

import java.util.Scanner;

public class ExercicioDoze {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.println("Digite o número: ");
		n = teclado.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " X " + i + " = " + n*i);
		}

	}

}
