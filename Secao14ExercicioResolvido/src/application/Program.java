package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = teclado.nextInt();

		for (int i = 1 ; i <= n ; i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char ch = teclado.next().charAt(0);
			System.out.print("Name: ");
			teclado.nextLine();
			String name = teclado.nextLine();
			System.out.print("Hours: ");
			int hours = teclado.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = teclado.nextDouble();
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = teclado.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
				/* 
				 * OU PODERÍAMOS TER FEITO: 
				 * list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge););
				 */
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}

		}

		System.out.println();
		System.out.println("PAYMENTS: ");
		
		for (int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i).getName() + " - $ " + String.format("%.2f", list.get(i).payment()));
		}

		teclado.close();
	}

}
