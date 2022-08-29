package aula24exercicio05;

public class TesteContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta1 = new ContaCorrente();
		conta1.numeroConta = "123456";
		conta1.agencia = "1234";
		conta1.nomeCliente = "Mateus Bispo";
		conta1.contaEspecial = true;
		conta1.limiteChequeEspecial = 500;
		conta1.saldo = -10;

		System.out.println("Slado da conta " + conta1.numeroConta + " = " + conta1.saldo);
		
	}

}
