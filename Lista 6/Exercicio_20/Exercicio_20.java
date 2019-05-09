package Exercicio_20;

/*Escreva um programa em Java que leia 100 valores e no final, escreva o maior e o menor valor lido.*/
public class Exercicio_20 {
    public static void main(String[] args) {
        java.util.Scanner leia = new java.util.Scanner(System.in);
        
        int qtd = 5;
        int menor=9999999;
        int maior=9999999;
        int value;
        
        for (int i = 0; i < qtd; i++) {
            System.out.print("valor["+i+"] => ");
            value=leia.nextInt();
            
            if(i==0){
                menor=value;
                maior=value;
            }else{
                menor = (value<menor)?value:menor;
                maior = (value>maior)?value:maior;
            }
            
        }
        
        System.out.println("menor => "+menor);
        System.out.println("maior => "+maior);
    }
}
