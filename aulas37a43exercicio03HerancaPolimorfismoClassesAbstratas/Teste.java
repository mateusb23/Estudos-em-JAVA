package aulas37a43exercicio03HerancaPolimorfismoClassesAbstratas;

public class Teste {

	public static void main(String[] args) {
		
		Animal camelo = new Animal();
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setPatas(4);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2);
		
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5);
		
		Mamifero urso = new Mamifero();
		urso.setNome("Urso do Canadá");
		urso.setComprimento(180);
		urso.setPatas(4);
		urso.setCor("Vermelho");
		urso.setAmbiente("Terra");
		urso.setVelocidade(0.5);
		
		Animal[] animais = new Animal[3];
		animais[0] = camelo;
		animais[1] = tubarao;
		animais[2] = urso;
		
		System.out.println("Zoo: ");
		System.out.println("---------------------------------");
		
		for (int i = 0 ; i<animais.length ; i++) {
			System.out.println(animais[i]);
			System.out.println("---------------------------------");
		}
	}
	
}
