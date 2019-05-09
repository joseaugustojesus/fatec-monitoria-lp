package Exercicio_07;
/* Escreva um programa em Java para ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever
a tabuada de 1 a 10 do valor lido.*/
public class Exercicio_07 {
    public static void main(String[] args) {
        java.util.Scanner js = new java.util.Scanner(System.in);
        System.out.print("Valor para N => ");
        int n = js.nextInt();
        
        for (int i = 1; i < 11; i++) {
            System.out.println(i+" x "+n+" = "+n*i);
        }
        
    }
}
