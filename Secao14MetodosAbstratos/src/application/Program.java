package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();		/*		-------	IMPORTANTE -------
													*	 Sempre utilize o tipo genérico aqui na sua coleção/lista, pois nosso objetivo aqui sempre vai 
													*    ser ter os benefícios do POLIMORFISMO. OU SEJA, VOC6E PRECISA DECLARAR A SUA LISTA DO TIPO DA
													*    SUPERCLASSE(que nesse caso é Shape) E, DESSA FORMA, A LISTA VAI ACEITAR DADOS DE TODOS OS TIPOS
													*    DAS SUBCLASSES.
													*/
		
		System.out.print("Enter the number of shapes: ");
		int n = teclado.nextInt();
		
		for (int i = 0 ; i < n ; i++) {
			System.out.println("Shape #" + (i+1) + " data: ");
			System.out.print("Rectange or circle (r/c)? ");
			char ch = teclado.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(teclado.next());
			if (ch == 'r') {
				System.out.print("Width: ");
				double width = teclado.nextDouble();
				System.out.print("Height: ");
				double height = teclado.nextDouble();
				list.add(new Rectangle(color, width, height));	// foi feito um UPCASTING naturalmente, de Rectangle para Shape
			} else {
				System.out.print("Radius: ");
				double radius = teclado.nextDouble();
				list.add(new Circle(color, radius));	// foi feito um UPCASTING naturalmente, de Circle para Shape
			}	
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i).area());
		}
		
		teclado.close();
	}

}
