
package Exercicio10;

import java.util.Scanner;


public class Exercicio10 {
    public static void main(String[] args) {
        System.out.println(recebe());
    }
    static int recebe(){
       int [][] matriz = new int [5][5];
		
		rec(matriz, 0, 0);
		
		impr(matriz, 0, 5,5);
                return 0;
    }
    static void impr(int [][] matriz, int i, int j, int count) {
		
		System.out.println("número: " + count + "º:" + matriz[i][j]);
		j++;
		count++;
		
		if(j == 5){
			i++;
			j = 0;
		}
			
		if(i < 5) impr(matriz,i , j, count);
}
	
	static void rec(int [][] matriz, int i, int j) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número  ->: ");
		matriz[i][j] = sc.nextInt();
		j++;
		
		if(j == 4){
			i++;
			j = 0;
		}
			
		if(i < 5) rec(matriz,i , j);
		
		}
		
}
	


