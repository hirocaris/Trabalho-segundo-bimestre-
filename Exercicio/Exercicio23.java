
package Exercicio23;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args){  
            Scanner entrada = new Scanner(System.in);
                
        int a1;  
        int a2;  
        
            System.out.println("Escreva o numero");
                a1 = entrada.nextInt();
            
            System.out.println("Escreva o divisor");
                a2 = entrada.nextInt();
  
      
    if (a1 >= a2){  
         
      while ( (a1%a2) != 0 ) {  
       int a3 = a1%a2;   
       a1 = a2;  
       a2 = a3;  
      }  
      System.out.println("O MDC entre "+a1+" e "+a2+" é: "+a2);  
    }        
    else   
      System.out.println("Não é possível dividir, "+a1+" menor que "+a2);  
  
    }  
}  

