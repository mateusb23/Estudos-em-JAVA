package exerciciosfuctura;

import java.util.Scanner;

public class MercadinhoFuctura {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String nome;
		int opcoes;
		float precototal = 0;
		boolean finalizasistema;


		System.out.println("Digite o seu nome: ");
		nome = teclado.nextLine();

		System.out.println("-----------------------------------------------------");
		System.out.println("-------------------MENU DE PRODUTOS------------------");
		System.out.println("-----------------------------------------------------");

		finalizasistema = false;
		while (finalizasistema == false) {

			System.out.println("Escolha a opção que deseja, logo abaixo, para: "
					+ "\n 1 - Ir ao menu de comidas"
					+ "\n 2 - Ir ao menu de móveis e utensílios e móveis"
					+ "\n 3 - Ir ao menu de materiais de construção e ferramentas"
					+ "\n 4 - Finalizar Sistema");

			opcoes = teclado.nextInt();

			switch (opcoes) {

			case 1:

				boolean retornacomidas = true;
				while (retornacomidas == true) {

					int quant;
					int indice;
					float [] precos = {4.5f, 3f, 6.45f, 2.90f, 3.5f, 45f, 0.5f};

					System.out.println("---------------COMIDAS---------------"
							+ "\n 1 - Bananas R$ 4,50 - (kg)"
							+ "\n 2 - Maçã R$ 3,00 - (kg)"
							+ "\n 3 - Melão R$ 6,45 - (kg)"
							+ "\n 4 - Goiaba R$ 2,90 - (kg)"
							+ "\n 5 - Mamão R$ 3,50 - (kg)"
							+ "\n 6 - Carne R$ 45,00 - (kg)"
							+ "\n 7 - ovos R$ 0,50 - (unid)"
							+ "\n 8 - Voltar ao menu anterior");

					System.out.println("Opção que você deseja: ");
					indice = teclado.nextInt();
					
					if (indice != 8 && indice < 8 && indice > 0) {
						System.out.println("Quantidade: ");
						quant = teclado.nextInt();

						precototal += precos[indice - 1] * quant;
						System.out.println("Preço total: R$ " + precototal);
					} else {
						retornacomidas = false;
					}

				} break;

			case 2:

				boolean retornautensilios = true;
				while (retornautensilios == true) {

					int quant;
					int indice;
					float [] precos = {25.5f, 60f, 23.45f, 10.60f};

					System.out.println("---------------UTENSÍLIOS E MÓVEIS---------------"
							+ "\n 1 - Cadeira R$ 25,50 - (unid)"
							+ "\n 2 - Mesa R$ 60,00 - (unid)"
							+ "\n 3 - Roupão R$ 23,45 - (unid)"
							+ "\n 4 - Óculos de sol R$ 10,60 - (unid)"
							+ "\n 5 - Voltar ao menu anterior");

					System.out.println("Opção que você deseja: ");
					indice = teclado.nextInt();
					
					if (indice != 5 && indice < 5 && indice > 0) {
						System.out.println("Quantidade: ");
						quant = teclado.nextInt();

						precototal += precos[indice - 1] * quant;
						System.out.println("Preço total: R$ " + precototal);
					} else {
						retornautensilios = false;
					}
				} break;

			case 3:

				boolean retornamateriais = true;
				while (retornamateriais == true) {

					int quant;
					int indice;
					float [] precos = {60.90f, 21.89f, 23.49f, 110.60f, 31.99f};

					System.out.println("---------------METERIAIS DE CONSTRUÇÃO E FERRAMENTAS---------------"
							+ "\n 1 - Tinta R$ 60,90 - (unid)"
							+ "\n 2 - Pincel R$ 21,89 - (unid)"
							+ "\n 3 - Balde de plástico R$ 23,49 - (unid)"
							+ "\n 4 - Escada R$ 110,60 - (unid)"
							+ "\n 5 - Martelo R$ 31,99 - (unid)"
							+ "\n 6 - Voltar ao menu anterior");

					System.out.println("Opção que você deseja: ");
					indice = teclado.nextInt();
					
					if (indice != 6 && indice < 6 && indice > 0) {
						System.out.println("Quantidade: ");
						quant = teclado.nextInt();

						precototal += precos[indice - 1] * quant;
						System.out.println("Preço total: R$ " + precototal);
					} else {
						retornamateriais = false;
					}
				} break;

			case 4: 
				
				finalizasistema = true;
				
				System.out.printf("\nValor total a ser pago por Sr(a) %s --> R$ %.2f", nome, precototal);
				System.out.println("\n--------------------------------------------------------------");
				System.out.println("--------------------------------------------------------------");
				System.out.println("...FINALIZANDO SISTEMA...");
				
				break;
				
			default:
				
				System.out.println("FIM");
				
			}

		}

	}

}

