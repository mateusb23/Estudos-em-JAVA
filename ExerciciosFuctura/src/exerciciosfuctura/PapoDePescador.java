package exerciciosfuctura;

import java.util.Scanner;

public class PapoDePescador {

	public static void main(String[] args) {
		
		String n;
		float p, e = 0, m = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o sue nome: ");
		n = teclado.nextLine();
		
		System.out.println("Digite quantos quilos de peixe você pescou? ");
		p = teclado.nextFloat();
		
		if (p >= 50) {
			e = p - 50;
			m = e * 4;
		} else {
			System.out.println("O peso não ultrapassou o limite permitido.");
		}
			
		System.out.printf("\n--------Sr(a). %s , as suas informações referentes à pesca são: ---------", n);
		System.out.println("");
		System.out.printf("\nPeso de peixes pescado: %.1f kg", p);
		System.out.printf("\nPeso de peixes excedente: %.1f kg", e);
		System.out.printf("\nValor da multa, caso exista: R$ %.2f", m);
	}

}
