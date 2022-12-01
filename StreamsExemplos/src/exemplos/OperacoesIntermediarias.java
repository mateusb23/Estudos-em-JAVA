package exemplos;

import java.util.Arrays;
import java.util.List;

public class OperacoesIntermediarias {

	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

		// JACA 8: STREAMS -> PARTE 1 - OPERAÇÕES INTERMEDIÁRIAS

		// JAVA 8 
		// stream = fluxo de dados	--> O sTREAM NOS PERMITE UTILIZAR VÁRIOS MÉTODOS AO MESMO TEMPO

		/*1) O MÉTODO skip(): 

		--->PULA/IGNORA NA LISTA A QUANTIDADE DE DADOS QUE COLOCAMOS DENTRO DOS PARÊNTESES*/

		/*2) O MÉTODO limit(): 

		--->LIMITA A QUANTIDADE DE ELEMENTOS QUE A STREAM IRÁ PROCESSAR DA LISTA À QUANTIDADE DE DADOS QUE COLOCAMOS DENTRO DOS PARÊNTESES*/
		
		/*3) O MÉTODO distinct(): 

		--->NÃO PERMITE QUE O STREAM PROCESSE ELEMENTOS REPETIDOS. É IMPORTANTE RESSALTAR QUE ESSE MÉTODO PRECISA DO EQUALS E HASHCODE.
		EM NOSSO CASO SÓ FUNCIONOU PELO FATO DE O EQUALS E HASHCODE JÁ ESTAREM IMPLÍCITOS NA CLASSE INTEGER */

		/*4) O MÉTODO filter(): 

		--->VAI FILTRAR OS ELEMENTOS DE ACORDO COM A REGRA QUE ESTABLECEMOS NO PREDICATE DENTRO DOS PARÊNTESES*/
		
		/*5) O MÉTODO map(): 

		--->É IMPORTANTE RESSALTAR QUE ESSE MÉTODO NÃO TEM NADA A VER COM A INTERFACE Map. 
		ESSE map() ESTÁ RELACIONADO À TRANSFORMÇÃO DE CADA ELEMENTO DA LISTA */
		
		lista.stream()
		.skip(2)
		.forEach(n -> System.out.println(n));

		System.out.println();

		lista.stream()
		.limit(3)
		.forEach(n -> System.out.println(n));

		System.out.println();

		lista.stream()
		.distinct()
		.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		lista.stream()
		.skip(2)
		.limit(3)
		.distinct()
		.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		lista.stream()
		.filter(n -> n % 2 == 0)
		.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		lista.stream()
		.map(n -> n * 2)	// OBS: IMPORTANTE RESSALTAR QUE A LISTA ORIGINAL NÃO FOI MODIFICADA
		.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		System.out.println(lista);
		
		System.out.println();
		
		lista.stream()
		.limit(3)
		.map(e -> e * 2)
		.skip(2)
		.distinct()
		.forEach(e -> System.out.println(e));
		
		System.out.println();
		
		/* FORMA IMPORTANTE DE UTILIZAÇÃO:   
		* --> AO UTILIZAR STREAMS, É ACONSELHÁVEL UTILIZAR OS FILTROS(COMO limit() e/ou filter() PRIMEIRO, E DEPOIS UTILIZAR UM TRANSFORMADOR COMO map().
		POR EXEMPLO : */ 
		
		lista.stream()
		.limit(3)
		.map(e -> e * 2)
		.forEach(e -> System.out.println(e));
		
	}

}
