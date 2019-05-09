package Exercicio_05;

public class Exercicio_05 {
    public static void main(String[] args) {
        java.util.Scanner js = new java.util.Scanner(System.in);
        int n = 0;
        
        do{
            System.out.print("insira o valor para n=> ");
            n = js.nextInt();
        }while(!(n>0));
        
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        
    }
}
