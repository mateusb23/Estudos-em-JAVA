/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

/**
 *
 * @author mateusbispo
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade1 = 30;
        String valor1 = Integer.toString(idade1);
        System.out.println(valor1);
        
        float segundos = 7.6f;
        String valor2 = Float.toString(segundos);
        System.out.println(valor2);
        
        String valor3 = "30.5";
        float idade2 = Float.parseFloat(valor3);
        System.out.println(idade2);
        
        String valor4 = "99";
        int idade3 = Integer.parseInt(valor4);
        System.out.println(idade3);
        
    }
    
}
