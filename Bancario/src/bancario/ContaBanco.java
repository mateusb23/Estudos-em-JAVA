package bancario;

public class ContaBanco {
	//Atributos
	public int numconta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	//Métodos personalizados
	public void estadoAtual() {
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	public void abrirConta(String t) {
		this.setStatus(true);		//ou poderíamos ter acessado diretamente o atributo utilizando this.status = true;  -> mas é mais seguro e recomendado sempre utilizar pelo método
		this.setTipo(t);
		if (t == "cc") {			//ou poderíamos ter utilizado "cc".equals(t)
			this.setSaldo(50);
		} else if (t == "cp") {		//ou poderíamos ter utilizado "cp".equals(t)
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");
	}
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("A conta não pode ser fechada porque ainda tem dinheiro");
		} else if (this.getSaldo() < 0) {
			System.out.println("A conta não pode ser fechado pois tem débito");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}
	public void depositar(float v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		} else {
			System.out.println("Impossível depositar em uma conta fechada!");
		}
	}
	public void sacar(float v) {
		if (this.getStatus() == true) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono());
			} else {
				System.out.println("Slado insuficiente para saque");
			}
		} else {
			System.out.println("Impossível sacar de uma conta fechada!");
		}
	}
	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "cc") {
			v = 12;
		} else if (this.getTipo() == "cp") {
			v = 20;
		}
		if (this.getStatus() == true) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + getDono());
		} else {
			System.out.println("Impossível pagar uma conta fechada!");
		}
	}
	//Métodos especiais
	public void ContaBanco() {		//Construtor
		this.saldo = 0;				//this.setSaldo(0);
		this.status = false;        //this.setStatus(false);
	}
	public void setNumConta(int numconta) {
		this.numconta = numconta;
	}
	public int getNumConta() {
		return this.numconta;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public String getDono() {
		return this.dono;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getSaldo() {
		return this.saldo;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean getStatus() {
		return this.status;
	}
}
