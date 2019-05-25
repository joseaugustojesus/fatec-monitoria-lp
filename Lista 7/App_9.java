/*Fazer um programa para contar quantos espaços em branco existem em uma frase
fornecida pelo usuário.*/
public class App_9 {

    public static void main(String[] args) {
        java.util.Scanner leiaStr = new java.util.Scanner(System.in);

        System.out.print("frase => ");
        String _frase = leiaStr.nextLine();

        char _character = (char) 32;

        int qtd = 0;
        for (char _char : _frase.toCharArray()) {
            if (_char == _character) {
                qtd++;
            }
        }
        
        System.out.println("qtd de espaços => "+qtd);

    }
}
