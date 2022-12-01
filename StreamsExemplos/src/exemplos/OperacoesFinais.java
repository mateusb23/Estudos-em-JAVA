package exemplos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperacoesFinais {

	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(1,5,8,9, -3,1,4,7,6,6,9,9);

		// JACA 8: STREAMS -> PARTE 2 - OPERAÇÕES FINAIS

		// 1) ARMAZENANDO STREAM EM UMA VARIÁVEL

		Stream<Integer> map = lista.stream()
				.limit(3)
				.map(e -> e * 2);

		map.forEach(e -> System.out.println(e));
		//map.forEach(e -> System.out.println(e));		// IMPORTANTE RESSALTAR QUE AO EXECUTAR UMA OPERAÇÃO FINAL, COMO forEach(), COM UM STREAM, ELE NÃO PERMITIRÁ MAIS ALGUMA.

		System.out.println();

		lista.stream()
		.limit(3)
		.map(e -> e * 2)
		.forEach(e -> System.out.println(e));		// VALE LEMBRAR QUE O forEach() É UM DOS MÉTODOS MENOS UTILIZADOS, QUANDO ESTAMOS UTILIZANDO STREAMS, POIS ELE NÃO RETORNA ALGO, MAS IMPRIME NO CONSOLE

		System.out.println();

		// 1.1) MÉTODO count()		--> VAI CONTAR A QUANTIDADE DE ELEMENTOS PRESENTES NO STREAM

		Long count = lista.stream()
				.limit(3)
				.map(e -> e * 2)
				.count();

		System.out.println(count);

		System.out.println();

		Long count2 = lista.stream()
				.filter(e -> e % 2 == 0)
				.count();

		System.out.println(count2);

		System.out.println();

		// 1.2) MÉTODO min() E max()		--> VAI MOSTRAR O VALOR MÍNIMO NO CASO DO min(), E VAI MOSTRAR O VALOR MÁXIMO NO CASO DO max()

		Optional<Integer> min = lista.stream()
				.filter(e -> e % 2 == 0)
				.min(Comparator.naturalOrder());

		System.out.println(min.get());

		System.out.println();

		Optional<Integer> max = lista.stream()
				.filter(e -> e % 2 == 0)
				.max(Comparator.naturalOrder());

		System.out.println(max.get());

		System.out.println();

		// 2) OPERAÇÕES FINAIS MAIS CUSTOMIZADAS:

		// 2.1) Coletor toList()		OBS: É UM DOS MAIS UTILIZADOS	-->  VAI COLETAR O RESULTADO DO STREAM E ARMAZENA EM UMA OUTRA LISTA 

		List<Integer> novaLista = lista.stream()
				.filter(e -> e % 2 == 0)
				.map(e -> e * 3)
				.collect(Collectors.toList());

		System.out.println(novaLista);

		System.out.println();

		// 2.2) Coletor groupingBy()		--> VAI CRIAR UM MAP DE ACORDO COM ALGUM CRITÉRIO QUE NÓS TIVERMOS ESTABELECIDO ANTERIORMENTE

		Map<Boolean, List<Integer>> mapa = lista.stream()
				.map(e -> e * 3)
				.collect(Collectors.groupingBy(e -> e % 2 == 0));

		System.out.println(mapa);

		System.out.println();

		Map<Integer, List<Integer>> mapa2 = lista.stream()	// nesse caso iremos pegar o resto da divisão de cada elemento por 3 e iremos agrupálos em um Map
				.collect(Collectors.groupingBy(e -> e % 3));

		System.out.println(mapa2);				/* ESSES EXEMPLOS 2.2) SÃO MUITO ÚTEIS PARA OCASIÕES ONDE NÓS TEMOS UMA LISTA DE CLIENTES E QUEREMOS AGRUPÁ-LOS 
												* POR IDADE... OU ENDEREÇO E OS CLIENTES RELACIONADOS A ELE ETC.
												*/
	}

}
