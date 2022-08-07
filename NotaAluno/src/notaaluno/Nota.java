package notaaluno;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String nome;
		float nota1;
		float nota2;
		double media;
		
		System.out.println("Escreva o seu nome completo: ");
		nome = teclado.nextLine();
		System.out.printf("%s, diga qual é a sua primeira nota de Programação Orientada a Objetos: ", nome);
		nota1 = teclado.nextFloat();
		while (nota1 > 10 || nota1 < 0) {
			System.out.println("ERRO, DIGITE SUA NOTA NOVAMENTE!");
			System.out.printf("%s, diga qual é a sua primeira nota de Programação Orientada a Objetos: ", nome);
			nota1 = teclado.nextFloat();
		}
		System.out.printf("\n%s, diga qual é a sua segunda nota de Programação Orientada a Objetos: ", nome);
		nota2 = teclado.nextFloat();
		while (nota2 > 10 || nota2 < 0) {
			System.out.println("ERRO, DIGITE SUA NOTA NOVAMENTE!");
			System.out.printf("%s, diga qual é a sua segunda nota de Programação Orientada a Objetos: ", nome);
			nota2 = teclado.nextFloat();
		}
		media = (nota1 + nota2)/2;
		
		if (media >= 7 && media <= 10) {
			System.out.printf("\n%s ficou com média %.2f e foi APROVADO", nome, media);
		} else if (media >= 3 && media < 7) {
			System.out.printf("\n%s ficou com média %.2f e está em RECUPERAÇÃO", nome, media);
		} else {
			System.out.printf("\n%s ficou com média %.2f e está REPROVADO", nome, media);
		}
	}

}
