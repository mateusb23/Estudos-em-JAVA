package ProjetoTesteFinalModulo01;

public class ContaPoupanca extends Contas {

	private static double saldoPoupanca;

	public ContaPoupanca() { }

	public static double getSaldoPoupanca() {

		return ContaPoupanca.saldoPoupanca;
	}

	public static void setSaldoPoupanca(double saldoPoupanca) {

		ContaPoupanca.saldoPoupanca = saldoPoupanca;
	}

	@Override
	public void imprimirSaldo() {

		System.out.println("Saldo Atual da Poupanca = " + ContaPoupanca.getSaldoPoupanca());
	}

}
