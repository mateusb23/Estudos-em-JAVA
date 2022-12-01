package exemplos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exemplo2 {

	public static void main(String[] args) {
		
		// List<T>
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		// forEach() com List
		
		list.forEach(n -> System.out.println(n));	// MÉTODO forEach()
		System.out.println();
		
		// removeIf() com List
		
		list.removeIf(n -> n % 2 == 0);		// MÉTODO removeIf()
		list.forEach(n -> System.out.println(n));
		System.out.println();
		
		// replaceAll() com List
		
		list.replaceAll(n -> n * 2);		// MÉTODO replaceAll()
		list.forEach(n -> System.out.println(n));
		System.out.println();
		
		// HashMap()
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(0, "Se");
		map.put(1, "inscreva");
		map.put(2, "no");
		map.put(3, "canal");
		
		// forEach() com Map
		
		map.forEach((k, v) -> System.out.println(k + v));
		System.out.println();
		
		// compute() com Map	--> compute() é uma operação que vai ser executada em algum elemento do map
		
		map.compute(1, (k, v) -> v + " agora");
		map.forEach((k, v) -> System.out.println(k + v));
		System.out.println();
		
		// merge() com Map
		
		map.merge(3, "!", (v1, v2) -> v1 + v2);
		map.forEach((k, v) -> System.out.println(k + v));
		System.out.println();
		
		map.merge(4, "!", (v1, v2) ->  v1 + v2);
		map.forEach((k, v) -> System.out.println(k + v));
		System.out.println();
		
		// replaceAll() com Map
		
		map.replaceAll((k, v) -> v + "!");
		map.forEach((k, v) -> System.out.println(k + v));
		
	}
	
}
