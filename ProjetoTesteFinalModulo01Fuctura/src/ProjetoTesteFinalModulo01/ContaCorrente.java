package ProjetoTesteFinalModulo01;

public class ContaCorrente extends Contas{

	private double saldoCorrente;

	public ContaCorrente() { };

	public double getSaldoCorrente() {
		
		return saldoCorrente;
	}

	public void setSaldoCorrente(double saldoCorrente) {
		
		this.saldoCorrente = saldoCorrente;
	}

	public void sacar(double saque) {
		
		if (getSaldoCorrente() >= 0 && saque > 0) {
		setSaldoCorrente(getSaldoCorrente() - saque);
		System.out.println("Sr(a). " + getNome() + ", você sacou = " + saque);
		} else {
			System.out.println("VALOR INVÁLIDO!!");
		}
	}

	public void aplicarNaPoupanca(double deposito) {
		
		System.out.println("Foi depositado na Poupanca: " + deposito);
		ContaPoupanca.setSaldoPoupanca(ContaPoupanca.getSaldoPoupanca() + deposito);
		setSaldoTotal(getSaldoTotal() + ContaPoupanca.getSaldoPoupanca());
	}

	public void depositar(double deposito) {
		
		if(deposito > 0) {
		System.out.println("Valor depositado = " + deposito);
		setSaldoCorrente(getSaldoCorrente() + deposito);
		setSaldoTotal(getSaldoTotal() + getSaldoCorrente());
		} else {
			System.out.println("DEPÓSITO IMPOSSÍVEL!!");
		}
	}

	public void resgatar(double resgate) {

		if (ContaPoupanca.getSaldoPoupanca() > 0 && ContaPoupanca.getSaldoPoupanca() >= resgate) {
			ContaPoupanca.setSaldoPoupanca(ContaPoupanca.getSaldoPoupanca() - resgate);
			setSaldoCorrente(getSaldoCorrente() + resgate);
			System.out.println("Você resgatou da Poupanca = " + resgate);
		} else {
			System.out.println("SAQUE IMPOSSÍVEL!!");
		}
	}

	@Override
	public void imprimirSaldo() {

		System.out.println("Sr(a). " + getNome() + ", Saldo Atual da conta Corrente = " + getSaldoCorrente());
	}

}
