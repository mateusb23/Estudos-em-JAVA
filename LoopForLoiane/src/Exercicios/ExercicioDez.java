package Exercicios;

import java.util.Scanner;

public class ExercicioDez {

	public static void main(String[] args) {
		
		int n1;
		int n2;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o 1º número: ");
		n1 = teclado.nextInt();
		
		System.out.println("Informe o 2º número: ");
		n2 = teclado.nextInt();
		
		if (n2 > n1) {
			for (int i = n2 - 1; i > n1; i--) {
				System.out.println(i);
			}
		} else if (n1 > n2) {
			for (int i = n1 - 1; i > n2; i--) {
				System.out.println(i);
			}
		} else {
			System.out.println("ERRADO, VOCÊ DIGITOU DOIS NÚMEROS IGUAIS");
		}
		
	}

}
