package Exercicio_14;
/*14) Escreva um programa em Java para ler 2 valores, calcular e escrever a soma dos inteiros existentes
entre os 2 valores lidos (incluindo os valores lidos na soma). Considere que o segundo valor lido será
sempre maior que o primeiro valor lido.*/
public class Exercicio_14 {
    public static void main(String[] args) {
        java.util.Scanner js = new java.util.Scanner(System.in);
        
        System.out.print("n1 =>");
        int n1 = js.nextInt();
        System.out.print("n2 =>");
        int n2 = js.nextInt();
        
        int soma=0;
        for (int i = n1; i<=n2; i++) {
            soma+=i;
        }
        
        System.out.println(soma);
    }
}
