package Exercicio_03;
/*3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se
forem compradas pelo menos 12. Escreva um programa em Java que leia o número de maçãs
compradas, calcule e escreva o custo total da compra..*/

public class Exercicio_03 {
    public static void main(String[] args) {
        java.util.Scanner leitor = new java.util.Scanner(System.in);
        System.out.print("insira a quantidade => ");
        int quantidade = leitor.nextInt();
        
        System.out.println((quantidade<12)?"total => R$"+quantidade*1.30:"Total => R$"+quantidade);
        
//        if(quantidade<12){
//            System.out.println("Total => R$"+quantidade*1.30);
//        }else{
//            System.out.println("Total => R$"+quantidade);
//        }
    }
}
