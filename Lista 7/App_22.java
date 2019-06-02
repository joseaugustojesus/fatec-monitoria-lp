/*Dados uma frase e uma palavra, escreva um programa que verifique o número de vezes
que a palavra ocorre na frase. Exemplo: Na frase ANA E MARIANA GOSTAM DE BANANA, a
palavra ANA ocorre 4 vezes.*/

public class App_22 {
    public static void main(String[] args) {
        java.util.Scanner leia = new java.util.Scanner(System.in);
        
        System.out.print("frase => ");
        String _frase = leia.nextLine().toLowerCase();
        
        
        System.out.print("palavra => ");
        String _palavra = leia.nextLine().toLowerCase();
        
        
        String []ocorrencias = _frase.split(_palavra);
        System.out.println(ocorrencias.length);
        
        
       
        
        
    }
    
}
