package Exercicios;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		/*String nome, senha;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Diga o seu nome: ");
		nome = teclado.next();
		System.out.println("Escolha uma senha: "
				+ "\nOBS: A sua senha não pode ser igual ao seu nome");
		senha = teclado.next();
		while (nome.equalsIgnoreCase(senha)) {
			System.out.println("SENHA NÃO PERMITIDA POR SER IGUAL AO SEU NOME!!"
					+ "\nEscolha uma senha diferente: ");
			senha = teclado.next();
		}
		System.out.printf("\nDados Gerais: "
				+ "\n Nome: %s"
				+ "\n Senha: %s", nome, senha);*/
		
		Scanner teclado = new Scanner(System.in);
		boolean infovalidas = false;
		String nomeUser;
		String senha;
		
		do {
			
			System.out.println("Entre com o nome do uruário: ");
			nomeUser = teclado.next();
			
			System.out.println("Entre com a senha: ");
			senha = teclado.next();
			
			if (nomeUser.equalsIgnoreCase(senha)) {
				//infovalidas = false;
				System.out.println("ERRADO, senha igual ao usuário, digite novamente!");
			} else {
				infovalidas = true;
				System.out.println("Senha e Usuário válidos.");
			}
		} while (!infovalidas);
	}

}
