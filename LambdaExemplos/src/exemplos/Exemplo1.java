package exemplos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;

public class Exemplo1 {

	public static void main(String[] args) {
		
		// JAVA 8: FUNÇÕES LAMBDA
		
		JButton jButton =  new JButton();
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Olá mundo!");
			}
		});

		// EXPRESSÃO LAMBDA
		
		JButton jButton2 = new JButton();
		jButton2.addActionListener(e -> System.out.println("Olá mundo!"));

		
		// OBS: É VÁLIDO LEMBRAR QUE addActionListener É UMA INTERFACE FUNCIONAL, OU SEJA, ELA TEM APENAS UM MÉTODO CHAMADO actionPerformed(ActionEvent e), QUE LOGICAMENTE, POR ESTAR EM UMA INTERFACE, ELE É ABSTRATO
		
		/* FORMATO DE UMA EXPRESSÃO LAMBDA:
		 * 		LEVANDO EM CONSIDERAÇÃO TUDO AQUILO QUE ESTÁ DENTRO DOS PARÊNTESES DA LINHA 27:
		 * 		1) A PRIMEIRA PARTE e SÃO OS PARÂMETROS QUE O MÉTODO actionPerformed(ActionEvent e) RECEBE
		 * 		2) E TUDO AQUILO À DIRETA DA SETINHA É A IMPLEMENTAÇÃO DO MÉTODO actionPerformed(ActionEvent e)
		 */
		
		// OUTRO EXEMPLO DE EXPRESSÃO LAMBDA
		
		new Thread(() -> System.out.println("Olá mundo!")).run();
		
		// COMO O MÉTODO ABASTRATO run() DA INTERFACE Runnable NÃO TEM PARÂMETROS, PODEMOS VER NA EXPRESSÃO QUE FICAM APENAS DOIS PARÊNTESES VAZIOS. 
		
		/* OBS:  As funções lambda existem para diminuir código e principalmente para ser utilizado em STREAM
		 * 
		 *	API DE STREAM:
		 *		stream - fluxo de dados
		 * 
		 */
		
		System.out.println();
		
		// EXEMPLO DE STREAM:
		
		List<Integer> asList1 = Arrays.asList(1,2,3,4);
		
		asList1.stream().forEach(e -> System.out.println(e));
		
		System.out.println();
		
		List<Integer> asList2 = Arrays.asList(1,2,3,4,5);
	
		for (Integer integer : asList2) {
			System.out.println(integer);
		}
		
		System.out.println();
		
		// O INTERESSANTE DO STREAM É QUE ELE TEM VÁRIAS UTILIZADADES E FUNCIONALIDADES, COMO: 
		
		List<Integer> asList3 = Arrays.asList(1,2,3,4,5,6);
		
		asList3.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));	// O MÉTODO filter() FILTRA OS DADOS QUE ESTARÃO CHEGANDO NA STREAM. NESSE CASO FILTRAMOS APENAS OS NÚMEROS PARES
		
	}

}






