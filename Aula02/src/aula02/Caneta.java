package aula02;

public class Caneta {				// Na minha classe Caneta eu estou com 5 atributos e 3 métodos
	String modelo;						
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar");
		} else {
			System.out.println("Estou Rabiscando");
		}
	}
	
	void tampar() {
		this.tampada = true;		// this  é uma referência ao objeto que chamou, que nesse caso foi o c1
	}								/*sempre que você quiser modificar algum atributo dentro da pópria 
									classe, coloque a palavra this na frente da linha que vai mexer nesse atributo.*/
	
	void destampar() {
		this.tampada = false;
	}
	
	
}
