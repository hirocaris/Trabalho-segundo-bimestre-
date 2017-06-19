
package Exercicio15;

import java.util.Scanner;


public class Exercicio15 {
    public static void main(String[] args) {
    
    int []vet = new int[10];
    int soma = 0;
    
        System.out.println(pegarIdade(vet, 0, soma)/10);
    
       
    }

    private static int pegarIdade(int [] vet, int i,int soma) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a nota ");
            soma +=vet[i] = entrada.nextInt();
            i++;
        
        if (i<10){
            return pegarIdade(vet, i, soma);
         
        }
        return soma;
       
       
    }

    
}
