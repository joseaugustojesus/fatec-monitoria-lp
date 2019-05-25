/*5) Escreva um programa que calcule e escreva a quantidade de vezes que o
caractere ‘a’ aparece em uma frase fornecida pelo usuário. Nota Importante: para a
contagem, o caractere pode ser maiúsculo ou minúsculo.*/
class App_5 {

    public static void main(String[] args) {

        //objeto de leitura
        java.util.Scanner leiaStr = new java.util.Scanner(System.in); 

        //lendo frase do usuário
        System.out.print("Insira uma frase => ");
        String _frase = leiaStr.nextLine();

        //contador
        int quantidadeA = 0;
        
        //passando por cada letra da frase
        for (char c : _frase.toLowerCase().toCharArray() ) {
            if(c == (char)97){
                //System.out.println("=> "+c);
                quantidadeA++;
            }
        }
        
        System.out.println("Total de A => "+quantidadeA);

    }

}
