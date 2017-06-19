/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio02;

public class Exercicio02 {
    public static void main(String[] args) {        
        recur(0);
    }
    public static void recur(int n){
        if (n<101){
            recur(n+1);
            System.out.println(n);
        }
    }
}
