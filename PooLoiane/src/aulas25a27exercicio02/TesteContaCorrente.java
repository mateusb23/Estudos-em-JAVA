package aulas25a27exercicio02;

public class TesteContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente cliente1 = new ContaCorrente();
		cliente1.iniciarSistema();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o número da sua conta (0000): ");
		String numconta = teclado.next();
		cliente1.colocarNumeroConta(numconta);
		cliente1.colocarNumeroAgencia("1234-5");
		cliente1.depositar(4500);
		cliente1.sacar(3500);
		cliente1.contaEspecial = true;
		cliente1.chequeEspecial = false;
		cliente1.limiteChequeEspecial = 40000;
		cliente1.status();
	}

}
