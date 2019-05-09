package Exercicio_11;

public class Exercicio_11 {
    
    public static void main(String[] args) {
        
        
        java.util.Scanner js = new java.util.Scanner(System.in);
        System.out.print("Quantos alunos há na classe?");
        int n = js.nextInt();
        double total=0;
        for (int i = 0; i <n; i++) {
            System.out.print("nota["+(i+1)+"] => ");
            total += js.nextDouble();
        }
        System.out.println(total/n);
        
        
    }
}
