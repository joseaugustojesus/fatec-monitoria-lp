package Exercicio_06;
/*6) Escreva um programa em Java para ler dois valores (considere que não serão lidos valores
iguais) e escrever o maior deles.*/
public class Exercicio_06 {
    public static void main(String[] args) {
       
        java.util.Scanner leia = new java.util.Scanner(System.in);
        
        System.out.print("x1 => ");
        int x1 = leia.nextInt();
        
        System.out.print("x2 => ");
        int x2 = leia.nextInt();
        
        
        if(x1==x2){
            System.out.println("Não é possível continuar! Os números devem ser diferentes.");
        }else{
            System.out.println((x1>x2)?"=> "+x1:"=> "+x2);
        }
        
    }
}
