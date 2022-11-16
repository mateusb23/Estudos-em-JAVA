package entities;

import java.util.function.Consumer;

public class MostraCliente implements Consumer<Cliente> {

	public void accept(Cliente c) {
		System.out.println("\n" + c.getNome() + "\n " + c.getSenha());
	}
	
}


/* INTERFACES FUNCIONAIS:
    -> UMA INTERFACE É CHAMADA DE FUNCIONAL QUANDO ELA APRENSENTA
	   UM ÚNICO MÉTODO ABSTRATO, PORÉM, ELA PODE TER UM OU MAIS MÉTODOS DEFAULT. */
