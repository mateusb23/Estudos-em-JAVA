package Exercicios;

import java.util.Scanner;

public class ExercicioOnze {

	public static void main(String[] args) {
		
		int numero1, numero2;
		int soma = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o 1º número: ");
		numero1 = teclado.nextInt();
		                           
		System.out.println("Digite o 2º número: ");
		numero2 = teclado.nextInt();
		
		for (int i = numero1; i <= numero2; i++) {
			soma += i;
		}
		
		System.out.println("Soma: " + soma);
	}

}
