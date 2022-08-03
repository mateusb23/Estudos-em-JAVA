/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author mateusbispo
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[] = {3.3, 2.75, 9, -4.5};
        Arrays.sort(v);    //a classe Arrays.sort() coloca o vetor em ordem crescente
        for (double valor: v) {
            System.out.print(valor + " ");
        }
    }
    
}
