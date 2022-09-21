package aulas37a43exercicio01HerancaPolimorfismo;

public class Teste {

	public static void main(String[] args) {

		System.out.println("*** Teste ContaBancaria *** ");
		
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente Conta Simples");
		contaSimples.setNumConta("12345");
		
		contaSimples.depositar(100);
		
		Teste.realizarSaque(contaSimples, 50);
		
		Teste.realizarSaque(contaSimples, 70);
		
		System.out.println(contaSimples);

		System.out.println("*** Teste ContaPoupança *** ");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Cliente Conta Poupança");
        contaPoupanca.setNumConta("22222");
        contaPoupanca.setDiaRendimento(30);
		
		contaPoupanca.depositar(100);
		
		Teste.realizarSaque(contaPoupanca, 50);
		
		Teste.realizarSaque(contaPoupanca, 70);
		
		if (contaPoupanca.calcularNovoSaldo(0.5)){
            System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
        }
		
		System.out.println(contaPoupanca);
		
		System.out.println("*** Teste ContaEspecial *** ");
		
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Cliente Conta Simples");
		contaEspecial.setNumConta("33333");
		contaEspecial.setLimite(50);
		
		contaEspecial.depositar(100);
		
		Teste.realizarSaque(contaEspecial, 50);
		
		Teste.realizarSaque(contaEspecial, 70);
		
		Teste.realizarSaque(contaEspecial, 80);
		
		System.out.println(contaEspecial);

	}
	
	private static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			/*
			 * Um exemplo de POLIMORFIRMO é quando utilizamos realizarSaque(ContaBancaria conta, double valor),
			 * pois ContaPoupanca e ContaEspecial também são automaticamente ContaBancaria e, dessa forma
			 * não faz-se necessário instanciar objetos a partir delas aqui dentro desse método realizarSaque.
			 * Outro exemplo de POLIMORFISMO claro ocorrendo neste método, pois ao utilizarmos o método sacar, 
			 * o java já entende de qual classe estamos falando a partir objeto/variável instanciada a partir 
			 * da classe em questão. Obs: o método sacar começa em ContaBancaria e é herdado nas classes 
			 * ContaPoupanca e ContaEspecial, mas é em ContaEspecial que se utiliza de polimorfimo, 
			 * pois altera algumas coisas do método herdado. O bom do polimorfismo pe que ele evita a reescrita de 
			 * código lá no main, por exemplo.
			 */
			System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque de " + valor + " saldo de = " + conta.getSaldo());
		}
	}

}
