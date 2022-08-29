package aulas25a27exercicio02;

public class TesteContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente cliente1 = new ContaCorrente();
		cliente1.iniciarSistema();
		cliente1.colocarNumeroConta("0001");
		cliente1.colocarNumeroAgencia("1234-5");
		cliente1.depositar(4500);
		cliente1.sacar(3500);
		cliente1.contaEspecial = true;
		cliente1.chequeEspecial = false;
		cliente1.limiteChequeEspecial = 40000;
		cliente1.status();
	}

}
