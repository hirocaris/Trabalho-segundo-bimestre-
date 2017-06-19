
package Exercicio03;

import java.util.Scanner;

public class Exercicio03 {
  

		public static void main(String[] args) {
		
		 System.out.println(resul());         

	}
                static int resul(){
                    int re;
                    int[] numvetor = new int[10];
		
                 re = num(numvetor, 0, 0);
		return re;
                }

	static int num(int[] vetor, int i, int soma) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor ->: ");
		vetor[i] = entrada.nextInt();
		
		
		soma += vetor[i];
		i++;
		
		if (i < 10)
			return num(vetor, i, soma);

		return soma;
	}
}
	

