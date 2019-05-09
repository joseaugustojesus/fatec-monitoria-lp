/*16) Escreva um programa em Java que calcule e escreva a média aritmética dos números inteiros entre 15
(inclusive) e 100 (inclusive).*/
package Exercicio_16;

public class Exercicio_16 {
    public static void main(String[] args) {
        int valueBegin = 15;
        int valueEnd = 100;
        
        int sum=0;
        for (int i = valueBegin; i <= valueEnd; i++) {
            sum+=i;
        }
        
        System.out.println("Result => "+sum);
        
    }
}
