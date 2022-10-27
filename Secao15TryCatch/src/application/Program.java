package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("End of program");
		
	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner teclado = new Scanner(System.in);
		
		try {
			List<String> list = new ArrayList<>();
			System.out.print("Quantos nomes você deseja escrever? ");
			int n = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Escreva os nomes: ");
			for (int i = 0 ; i < n ; i++) {
				String name = teclado.nextLine();
				list.add(name);
			}
			
			System.out.print("Diga qual posição do vetor você deseja ver: ");
			int position = teclado.nextInt();
			System.out.println(list.get(position));
		} 
		catch (IndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();		// VAI IMPRIMIR NA TELA O RASTREAMENTO DO STACK, COMO JÁ DIZ A PRÓPRIA EXPRESSÃO EM INGLÊS
			teclado.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		teclado.close();
		System.out.println("***METHOD2 END***");
	}

}
 