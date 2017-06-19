 
package Exercicio13;

import java.util.Scanner;


public class Exercicio13 {
    public static void main(String[] args) {
    
    float []vet = new float[10];
    int soma = 0;
    
        System.out.println(pegarNotas(vet, 0, soma)/10);
    
       
    }

    private static int pegarNotas(float [] vet, int i,int soma) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a nota ");
            soma +=vet[i] = entrada.nextInt();
            i++;
        
        if (i<10){
            return pegarNotas(vet, i, soma);
         
        }
        return soma;
       
       
    }

    
}