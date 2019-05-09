package Exercicio__06;


public class ADivisivelPorB {
    public static void main(String[] args) {
      /*
        1. a não pode ser menos do que 0 e maior do que 1000
        2. a tem que ser maior ou igual ao divisor
        3. b não pode ser menor do que zero ou maior do que 20
        */
      
      java.util.Scanner leitor = new java.util.Scanner(System.in);
        System.out.println("Entre com os valores");
        System.out.print("valor A => ");
        int a = leitor.nextInt();
        System.out.print("valor B => ");
        int b = leitor.nextInt();
        
        System.out.println((a<0 || a>1000 || b<0 || b>20)?"erro":
                !(a>=b)?"erro 2":
                        (a%b==0)?"é divisível":"não é divisível");
    }
}
