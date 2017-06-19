
package Exercicio04;

import java.util.Scanner;

public class Exercicio04 {
   
public static void main(String[] args) {
 System.out.println(resultado());

	}
static int resultado (){
    int vetor[] = new int[10];

rec(vetor, 0);

int menValor = vetor[9];

return menor(vetor, menValor, menValor);		
}
static int menor(int vet[], int i, int valor) {

    if (vet[i] < valor) valor = vet[i];
    i++;

if (i > 9) {
return valor;
            
}
		
    return menor(vet, i, valor);

}

static void rec(int vetor[], int i) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite os valores ->    " + (i+1+": "));
	vetor[i] = entrada.nextInt();
	i++;

if (i < 10){	
    rec(vetor, i);
}

	}

    }
   