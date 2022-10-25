package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		List<TaxPayer> list = new ArrayList<>();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Enter the number of taxpayers: ");
		int N = teclado.nextInt();
		
		for (int i = 0 ; i < N ; i++) {
			System.out.println("TaxPayer #" + (i+1) + " data: ");
			System.out.print("Indiviual or company (i/c)? ");
			char type = teclado.next().charAt(0);
			teclado.nextLine();
			System.out.print("Name: ");
			String name = teclado.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = teclado.nextDouble();
			
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = teclado.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = teclado.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i).getName() + ": $ " + String.format("%.2f",list.get(i).tax()));
		}
		
		System.out.println();
		double sum = 0;
		for (int i = 0 ; i < list.size() ; i++) {
			sum += list.get(i).tax();
		}
		
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f",sum));
		
		teclado.close();
	}

}
