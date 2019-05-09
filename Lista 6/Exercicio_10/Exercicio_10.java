package Exercicio_10;

public class Exercicio_10 {
    public static void main(String[] args) {
        java.util.Scanner js = new java.util.Scanner(System.in);
        
        int n = 3;
        double total=0;
        for (int i = 0; i <n; i++) {
            System.out.print("nota["+(i+1)+"] => ");
            total += js.nextDouble();
        }
        System.out.println(total/n);
        
        
    }
}
