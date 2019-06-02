/*Escreva um programa que conta e exibe a quantidade de vezes que cada vogal ocorre em
uma frase fornecida pelo usuário.*/

public class App_12 {

    public static void main(String[] args) {
        //objeto de leitura
        java.util.Scanner leia = new java.util.Scanner(System.in);

        //97 - 101 - 105 - 111 - 117
        //A  -  E  -  I  -  O  -  U
        //input
        System.out.print("frase => ");
        String _frase = leia.nextLine().toLowerCase();

        for (int i = 97; i <= 117; i++) { //percorrer vogais

            int qtd = 0; //deve-se zerar a cada iteração das vogais

            for (char _char : _frase.toCharArray()) { //percorrer cada letra do input
                if (_char == (char) i) {
                    qtd++;
                }
            }
            System.out.println((char) i + " = " + qtd);

            if (i <= 101) {
                i += 3;
            } else {
                i += 5;
            }

        }

    }
}
