/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testeexercicio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mateusbispo
 */
public class Testeexercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for(int n=1000 ; n<=1999 ; n++){
		if(n % 11 == 5){
			System.out.println(n);
    }
        }


        /*List<Integer> numbers = new ArrayList<Integer>();
        int result = 0;
        int i = 1;
        while (true) {
            result = i++ * 3;
            if (result > 100) {
                break;
            }
            numbers.add(result);
        }

        System.out.println(numbers);*/
    }
}
 
