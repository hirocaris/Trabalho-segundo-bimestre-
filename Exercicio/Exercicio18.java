
package Exercicio18;

import java.util.Scanner;


public class Exercicio18 {
  static int x;
    
    public static void main(String[] args) {
        System.out.println(juros(x));
    }
    static int juros (int x){
        Scanner entrada =new Scanner(System.in);
        int t , i =3;
        System.out.println("Digite o valor total");
        x = entrada.nextInt();
        System.out.println("Digite o tempo");
        t = entrada.nextInt();
        if (t ==0){
            return x;
        }else {return (x*i*t)/100;}
        
    }
}
