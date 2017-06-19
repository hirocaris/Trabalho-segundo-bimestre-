
package Exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    	public static void main(String[] args) {
		int[] vet = new int[10];

		rec(vet, 0); 

		int v = vet[9];

		System.out.println("O menor valor é: " + m(vet, 0, v));

	}

	static int m(int[] vetor, int i, int v) {

		if (vetor[i] > v) v = vetor[i];
		i++;

		if (i > 9) 	return v;
		
		return m(vetor, i, v);

	}

	static void rec(int[] vetor, int i) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite os números do vetor: " + (i + 1));
		vetor[i] = entrada.nextInt();
		i++;

		if (i < 10){
                rec(vetor, i);
	}
}
}
