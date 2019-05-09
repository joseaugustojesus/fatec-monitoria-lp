package Exercicio_07;

/*
ler dois valores
escrevê-los em ordem crescente
*/
public class Exercicio_07 {
    public static void main(String[] args) {
        
        
        java.util.Scanner leia = new java.util.Scanner(System.in);
        
        System.out.print("x1 => ");
        int x1 = leia.nextInt();
        System.out.print("x2 => ");
        int x2 = leia.nextInt();
        System.out.println("============");
        
        System.out.println((x1>x2)?"ordem crescente => "+x2+", "+x1:"ordem crescente => "+x1+", "+x2);
        
        if(x1>x2){
            System.out.println("=> "+x2+", "+x1);
        }else{
            System.out.println("=> "+x1+", "+x2);
        }
        
    }
}
