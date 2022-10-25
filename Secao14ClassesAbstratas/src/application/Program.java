package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001,"Alex",500.00,0.01));
		list.add(new BusinessAccount(1002,"Maria",1000.00,400.00));
		list.add(new SavingsAccount(1004,"Bob",300.00,0.01));
		list.add(new BusinessAccount(1005,"Anna",500.00,500.00));
		
		double sum = 0;
	/*	for (Account acc : list) {
			sum += acc.getBalance();
		} */
		
		for (int i = 0 ; i < list.size() ; i++) {
			 sum += list.get(i).getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (int i = 0 ; i < list.size() ; i++) {
			 list.get(i).deposit(10.00);
		}
		
		for (int i = 0 ; i < list.size() ; i++) {
			 System.out.printf("Updated balance for account %d: %.2f%n", list.get(i).getNumber(), list.get(i).getBalance());
		}
		
	}

}
