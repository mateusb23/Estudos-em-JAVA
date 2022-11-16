package application;

import java.util.Arrays;
import java.util.List;

import entities.Cliente;
import entities.MostraCliente;

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
		
		MostraCliente mc = new MostraCliente();
		
		clientes.forEach(mc);

	}

}
