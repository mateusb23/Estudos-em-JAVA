package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import entities.Cliente;

public class Program {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Michelli", true, "123");
		Cliente c2 = new Cliente("Bruno", true, "456");
		Cliente c3 = new Cliente("Mateus", true, "357");
		
		c1.autenticaSenha("342");
		
		List<Cliente> clientes = Arrays.asList(c1, c2, c3);
		
		/*for (Cliente cliente : clientes) {
			
			System.out.print("\n" + cliente.getNome() + "\n " + cliente.getSenha());
		}*/
		
		/*Consumer<Cliente> consumidor = new Consumer<Cliente>() { // UTILIZAMOS CLASSES ANÔNIMAS QUANDO QUEREMOS EVITAR O REUSO DE CÓDIGO
			public void accept(Cliente c) {
				System.out.println(c.getNome());
			}
		};*/
		
		//Consumer<Cliente> consumidor = (Cliente c) -> {System.out.println(c.getNome());}; // EXEMPLO DE EXPRESSÃ0 LAMBDA
		
		//clientes.forEach((Cliente c) -> {System.out.println(c.getNome());});  // EXEMPLO DE EXPRESSÃO LAMBDA DENTRO DO MÉTODO forEach();

		clientes.forEach(Cliente::getNome);	// EXEMPLO DE LAMBDA COM REFERENCE METHOD
	
		Cliente c4 = new Cliente("Ana", false, "333");
		
		System.out.println("--------------------");
		
		Consumer<Cliente> consumidor1 = Cliente::getNome;
		consumidor1.accept(c4);
		
		System.out.println("--------------------");
		
		Runnable r1 = c4::getNome;
		r1.run();
	}

}


/* OBS: É IMPORTANTE RESSALTAR QUE EXPRESSÕES LAMBDAS SÓ PODEm SER UTILIZADA PARA IMPLEMENTAR
   INTERFACES FUNCIONAIS */

/* OBS: METHOD REFERENCE: 
		ELA CONSISTE EM UMA FORMA DE ESCREVER UMA EXPRESSÃO LAMBDA DE FORMA REDUZIDA, QUANDO 
		PRECISAMOS APENAS CHAMAR UM MÉTODO JÁ EXISTENTE. 
		EXEMPLO:  NA LINHA 34, PODEMOS NOTAR QUE O MÉTODO getNome() JÁ EXISTE. COM ISSO, PODEMOS
		UTILIZAR O METHOD REFERENCE PARA DEIXAR O CÓDIGO DE UMA FOMRA MAIS ENXUTA. 
		
		METHOD REFERENCE É COMPOSTO POR 3 PARTES: 	EXEMPLO: clientes.forEach(Cliente::getNome);
				1) o Tipo do objeto dentro dos parênteses
				2) colocamos duas vezes os dois pontos(::)
				3) em seguida, colocamos o nome do método que queremos chamar
		*/



