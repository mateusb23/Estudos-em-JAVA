package ProjetoTesteFinalModulo01;

public abstract class Contas {

	private String numConta;
    private String nome;
    private double saldoTotal;
    
    public Contas() { }
    
	public String getNumConta() {
		
		return numConta;
	}
	
	public void setNumConta(String numConta) {
		
		this.numConta = numConta;
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public double getSaldoTotal() {
		
		return saldoTotal;
	}
	
	public void setSaldoTotal(double saldoTotal) {
		
		this.saldoTotal = saldoTotal;
	}
	
	public abstract void imprimirSaldo();
	
}
