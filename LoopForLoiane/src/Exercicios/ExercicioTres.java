package Exercicios;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {

		/*String nome, sexo, estadocivil;
		int idade;
		float salario;

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escreva o seu nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Diga a sua idade: ");
		idade = teclado.nextInt();
		
		System.out.println("Informe o seu salário: ");
		salario = teclado.nextFloat();
		
		System.out.println("Seu Sexo(m/f): ");
		sexo = teclado.next().toLowerCase();
		
		System.out.println("Seu estado civil: "
				+ "\n S - para Solteiro"
				+ "\n C - para Casado"
				+ "\n v - para Viúvo"
				+ "\n D - para Divorciado");
		estadocivil = teclado.next().toLowerCase(); //.charAt(0);
		
		if (nome.length() > 3) {
			System.out.println("A -> Nome com mais de 3 Caracteres");
		} else {
			System.out.printf("A -> Nome com %.1f caracteres", nome.length());
		}
		if (idade >= 0 && idade <= 150) {
			System.out.println("B -> Idade entre 0 e 150");
		} else {
			System.out.println("B -> A Idade é: " + idade);
		}
		if (salario > 0) {
			System.out.println("C -> Salário maior que zero");
		} else if (salario == 0) {
			System.out.println("C -> Salário igual a zero");
		} else {
			System.out.println("Salário impossível");
		}
		if ("m".equals(sexo)) {
			System.out.println("D -> Homem");
		} else if ("f".equals(sexo)) {
			System.out.println("D -> Mulher");
		} else {
			System.out.println("Esse Sexo não existe");
		}
		if ("s".equals(estadocivil) || "c".equals(estadocivil) || "v".equals(estadocivil) || "d".equals(estadocivil)) {
			System.out.println("Estado Civil -> " + estadocivil);
		} else {
			System.out.println("Nenhuma das opções");
		}*/
		
		// ---------------------- FAZENDO DA FORMA DA PROFESSORA LOIANE -----------------------

		Scanner teclado = new Scanner(System.in);

		boolean infovalida = false;
		String nome, sexo, estadocivil;
		int idade;
		double salario;

		do {

			System.out.println("Entre com o nome: ");
			nome = teclado.next();

			if (nome.length() > 3) {
				infovalida = true;
			} else {
				System.out.println("Nome precisa de no mínimo 3 caracteres.");
			}
		} while (infovalida == false);	// ou poderia ser (!infovalida) que seria o contrário de infovalida = true


		infovalida =  false;
		do {

			System.out.println("Entre com a idade: ");
			idade = teclado.nextInt();

			if (idade >= 0 && idade <= 150) {
				infovalida = true;
			} else {
				System.out.println("Idade precisa ser entre 0 e 150.");
			}
		} while (infovalida == false);	// ou poderia ser (!infovalida) que seria o contrário de infovalida = true

		infovalida = false;
		do {

			System.out.println("Entre com o salário: ");
			salario = teclado.nextDouble();

			if (salario > 0) {
				infovalida = true;
			} else {
				System.out.println("Salário precisa ser maior que 0");
			}
		} while (infovalida == false);	// ou poderia ser (!infovalida) que seria o contrário de infovalida = true
		
		
		infovalida = false;
		do {

			System.out.println("Entre com o sexo: ");
			sexo = teclado.next();

			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infovalida = true;
			} else {
				System.out.println("Sexo precisa ser 'f' ou 'm'.");
			}
		} while (infovalida == false);	// ou poderia ser (!infovalida) que seria o contrário de infovalida = true
		
		
		infovalida = false;
		do {

			System.out.println("Entre com o estado civil: ");
			estadocivil = teclado.next();

			if (estadocivil.equalsIgnoreCase("s") || estadocivil.equalsIgnoreCase("c") || estadocivil.equalsIgnoreCase("v") || estadocivil.equalsIgnoreCase("d")) {
				infovalida = true;
			} else {
				System.out.println("Sexo precisa ser (s/c/v/d)");
			}
		} while (infovalida == false);	// ou poderia ser (!infovalida) que seria o contrário de infovalida = true
	}

}
