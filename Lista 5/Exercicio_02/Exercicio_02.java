/*2) Escreva um programa em Java para ler um valor e escrever se é positivo ou negativo
(considere o valor zero como positivo).*/
package Exercicio_02;


public class Exercicio_02 {
    public static void main(String[] args) {
        java.util.Scanner leitor = new java.util.Scanner(System.in);
        System.out.print("Entre com um valor => ");
        System.out.println((leitor.nextInt()<0)?"é negativo":"é positivo");
    }
}
