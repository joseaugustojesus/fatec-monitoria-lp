package Exercicio_11;
/*11) Desenvolva um programa em Java que receba dois valores numéricos e uma das opções
que representam uma das operações aritméticas (ler em String e testar como char): ‘+’ , ‘-‘, ‘*’
e ‘/’. Calcule e mostre a operação efetuada e o seu resultado. */
public class Exercicio_11 {
    public static void main(String[] args) {
        java.util.Scanner leitor = new java.util.Scanner(System.in);
        System.out.print("1º número => ");
        double numero1 = leitor.nextDouble();
        System.out.print("+ para somar | - para subtrair | "
                + "* para multiplicar | / para dividir | "
                + "% para descobrir o resto de uma divisão => escolha: ");
        char operacao = leitor.next().charAt(0);
        System.out.print("2º número => ");
        double numero2 = leitor.nextDouble();
        double resultado=0;
        if(operacao == '+'){
            resultado = numero1 + numero2;
        }else if(operacao == '-'){
            resultado = numero1 - numero2;
        }else if(operacao == '*'){
            resultado = numero1 * numero2;
        }else if(operacao == '/'){
            resultado = numero1 / numero2;
        }
        else if(operacao == '%'){
            resultado = numero1 % numero2;
        }
        else{
            System.out.println("Operação inválida");
        }
        
        System.out.println("Resultado da operação => "+resultado);
        
    }
}
