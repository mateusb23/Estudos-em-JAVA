package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = teclado.nextLine();
		System.out.print("Email: ");
		String email = teclado.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(teclado.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus Status = OrderStatus.valueOf(teclado.next());
		
		Order order = new Order(new Date(), Status, client);
		
		System.out.println("How many items to this order? ");
		int N = teclado.nextInt();
		
		for (int i = 0 ; i < N ; i++) {
			System.out.println("Enter #" + (i+1) + " item data: ");
			System.out.print("Product name: ");
			teclado.nextLine();
			String productName = teclado.nextLine();
			System.out.print("Product price: ");
			double productPrice = teclado.nextDouble();
			System.out.print("Quantity: ");
			int quantity = teclado.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem it = new OrderItem(quantity, productPrice, product);
			
			order.addItem(it);
			
		}
		
		System.out.println();
		System.out.println(order);
		
		teclado.close();
	}
	
}
