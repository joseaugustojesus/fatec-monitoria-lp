/*Escreva um programa para gerar aleatoriamente uma String com 100 letras minúsculas.
Apresentar, caso haja:
- as letras do alfabeto que NÃO constam na sequência;
- a maior sequência de letras repetidas;
- a maior sequência de vogais; e
- a maior sequência alfabética.*/

//a=97 ... z=122
public class App_26 {

    public static void main(String[] args) {

        java.util.Random r = new java.util.Random();

        String $sequencia = "";

        //sorteando 100 caracteres de a ... z;
        for (int i = 0; i < 100; i++) {
            char $char = (char) (97 + (int) (Math.random() * (123 - 97)));
            $sequencia += $char;
        }


        //verificando se há todas as letras do alfabeto
        for (int i = 97; i < 123; i++) {
            char $char = (char) i;
            if ($sequencia.indexOf($char) == -1) {
                System.out.println("Não consta => " + $char);
            }
        }

        //maior sequência de repetições
        int quantidadeRepetidos = 1;
        int maior = 0;

        char anterior = $sequencia.charAt(0);
        for (char $char : $sequencia.toCharArray()) {
            System.out.println("=>" + anterior + " - " + $char);
            maior = (quantidadeRepetidos > maior) ? quantidadeRepetidos : maior;
            if ($char == anterior) {
                quantidadeRepetidos++;
            } else {
                quantidadeRepetidos = 1;
            }
            anterior = $char;
        }

        System.out.println(maior);

        //verificando vogais
        int quantidadeRepetidosVogais = 1;
        int maiorVogais = 0;
        char anteriorVogais = $sequencia.charAt(0);

        for (char $char : $sequencia.toCharArray()) {
            maiorVogais = (quantidadeRepetidosVogais > maiorVogais) ? quantidadeRepetidosVogais : maiorVogais;

            if (($char == anteriorVogais) && (($char == 'a') || ($char == 'e') || ($char == 'i') || ($char == 'o') || ($char == 'u'))) {
                quantidadeRepetidosVogais++;
            } else {
                quantidadeRepetidosVogais = 1;
            }
            anteriorVogais = $char;

        }

        System.out.println(maiorVogais);

        int quantidadeAlfabeticas = 1;
        int anteriorAlfabetico = (int) $sequencia.charAt(0);
        int maiorAlfabeticas = 0;
        
        for (char $char : $sequencia.toCharArray()) {
            int $ascii = (int)$char;
            maiorAlfabeticas = (quantidadeAlfabeticas > maiorAlfabeticas) ? quantidadeAlfabeticas : maiorAlfabeticas;
            if( anteriorAlfabetico == ($ascii-1) ){
                quantidadeAlfabeticas++;
            }else{
                quantidadeAlfabeticas=1;
            }
            anteriorAlfabetico = (int)$char;
        }
        
        System.out.println(quantidadeAlfabeticas);

    }

}
