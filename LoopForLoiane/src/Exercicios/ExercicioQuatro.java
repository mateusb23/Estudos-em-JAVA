package Exercicios;

public class ExercicioQuatro {

	public static void main(String[] args) {
		
		/*for (int ano = 2022, pa = 80000, pb = 200000; pa <= pb; ano += 1, pa *= 1.03, pb *= 1.015) {
			System.out.println(ano + " -> " + " País A: " + pa + " -> " + " País B: " + pb);
			System.out.println("Já se passaram -> " + (ano-2022) + " anos");
		}*/
		
		// ----------- FORMA FEITA PELA PROFESSORA LOIANE -------------
		
		int pa = 80000;
		int pb = 200000;
		int contadoranos = 0;
		
		while (pa <= pb) {
			
			pa *= 1.03;
			pb *= 1.015;
			contadoranos++;
		}
		
		System.out.println("População A: " + pa);
		System.out.println("População B: " + pb);
		System.out.println("Quantidade de anos: " + contadoranos);
	}

}
