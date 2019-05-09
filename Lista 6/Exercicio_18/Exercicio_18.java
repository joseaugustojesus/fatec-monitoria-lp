package Exercicio_18;
/*Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um programa em
Java que permita a entrada das seguintes informações: a) o número total de mercadorias no estoque; b) o
valor de cada mercadoria. Ao final imprimir o valor total em estoque e a média de valor das mercadorias.*/
public class Exercicio_18 {
    public static void main(String[] args) {
        java.util.Scanner leia = new java.util.Scanner(System.in); //para ler números
        java.util.Scanner leiaStr = new java.util.Scanner(System.in); //pra ler textos
        
        
        System.out.print("Quantidade de mercadoria => ");
        int mercadoria = leia.nextInt();
        float sum=0;
        
        for (int i = 1; i <= mercadoria; i++) {
            System.out.print("valor da mercadoria ["+i+"] =>");
            sum += leia.nextFloat();
        }
        System.out.println("======================");
        System.out.println("Total =>    " + sum);
        System.out.println("Média =>    " + (sum/mercadoria));
        
    }
}
