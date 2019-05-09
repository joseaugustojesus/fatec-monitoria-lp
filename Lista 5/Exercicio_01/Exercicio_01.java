package Exercicio_01;
/*Escreva um programa em Java para ler um valor e escrever a mensagem “É MAIOR QUE
10!” se o valor lido for maior que 10, caso contrário escrever “NÃO É MAIOR QUE 10!”.*/
    
public class Exercicio_01 {
    public static void main(String[] args) {    
        java.util.Scanner leitor = new java.util.Scanner(System.in);
        System.out.print("Insira um valor => ");
        System.out.println((leitor.nextInt()<10)?"menor do que 10":"maior ou igual a 10");
    }
}
