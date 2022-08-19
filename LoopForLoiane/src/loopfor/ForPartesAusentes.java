package loopfor;

public class ForPartesAusentes {

	public static void main(String[] args) {
		
		int count = 0;
		for ( ; count < 5; ) {
			System.out.println("Valor de count: " + count);	
			count += 2;
		}
		
		/*Que seria basicamente o mesmo que --> for (count = 0; count < 5; count += 2)
		System.out.println("Valor de count: " + count);*/
	}

}
