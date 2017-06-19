
package Exercicio09;


public class Exercicio09 {
     static int numero (int num) {
       System.out.print("N° -> "+ num);
       num = num-2;
       
       if (num >= 0){
           numero(num);
           
       }return num;
       
   }
   public static void main(String[] args) {
            System.out.println(numero(101));
    }
}
