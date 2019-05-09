package Exercicio_05;

import java.util.Scanner;

/*5) Escreva um programa em Java para ler o ano atual e o ano de nascimento de uma pessoa.
Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário
considerar o mês em que a pessoa nasceu).*/
public class Exercicio_5 {
    public static void main(String[] args) {
      
        Scanner leia = new Scanner(System.in);
        
        System.out.print("ano atual => ");
        int anoAtual = leia.nextInt();
        
        System.out.print("ano nascimento => ");
        int anoNascimento = leia.nextInt();
        
        
        int idade = anoAtual-anoNascimento;
       
        System.out.println((idade<18)?"não vota!":"vota!");
        
        
    }
}
