/*Escreva um programa que imprima o número de consoantes de uma frase fornecida pelo
usuário.*/

public class App_13 {

    public static void main(String[] args) {
        //objeto de leitura
        java.util.Scanner leia = new java.util.Scanner(System.in);

        //input
        System.out.print("frase => ");
        String _frase = leia.nextLine().toLowerCase();
        
        
        int quantidade = 0;
        
        //passando por cada letra do input
        for (char x : _frase.toCharArray()) {
            if ((x != 'a') && (x != 'e') && (x != 'i') && (x != 'o') && (x != 'u')) { //se for diferente das consoantes
                quantidade++;
            }
        }

        System.out.println("total de consoantes => " + quantidade);

    }

}
