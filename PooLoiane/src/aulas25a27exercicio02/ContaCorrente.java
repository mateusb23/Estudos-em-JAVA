package aulas25a27exercicio02;

public class ContaCorrente {

	boolean sistemaIniciado;
	String numeroConta;
	String agencia;
	String nomeCliente;
	boolean contaEspecial;
	boolean chequeEspecial;
	double limiteChequeEspecial;
	double saldo;
	
	void iniciarSistema() {
		this.sistemaIniciado = true;
	}
	
	void desligarSistema() {
		this.sistemaIniciado = false;
	}
	
	void colocarNumeroConta(String numero) {
		if (sistemaIniciado == true) {
		this.numeroConta = numero;
		} else {
			System.out.println("Primeiro, inicie o sistema!!");
		}
	}
	
	void colocarNumeroAgencia(String numeroAgencia) {
		if (sistemaIniciado == true) {
		this.agencia = numeroAgencia;
		} else {
			System.out.println("Primeiro, inicie o sistema!!");
		}
	}
		
	void sacar(double sacarValor) {
		if (sistemaIniciado == true) { 
			if (sacarValor > saldo) {
				System.out.println("Saque impossível, o valor solicitado é maior do que o Saldo atual");
			} else {
				saldo -= sacarValor;
				System.out.println("Após retirar " + sacarValor + " seu saldo é " + saldo);
			}
		} else {
			System.out.println("Não temos como sacar, pois a conta está não foi iniciada");
		}
	}

	void depositar(double depositarValor) {
		if (sistemaIniciado == true) {
		saldo += depositarValor;
		System.out.println("Após depositar " + depositarValor + " seu saldo é " + saldo);
		} else {
			System.out.println("Não temos como depositar, pois a conta está não foi iniciada");
		}
	}
	
	void status() {
		System.out.println();
		System.out.println("----------STATUS DA CONTA----------");
		System.out.println("Número da conta: " + numeroConta);
		System.out.println("O número da sua agência: " + agencia);
		System.out.println("Saldo atual: " + saldo);
		System.out.println("É Especial: " + contaEspecial);
		System.out.println("Está utilizando o Limite do cheque especial: " + chequeEspecial);
		System.out.println("Limite cheque especial: " + limiteChequeEspecial);
	}
	
	
	
}
