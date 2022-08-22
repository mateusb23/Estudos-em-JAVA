package exerciciosfuctura;

import java.util.Scanner;

public class HorasTrabalhadas {

	public static void main(String[] args) {
		
		int C, escolha;
		float N, st, se;
		
		st = 0;
		se = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o seu código numérico de 5 dígitos: ");
		C = teclado.nextInt();
		if (C > 99999) {
		System.out.print("Seu código tem 5 dígitos."
				+ "\nDIGITE NOVAMENTE: ");
		C = teclado.nextInt();
		} else {
			System.out.println(" -> SUCESSO, VOCÊ ENTROU <- ");
		} 
		/*System.out.print("Quantas horas você trabalhou? ");
		N = teclado.nextFloat();
		if (N > 50) {
			st = N * 10;
			se = (N - 50) * 20;
		} else if (N >= 0 && N <= 50) {
			st = N * 10;
		} else {
			System.out.println("Número inválido !!");
		}*/
		
		System.out.println("ESCOLHA A OPÇÃO QUE DESEJA, LOGO ABAIXO:"
				+ "\n 1 para valores de 0 a 50: "
				+ "\n 2 para valores maiores do que 50: "
				+ "\n 3 para FINALIZAR: ");
		
		escolha = teclado.nextInt();
		
		switch (escolha) {
		
		case 1:
			System.out.println("Quantas horas você trabalhou? ");
			N = teclado.nextFloat();
			if (N >= 0 && N <= 50) {
				st = N * 10;
			} else {
				System.out.println("Número não corresponde à opção escolhida ");
			} break;
			
		case 2:
			System.out.println("Quantas horas você trabalhou? ");
			N = teclado.nextInt();
			if (N > 50) {
				st = N * 10;
				se = (N - 50) * 20;
			} else {
				System.out.println("Número não corresponde à opção escolhida !!");
			} break;
			
		default:
				System.out.println("FINALIZANDO SISTEMA");
		} 
		
		System.out.println("CÓDIGO: " + C);
		System.out.println("Salário mensal comum: " + st);
		System.out.println("Salário Excedente: " + se);
	}

}
