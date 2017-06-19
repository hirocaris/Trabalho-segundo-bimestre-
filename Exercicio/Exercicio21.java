
package Exercicio21;

import java.util.Scanner;


public class Exercicio21 {
    static int x;
    public static void main(String[] args) {
        System.out.println(tri(x));
    }
    static int tri(int x){
        Scanner entrada = new Scanner(System.in);
        x=entrada.nextInt();
        if (x == 1){
            return 1;
        }else {return x*(x+1)/2;}// formula do numero triamgulor n*(n-1)/n
    }
}
