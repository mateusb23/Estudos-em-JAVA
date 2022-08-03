package aula02;

public class Aula02 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();						// objeto c1 instanciado(criado) a partir da classe Caneta 
		c1.cor = "Azul";
		c1.ponta = 0.5f;								// essa linha é uma referência a atributo ponta
		
		c1.tampar();
		c1.status();									// essa linha é uma referência ao método status
		c1.rabiscar();
		
		Caneta c2 = new Caneta();						// objeto c2 instanciado(criado) a partir da classe Caneta
		c2.modelo = "Esferográfica";
		c2.cor = "Preta";
		
		c2.destampar();
		c2.status();
		c2.rabiscar();
	}
	
}
