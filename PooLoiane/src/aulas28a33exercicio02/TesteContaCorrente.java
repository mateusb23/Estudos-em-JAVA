package aulas28a33exercicio02;

public class TesteContaCorrente {

	public static void main(String[] args) {

		ContaCorrente conta1 = new ContaCorrente();
		conta1.setNumero("123456");
		conta1.setAgencia("1234");
		conta1.setEspecial(true);
		conta1.setLimiteEspecial(500);
		conta1.setValorEspecialUsado(0);
		conta1.setSaldo(-10);

		System.out.println("Saldo da conta " + conta1.getNumero() + " = " + conta1.getSaldo());

		boolean saqueEfetuado;
		saqueEfetuado = conta1.realizarSaque(10);

		if (saqueEfetuado) {    // Eu poderia ter colocado if (saqueEfetuado == true) {
			System.out.println("Saque efetuado com sucesso");
			System.out.println("Saldo atual da conta = " + conta1.getSaldo());
		} else {
			System.out.println("Não foi possível realizar o saque. Saldo insuficiente.");
		}

		saqueEfetuado = conta1.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais");
		if (saqueEfetuado) {    // Eu poderia ter colocado if (saqueEfetuado == true) {
			System.out.println("Saque efetuado com sucesso");
			System.out.println("Saldo atual da conta = " + conta1.getSaldo());
		} else {
			System.out.println("Não foi possível realizar o saque. Saldo insuficiente.");
		}

		System.out.println("Depósito de 500 reais");
		conta1.depositar(700);
		System.out.println("Saldo atual da conta = " + conta1.getSaldo());

		conta1.consultarStatus();

		if (conta1.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}
		conta1.realizarSaque(750);
		conta1.consultarStatus();
		if (conta1.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}
	}

}