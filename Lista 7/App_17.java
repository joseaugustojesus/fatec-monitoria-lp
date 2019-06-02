
public class App_17 {

    public static void main(String[] args) {
        //objeto de leitura
        java.util.Scanner leia = new java.util.Scanner(System.in);

        System.out.print("frase[1] => ");
        String _frase1 = leia.nextLine().toLowerCase();
        System.out.print("frase[2] => ");
        String _frase2 = leia.nextLine().toLowerCase();

        //se as frases possuírem tamanhos diferentes, quer dizer que são diferentes
        if (_frase1.length() != _frase2.length()) {
            System.out.println("Não são iguais!");
        } else {
            boolean iguais = true; //será true enquanto os caracteres de ambas frases forem iguais
            
            //percorrendo cada letra de ambas as frases, pois tem o mesmo tamanho
            for (int i = 0; i < _frase1.length(); i++) {
                //System.out.println( "[" +_frase1.charAt(i) + "]" + " - " + "["+ _frase2.charAt(i) + "]" );
                if (_frase1.charAt(i) != _frase2.charAt(i)) { //verificando se position[frase1] é igual a position[frase2]
                    iguais = false; //se for diferente, são diferentes (as frases).
                    break;
                }
            }

            //se a var "iguais" for true, irá printar a primeira instrução, se não a segunda;
            System.out.println(
                    (iguais)
                            ? "As frases são iguais! \n frase 1 => " + _frase1 + "\n frase 2 => " + _frase2
                            : "As frases NÃO são iguais!\n frase 1 => " + _frase1 + "\n frase 2 => " + _frase2
            );

        }
    }

}
