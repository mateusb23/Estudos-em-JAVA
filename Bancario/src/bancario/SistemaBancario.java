package bancario;

public class SistemaBancario {

	public static void main(String[] args) {
		ContaBanco pessoa1 = new ContaBanco();
		pessoa1.setNumConta(0001);
		pessoa1.setDono("Mateus Bispo");
		pessoa1.abrirConta("cc");
		pessoa1.depositar(100);
		pessoa1.sacar(150);
		pessoa1.fecharConta();
		pessoa1.estadoAtual();
		
		ContaBanco pessoa2 = new ContaBanco();
		pessoa2.setNumConta(0002);
		pessoa2.setDono("Bruna Valkiria");
		pessoa2.abrirConta("cp");
		pessoa2.depositar(500);
		pessoa2.sacar(120);
		pessoa2.estadoAtual();
	}

}
