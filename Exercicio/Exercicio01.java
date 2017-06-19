
package Exercicio01;

public class Exercicio01 {


    public static void main(String[] args) {
    recur(100);
        
    }
    public static  void recur(int n){
        
        if (n>=1){
            recur(n-1);
            System.out.println(n);
        }
        
        
    }
}
