package ProjetoFinalBancoFuctura;

public class ContaCorrente extends Contas {

	private static double saldoCorrente;

	public ContaCorrente() { }

	public static double getSaldoCorrente() {
		return ContaCorrente.saldoCorrente;
	}

	public static void setSaldoCorrente(double saldoContaCorrente) {
		ContaCorrente.saldoCorrente = saldoContaCorrente;
	}

	public void sacar(double saque) {
		setSaldoCorrente(getSaldoCorrente() - saque);
		System.out.println("Valor sacado = " + saque);
	}

	public void aplicarNaPoupanca(double aplicarNaPoupanca) {
		setSaldoCorrente(ContaCorrente.saldoCorrente - aplicarNaPoupanca);
		ContaPoupanca.setSaldoPoupanca(ContaPoupanca.getSaldoPoupanca() + aplicarNaPoupanca);
		System.out.println("Valor aplicado na poupança = " + aplicarNaPoupanca);
	}

	public void mostrarSaldoCorrente() {
		System.out.println("Saldo da sua conta corrente = " + getSaldoCorrente());
	}

}

