package application;

import java.util.ArrayList;

import entities.Printer;

public class Program {

	public static void main(String[] args) {
		
		Printer<Integer> printer = new Printer<>(23);
		printer.print();
		
		Printer<Double> printer2 = new Printer<>(23.9);	
		printer2.print();
		
		ArrayList<Printer> cats = new ArrayList<>();
		cats.add(printer);
		cats.add(printer2);
		cats.add(new Printer<>("mateus bispo"));
		
		System.out.print("[ ");
		System.out.print(cats.get(0));
		System.out.print(cats.get(1));
		System.out.print(cats.get(2));
		System.out.print(" ]");
	}
	
}
