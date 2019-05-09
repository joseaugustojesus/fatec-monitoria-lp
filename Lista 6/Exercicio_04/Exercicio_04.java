package Exercicio_04;

/*4) Escreva um programa em Java para ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive)
e N (inclusive). Considere que o N será sempre maior que ZERO.*/
public class Exercicio_04 {
    public static void main(String[] args) {
        java.util.Scanner js = new java.util.Scanner(System.in);
        
        System.out.print("valor para N => ");
        int n = js.nextInt();
        
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
}
