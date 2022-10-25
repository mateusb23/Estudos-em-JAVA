package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING  --> converter o objeto da subclasse para a superclasse
		
		Account acc1 = bacc;
		/* 
		 * NA LINHA 16 FIZEMOS COM QUE UM OBJETO bacc DA SUBCLASSE BusinessAccount 
		 * FOSSE ATRIBUIDO À UMA VARIÁVEL acc1 SUPERCLASSE Account. ISSO NÃO DÁ
		 * ERRO DEVIDO A FATO DE A HERANÇA SER UMA RELAÇÃO (é um), OU SEJA, NESSE
		 * CASO, UMA CLASSE BusinessAccount É UMA Account, UM CONTA EMPRESARIAL TAMBÉM
		 * É UMA CONTA. COM ISSO, DEVIDO AO FATO DE BusinessAccount TAMBÉM SER UMA Account
		 * PODEMOS ATRIBUIR UM OBJETO DO TIPO bacc PARA UM OBJETO acc1 TIPO Account.
		 */
		
		// POLIMORFISMO
		
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);	// NAS LINHAS 27 À 29 PODEMOS OBSERVAR UM EXEMPLO CLARO DE POLIMORFISMO,
																		// VISTO QUE acc2 E acc3 SÃO DUAS VARIÁVEIS DE MESMO TIPO APONTANDO PARA
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);		// OBJETOS DE TIPOS DE TIPOS DIFERENTES E, DESSA FORMA, TERÃO COMPORTAMENTOS DIFERENTES. 
		
		// DOWNCASTING  --> converter o objeto da superclasse para a subclasse
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount) acc3;
		/*
		 * ESSE TIPO DE ERRO NA HORA DE FAZER O DOWNCASTING NA LINHA 36 OCORRE, POIS
		 * NÃO TEMOS COMO FAZER O DOWNCASTING DE UM OBJETO DO TIPO Account PARA BusinessAccount,
		 * UMA VEZ QUE acc3 FOI INSTANCIADA A PARTIR DE UM SavingsAccount, E NÃO DE UM BusinessAccount.   
		 */
		
		// COMO PODEMOS EVITAR ESSE TIPO DE ERRO DA LINHA 36? -> 
		/* 
		 * IREMOS TESTAR PRA VER SE ESSE OBJETO acc3 REALMENTE É DO TIPO BusinessAccount. CASO ELE
		 * REALMENTE SEJA DO TIPO BusinessAccount, AÍ SIM FAZEMOS A CONVERSÃO.
		 * PARA ISSO UTILIZAMOS O instanceof. 
		 * EXEMPLO DE USO ESTÁ NA LINHA 52, QUE DIZ O SEGUINTE:
		 *	se o que estiver na variável acc3 for um objeto que seja instância de BusinessAccount,
		 *	aí sim, eu posso fazer o downcasting BusinessAccount acc5 = (BusinessAccount) acc3; 	
		 */
		
		if (acc3 instanceof BusinessAccount) {			
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		Account acc6 = new Account(1007, "Fiódor", 1000.00);
		acc6.withdraw(200.00);
		System.out.println(acc6.getBalance());
		
		Account acc7 = new SavingsAccount(1008, "Mateus", 1000.00, 0.01);	// TESTEI A SOBREPOSIÇÃO DO MÉTODO withdraw() E VI QUE ESTÁ FUNCIONANDO BEM
		acc7.withdraw(200.00);
		System.out.println(acc7.getBalance());
	}

}




