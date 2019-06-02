/*Escreva um programa para ler uma frase e um caractere. Sempre que o caractere lido
aparecer na frase ele deve ser substituído por asterisco. Por exemplo, se os valores fornecidos
fossem para a frase: o dia esta nublado, e para o caractere: a, o programa deverá fornecer o
seguinte resultado: o di* est* nubl*do.*/

public class App_14 {

    public static void main(String[] args) {

        //objeto de leitura
        java.util.Scanner leia = new java.util.Scanner(System.in);

        System.out.print("frase => ");
        String _frase = leia.nextLine().toLowerCase();
        String _novaFrase = "";

        //percorrendo todas as letras do input
        for (int i = 0; i < _frase.length(); i++) {
            //System.out.println(_frase.charAt(i));
            _novaFrase += (_frase.charAt(i) == 'a') ? '*' : _frase.charAt(i);
            

            //ou pode fazer utilizando um método específico (replaceAll) pra substituição
            //_frase = _frase.replaceAll("a", "*"); //parâmetros = valor encontrado no texto pelo caracter de substituição
        }
        

        System.out.println("Frase      => "+_frase);
        System.out.println("Nova frase => "+_novaFrase);
    }
}
