package Exercicios;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int media;
		int soma = 0;
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Digite um número: ");
			numero = teclado.nextInt();
			
			soma += numero; 
		}
		
		media = soma / 5;
		
		System.out.println("A soma de todos os cinco números é: " + soma);
		System.out.println("A média de todos os cinco números é: " + media);

	}

}
