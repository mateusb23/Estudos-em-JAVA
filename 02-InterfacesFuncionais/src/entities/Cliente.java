package entities;

public class Cliente implements Autentica {

	private String nome;
	private boolean status;
	private String senha;
	
	public Cliente() { }

	public Cliente(String nome, boolean status, String senha) {
		this.nome = nome;
		this.status = status;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public boolean isStatus() {
		return status;
	}

	public String getSenha() {
		return senha;
	}

	@Override
	public boolean autenticaSenha(String senha) {
	if (this.senha != senha) {
		System.out.println("Não autenticado");
		return false;
	}
		System.out.println("Autenticado");
		return true;
	}
	
}
