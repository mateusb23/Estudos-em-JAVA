package aula05;

public class Caneta {
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public Caneta(String m, String c, float p) {		//Este é o método Construtor
		this.setModelo(m);
		this.setCor(c);
		this.setPonta(p);
		this.tampar();
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String c) {
		this.cor = c;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("SOBRE A CANETA: ");
		System.out.println("Modelo " + this.getModelo());		//System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.getPonta());	    //System.out.println("Ponta: " + this.ponta);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);
	}
	
}
