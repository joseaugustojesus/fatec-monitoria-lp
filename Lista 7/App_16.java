/*Escreva um programa que informe se todos os caracteres alfabéticos de uma frase
fornecida pelo usuário são maiúsculos.*/

public class App_16 {

    public static void main(String[] args) {

        //objeto de leitura
        java.util.Scanner leia = new java.util.Scanner(System.in);

        //65-90
        System.out.print("frase => ");
        String _input = leia.nextLine();
        String _frase = _input.replace(" ", ""); //juntando todas as letras para que o espaço não interfira
        int quantidade = 0;

        //percorrendo cada letra da frase
        for (char x : _frase.toCharArray()) {
            
            for (int i = 65; i < 91; i++) { //percorrendo todas as letras maiúsculas
                if (x == (char) i) {
                    quantidade++;
                }
            }

        }

        //se a quantidade de caracteres contados como maiúsculo forem iguais a soma de todos os caracteres da frase, quer dizer que é tudo maiúsculo
        System.out.println( ( quantidade == _frase.length() ) ? "Todas as letras são maiúsculas" : "Não é tudo maiúsculo" );

    }
}
