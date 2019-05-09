package Exercicio_13;
public class Exercicio_13 {
    public static void main(String[] args) {
        java.util.Scanner js = new java.util.Scanner(System.in);
        
        int n = 10;
        int soma = 0;
        int valor;
        for (int i = 0; i < n; i++) {
            System.out.print("valor => ");
            valor = js.nextInt();
            soma = (valor<40)?soma+valor:soma;
        }
        System.out.println(soma);
        
    }
}
