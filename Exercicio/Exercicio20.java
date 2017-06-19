
package Exercicio20;




public class Exercicio20 {
    static int x = 6;
    public static void main(String[] args) {
        System.out.println(fato(x));
    }
    static int fato(int x){
       
        if (x ==0){
            return 1;
        }else {return x*fato(x-1);
        }
    }
}