package notaaluno1;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome;
		float nota1, nota2;
		double media;

		System.out.println("Escreva o seu nome completo: ");
		nome = teclado.next();

		for(int i = 0; i <= 1; i++){

			// recebe a 1º nota
			System.out.println("Aluno " + nome + ", digite sua 1ª nota");
			nota1 = teclado.nextFloat();
			while (nota1 > 10 || nota1 < 0) {
				System.out.println("ERRO, DIGITE SUA NOTA NOVAMENTE!");
				System.out.printf("%s, diga qual é a sua primeira nota de Programação Orientada a Objetos: ", nome);
				nota1 = teclado.nextFloat();
			}

			// recebe a 2º nota
			System.out.println("Aluno " + nome + ", digite sua 2ª nota");
			nota2 = teclado.nextFloat();
			while (nota2 > 10 || nota2 < 0) {
				System.out.println("ERRO, DIGITE SUA NOTA NOVAMENTE!");
				System.out.printf("%s, diga qual é a sua segunda nota de Programação Orientada a Objetos: ", nome);
				nota2 = teclado.nextFloat();
			}

			// calcula a média
			media = (nota1 + nota2) / 2;
			System.out.println("A média do aluno " + nome + " é " + media);

			// mostra a nota do aluno
			if (media >= 7 && media <= 10) {
				System.out.printf("\n%s ficou com média %.2f e foi APROVADO", nome, media);
			} else if (media >= 3 && media < 7) {
				System.out.printf("\n%s ficou com média %.2f e está em RECUPERAÇÃO", nome, media);
			} else {
				System.out.printf("\n%s ficou com média %.2f e está REPROVADO", nome, media);
			}
		}  
	}

}
