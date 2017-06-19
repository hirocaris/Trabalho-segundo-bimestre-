/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio07;


public class Exercicio07 {
     static int numero (int num) {
       System.out.print("N° -> "+ num);
       num = num+2;
       
       if (num < 101){
           numero(num);
           
       }return num;
       
   }
   public static void main(String[] args) {
            System.out.println(numero(1));
    }
}
