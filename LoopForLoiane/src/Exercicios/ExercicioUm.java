package Exercicios;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		
		float nota;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira uma nota de 0 a 10: ");
		nota = teclado.nextFloat();
		while (nota > 10 || nota < 0) {
			System.out.println("VALOR ERRADO"
					+ "\nInsira um valor entre 0 e 10: ");
			nota = teclado.nextFloat();
		}
		System.out.println("Sua nota é: " + nota);
	}

}
