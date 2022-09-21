package aulas37a43exercicio03HerancaPolimorfismoClassesAbstratas;

public class Animal {

	private String nome;
	private float comprimento;
	private int patas;
	private String ambiente;
	private String cor;
	private double velocidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
	    this.cor = cor;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public String toString() {
		String s = "\nAnimal: " + nome;
		s += "\nComprimento: " + comprimento + "cm";
		s += "\nNúmero de patas: " + patas;
		s += "\nCor: " + cor;
		s += "\nAmbiente: " + ambiente;
		s += "\nVelocidade: " + velocidade + "m/s";
		
		return s;
	}
	
}
