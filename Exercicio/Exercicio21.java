
package Exercicio21;

import java.util.Scanner;


public class Exercicio21 {
    static int x;
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero");
        x=entrada.nextInt();
        
     System.out.println(tri(x));
    }
    static int tri(int x){
        
        if (x == 1){
            return x;
        }return x+tri(x-1);
    }
}
