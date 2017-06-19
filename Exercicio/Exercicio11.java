
package Exercicio11;

import java.util.Scanner;


public class Exercicio11 {
    public static void main(String[] args) {
		      System.out.println(vet());
		
		
}
    static int vet (){
        int [][][] matriz = new int [41][41][0];
		
		 rece(matriz, 0, 0,0);
		
		impr(matriz, 0, 0,1,0);
                return 0;
    }
    static void rece(int [][][] matriz, int i, int j,int k) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		matriz[i][j][k] = sc.nextInt();
		k++;
		
		if(k == 2){
			j++;
			k = 0;
						
		}
		
		if(j == 2){
			i++;
			j = 0;
		}	
		
		if(i < 2) rece(matriz,i , j, k);
		
		}
	static void impr(int [][][] matriz, int i, int j, int c, int k) {
		
		System.out.println("número: " + c + matriz[i][j][k]);
		k++;
		c++;
		
		if(k == 2){
			j++;
			k = 0;
		}

		if(j == 2){
			i++;
			j = 0;
		}
			
		if(i < 2) impr(matriz,i , j, c, k);
}
	
	
		

}
