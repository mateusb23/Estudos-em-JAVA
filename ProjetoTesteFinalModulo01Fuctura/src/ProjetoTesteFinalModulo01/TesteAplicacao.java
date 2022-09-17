package ProjetoTesteFinalModulo01;

import java.util.Scanner;

public class TesteAplicacao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		ContaCorrente usuarioC = new ContaCorrente();
		ContaPoupanca usuarioP = new ContaPoupanca();
		
		System.out.println("Digite o seu nome: ");
		String nome = teclado.nextLine();
		usuarioC.setNome(nome);
		
		System.out.println("Digite o número da sua conta: ");
		String conta = teclado.next();
		usuarioC.setNumConta(conta);
		
		System.out.println("Qual quantia deseja depositar? ");
		double depositoCorrente = teclado.nextDouble();
		usuarioC.depositar(depositoCorrente);
		usuarioC.imprimirSaldo();
		
		System.out.println("Quanto deseja aplicar na Poupança? ");
		double depositoPoupanca = teclado.nextDouble();
		usuarioC.aplicarNaPoupanca(depositoPoupanca);
		usuarioP.imprimirSaldo();
		
		System.out.println("Quanto deseja sacar? ");
		double saque = teclado.nextDouble();
		if (saque > usuarioC.getSaldoCorrente()) {
			System.out.println("Valor insuficiente na Conta Corrente!!");
			System.out.println("Deseja resgatar da Poupança? Digite (S/N) ");
			String resposta = teclado.next().toLowerCase();
			if (resposta.equals("s")) {
				usuarioC.resgatar(saque);
			} else if (resposta.equals("n")){
				System.out.println("Obrigado.");
			}
			
		} else {
			usuarioC.sacar(saque);
		}
		
		System.out.println("Digite quanto deseja resgatar da Poupança: ");
		double resgate = teclado.nextDouble();
		usuarioC.resgatar(resgate);
		
		System.out.println();
		usuarioC.imprimirSaldo();
		usuarioP.imprimirSaldo();
		System.out.println("Saldo Total = " + usuarioC.getSaldoTotal());
	}

}
