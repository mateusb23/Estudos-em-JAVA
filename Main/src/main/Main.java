
package main;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
         Scanner sc=new Scanner(System.in);
 

    int N = sc.nextInt();
    int I = sc.nextInt();

    for (int c=0; c < N; c++) {

       int i, j;
       i = sc.nextInt();
       j  = sc.nextInt();
       
         int count = 0;
         if (I == i &&  j == 0) {
         count = count + 1;
    }
    System.out.print(count);
    }
    sc.close();
        
    }
    
}
