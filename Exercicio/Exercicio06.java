
package Exercicio06;


public class Exercicio06 {
   static int numero (int num) {
       System.out.print("N° -> "+ num);
       num = num+2;
       
       if (num < 101){
           numero(num);
           
       }return num;
       
   }
   public static void main(String[] args) {
            System.out.println(numero(0));
    }
}
