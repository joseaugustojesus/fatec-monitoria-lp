package Exercicio_04;

/*
1. entrar com duas notas
2. somar e tirar média
3. verificar se média é menor q 6, se sim, exibir reprovado e a nota
4. verificar se média é maior ou igual a 6, se sim, exibir aprovado e a nota
*/

public class Exercicio_04 {
    public static void main(String[] args) {
       java.util.Scanner leia = new java.util.Scanner(System.in);
        
        System.out.print("n1 => ");
        float n1 = leia.nextInt();
        System.out.print("n2 => ");
        float n2 = leia.nextInt();
        System.out.println("=========");
        float media = (n1+n2)/2;
       
        
        if(media<6){
             System.out.println("reprovado com a média => "+media);
        }else{
             System.out.println("aprovado com a média => "+media);
        }
        
       
    }
}
