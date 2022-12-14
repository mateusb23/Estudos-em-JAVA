package exerciciosfuctura;

import java.util.Scanner;

public class BancoParaisoFiscal {

	public static void main(String[] args) {

		String nome, cpf, confcpf, numconta, tipoconta;
		int senha, opcoes, confsenha;  		//confsenha = confirmação de senha
		double saldo, valor;
		boolean retornamenu;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("-------------INICIANDO CRIAÇÃO DA SUA CONTA-------------");

		System.out.println("Digite o seu nome completo: ");
		nome = teclado.nextLine();

		System.out.print("\n Sua conta será CC(Corrente) ou CP(Poupança)? ");
		tipoconta = teclado.next().toLowerCase();
		while ((!"cp".equals(tipoconta)) && (!"cc".equals(tipoconta))) {
			System.out.println("ERRADO, DIGITE [CC] ou [CP] PARA ESCOLHER O TIPO DA SUA CONTA: ");
			tipoconta = teclado.next().toLowerCase();
		} if ("cc".equals(tipoconta)) {
			System.out.println("Você recebe do nosso banco R$ 50,00 para iniciar a sua conta " + nome);
			saldo = 50;
		} else { 
			System.out.println("Você recebe do nosso banco R$ 120,00 para iniciar a sua conta " + nome);
			saldo = 120;
		} 

		System.out.println("Informe o número da sua conta no padrão 0000-0: ");
		numconta = teclado.next();

		System.out.println("----------------------------------------------------------");

		System.out.println("Digite o seu cpf (apenas números): ");
		cpf = teclado.next();
		while (!(cpf.length() == 11)) {
			System.out.println("Digite o seu cpf: ");
			cpf = teclado.next();
		}

		System.out.print("Crie uma senha numérica de 4 dígitos(NÃO PODE COMEÇAR COM ZERO): ");
		senha = teclado.nextInt();
		while (senha < 1000 || senha > 9999) {
			System.out.println("A senha não se encaixa nos padrão indicado."
					+ "\n Digite uma senha válida com 4 dígitos numéricos: ");
			senha = teclado.nextInt();
		} 

		retornamenu = true;
		while (retornamenu == true) { 
			
		System.out.println("----------------------------------------------------------");
		System.out.printf("-------------CRIAMOS A SUA CONTA, SR(A). %s -------------", nome);
		System.out.println("\n----------------------------------------------------------");

		System.out.println("Escolha a opção que deseja, logo abaixo, para: "
				+ "\n 1 - Consultar dados da sua conta"
				+ "\n 2 - Realizar um depósito"
				+ "\n 3 - Realizar um saque"
				+ "\n 4 - Finalizar aplicativo");

		opcoes = teclado.nextInt();

		switch (opcoes) {
		case 1:
			System.out.print("Informe o seu cpf: ");
			confcpf = teclado.next();
			if (confcpf.contentEquals(cpf)) {
				System.out.println("Nome: " + nome);
				System.out.println("Tipo da conta: " + tipoconta);
				System.out.println("Número da conta: " + numconta);
			} break;

		case 2:
			System.out.print("Informe o seu cpf: ");
			confcpf = teclado.next();
			if (confcpf.contentEquals(cpf)) { 
				System.out.println("Conta: " + numconta);
				System.out.println("Digite sua senha de 4 dígitos: ");
				confsenha = teclado.nextInt();
				if (confsenha == senha) {
					System.out.println("-------ENTROU-------");
					System.out.print("Insira o valor do depósito: ");
					valor = teclado.nextDouble();
					saldo += valor;
					System.out.println("Saldo atual: " + saldo);
				} else if (confsenha != senha) {
					System.out.println("SENHA INCORRETA"
							+ "TENTE NOVAMENTE: ");
					confsenha = teclado.nextInt();
					if (confsenha == senha) {
						System.out.println("-------ENTROU-------");
						System.out.print("Insira o valor do depósito: ");
						valor = teclado.nextDouble();
						saldo += valor;
						System.out.println("Saldo atual: " + saldo);
					} else {
						System.out.println("TENTATIVAS ESGOTADAS, APLICATIVO ENCERRADO!");
						System.out.println("VOCÊ ERROU DUAS VEZES !!!");
					} 
				} else {
					System.out.println("APLICATIVO ENCERRADO!");
				}
			} break;

		case 3:
			System.out.print("Informe o seu cpf: ");
			confcpf = teclado.next();
			if (confcpf.contentEquals(cpf)) { 
				System.out.println("Conta: " + numconta);
				System.out.println("Digite sua senha de 4 dígitos: ");
				confsenha = teclado.nextInt();
				if (confsenha == senha) {
					System.out.println("-------ENTROU-------");
					System.out.print("Insira o valor do saque: ");
					valor = teclado.nextDouble();
					while (valor > saldo) {
						System.out.println("Saque impossível, o seu saldo é inferior a este valor desejado");
						System.out.print("Insira o valor do saque: ");
						valor = teclado.nextDouble();
					}
					saldo -= valor;
					System.out.println("Saldo atual: " + saldo);
				} else if (confsenha != senha) {
					System.out.println("SENHA INCORRETA"
							+ "TENTE NOVAMENTE: ");
					confsenha = teclado.nextInt();
					if (confsenha == senha) {
						System.out.println("-------ENTROU-------");
						System.out.print("Insira o valor do saque: ");
						valor = teclado.nextDouble();
						while (valor > saldo) {
							System.out.println("Saque impossível, o seu saldo é inferior a este valor desejado");
							System.out.print("Insira o valor do saque: ");
							valor = teclado.nextDouble();
						}
						saldo = valor - saldo;
						System.out.println("Saldo atual: " + saldo);
					} else {
						System.out.println("TENTATIVAS ESGOTADAS, APLICATIVO ENCERRADO!");
						System.out.println("VOCÊ ERROU DUAS VEZES !!!");
					} 
				} else {
					System.out.println("APLICATIVO ENCERRADO!");
				}
			} break;

		case 4: 
			System.out.println("SAINDO DO SISTEMA!!!");
			retornamenu = false;
			break;

		default:
			System.out.println("FIM");
		} 

		System.out.println("\nOPERAÇÃO FINALIZADA");
		System.out.println("\nOBRIGADO, ATÉ LOGO");
	}

	}
		
}
