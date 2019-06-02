/*Escreva um programa que receba uma frase, imprima cada palavras desta frase em uma
linha.*/

public class App_21 {

    public static void main(String[] args) {
        java.util.Scanner leia = new java.util.Scanner(System.in);

        System.out.print("frase => ");
        String _frase = leia.nextLine();
        String palavras [] = _frase.split(" ");
        
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

  

    }
}
