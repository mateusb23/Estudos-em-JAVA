
package main1;

import java.util.Scanner;

public class Main1 {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
     
         int number,id;

         number=sc.nextInt();
         id=sc.nextInt();

         int count=0;
         while(number>0){

           int id1,num;

           id1=sc.nextInt();
           num=sc.nextInt();

// TODO: complete os espaços em branco com sua solução para o problema
           if(id==  id1    &&  num==   0   ){
		 count++;
	    }
             
           number--;
         }
         System.out.println(count);
        
    } 
    
}
