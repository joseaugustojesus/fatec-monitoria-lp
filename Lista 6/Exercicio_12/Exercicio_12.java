package Exercicio_12;

public class Exercicio_12 {
    public static void main(String[] args) {
        java.util.Scanner js = new java.util.Scanner(System.in);
        
        
        int n = 5;
        int soma=0;
        for (int i = 0; i<5; i++) {
            System.out.print("Valor => ");
            soma += js.nextInt();
        }
        
        System.out.println(soma);
        
    }
}
