
package program;

import java.util.Scanner;

public class Program {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    	int N = teclado.nextInt();
    	for (int i = 0; i < N; i++) {
    		double n1 = teclado.nextDouble();
    		double n2 = teclado.nextDouble();
    		double n3 = teclado.nextDouble();
    		double media = ((n1*2) + (n2*3) + (n3*5)) / 10;
    		System.out.println(String.format("%.1f", media));
    	}
        
        /*int casos = input.nextInt();
        int cont = 0;
        while (cont < casos){
 
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            double media = ((a*2) + (b*3) + (c*5)) / 10;
            System.out.println(String.format("%.1f", media));
    } else {
        (System.out.println("Fim do programa");
    }*/
    
}
}