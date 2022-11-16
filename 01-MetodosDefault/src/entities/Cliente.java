package entities;

public class Cliente {

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
	
}
