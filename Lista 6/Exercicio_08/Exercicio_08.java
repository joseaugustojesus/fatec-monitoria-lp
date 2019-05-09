package Exercicio_08;

public class Exercicio_08 {
    public static void main(String[] args) {
        java.util.Scanner js = new java.util.Scanner(System.in);
        
        int qtd=0;
        for (int i = 0; i < 10; i++) {
            System.out.print("valor ["+(i+1)+"] => ");
            qtd = (js.nextInt()<0)?qtd+1:qtd;
        }
        
        System.out.println("total de negativos => "+qtd);
    }
}
