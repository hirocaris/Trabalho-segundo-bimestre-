
package Exercicio12;

import java.util.Scanner;

public class Exercicio12 {
  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int x;
        int conta = 0;
        int re =0;
        
        System.out.println("digite");
        x = entrada.nextInt();
        
        digi(conta,x,re);
    }

    

    public static void  digi(int conta, int x, int re) {
        if (conta < 10) {
            re =x*conta;
            System.out.print(re+",");
           
            conta ++;
        }
        
        if (conta == 10){
            re=x*conta;
            System.out.print(re);
        }
        
        else digi(conta, x, re); 
    }
}