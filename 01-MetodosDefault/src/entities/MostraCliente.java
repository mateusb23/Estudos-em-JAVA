package entities;

import java.util.function.Consumer;

public class MostraCliente implements Consumer<Cliente> {

	public void accept(Cliente c) {
		System.out.println("\n" + c.getNome() + "\n " + c.getSenha());
	}
	
}
