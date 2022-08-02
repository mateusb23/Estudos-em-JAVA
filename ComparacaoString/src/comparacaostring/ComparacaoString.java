/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author mateusbispo
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Mateus";
        String nome2 = "Mateus";
        String nome3 = new String("Mateus");
        String res;
        res = (nome1==nome3)?"igual":"diferente";  //quando executamos o programa dessa forma, o resultado retornado será a palavra "diferente",
        System.out.println(res);                   //pois podemos notar que nome3 foi instanciado com uma cláusula new, porém o conteúdo é igual
        
        String nome4 = "Mateus";
        String nome5 = "Mateus";
        String nome6 = new String("Mateus");
        String res2;
        res2 = (nome4.equals(nome6))?"igual":"diferente";  // .equals verifica se o conteúdo que está dentro de um objeto é igual ao que está no outro.
        System.out.println(res2);                          // nesse caso, o .equals verifica se aquilo que está dentro de nome4 é igual ao que está em nome6
    }                                                      // ou seja, para objetos nós utilizamos o .equals e não o ==, isso serve para qualquer uma das classes invólucro
    
}
