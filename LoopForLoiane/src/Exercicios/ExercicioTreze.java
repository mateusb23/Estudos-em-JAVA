package Exercicios;

import java.util.Scanner;

public class ExercicioTreze {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int base, potencia, resultado;
		
		System.out.println("Entre com a base: ");
		base = teclado.nextInt();
		
		System.out.println("Entre com a potência: ");
		potencia = teclado.nextInt();
		
		resultado = base;
		
		for (int i = 1; i < potencia; i++) {
			resultado *= base;
		}

		
		System.out.println("Resultado: " + resultado);

	}

}
