
package Exercicio14;

import java.util.Scanner;


public class Exercicio14 {
    public static void main(String[] args) {
    
    int []vet = new int[10];
    int soma = 0;
    
        System.out.println(pegarFalta(vet, 0, soma)/10);
    
       
    }

    private static int pegarFalta(int [] vet, int i,int soma) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a Falta ");
            soma +=vet[i] = entrada.nextInt();
            i++;
        
        if (i<10){
            return pegarFalta(vet, i, soma);
         
        }
        return soma;
       
       
    }

}
