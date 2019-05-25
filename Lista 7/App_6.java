/*6) Escreva um programa que calcule e escreva a quantidade de vezes que um
caractere fornecido pelo usuário aparece em uma frase, também, fornecida pelo
mesmo. Nota Importante: para a contagem, o caractere pode ser maiúsculo ou
minúsculo.*/


public class App_6 {

    public static void main(String[] args) {
        //objeto de leitura
        java.util.Scanner leiaStr = new java.util.Scanner(System.in); 
        
        
        System.out.print("Frase => ");
        String _phrase = leiaStr.nextLine();
        
        System.out.print("Caracter => ");
        char _character = leiaStr.next().charAt(0);
        
        
        int quantidadeCharacters = 0;
        for (int i = 0; i < _phrase.length(); i++) {
            if(_character == _phrase.charAt(i)){
                quantidadeCharacters++;
            }
        }
       
        System.out.println("Qtd Characters => "+quantidadeCharacters);
        
        
    }
}
