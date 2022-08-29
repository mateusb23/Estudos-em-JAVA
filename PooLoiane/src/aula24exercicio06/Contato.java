package aula24exercicio06;

public class Contato {

	public static void main(String[] args) {
		
		AgendaCelular contato1 = new AgendaCelular();
		contato1.nome = "João";
		contato1.email = "joao1234@gmail.com";
		contato1.endereco = "Rua Casa de Chapéu  nº 907 - Recife - PE";
		contato1.telefones = new String[5];
		contato1.telefones[0] = "819979-79765";
		contato1.telefones[1] = "8199893-4737";
		contato1.telefones[2] = "8100900-9403";
		
		System.out.println();
	}
}
