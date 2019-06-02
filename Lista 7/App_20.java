/*Escreva um programa que receba uma frase, conte e imprima o número de palavras desta
frase.*/

public class App_20 {

    public static void main(String[] args) {
        java.util.Scanner leia = new java.util.Scanner(System.in);

        System.out.print("frase => ");
        String _frase = leia.nextLine().toLowerCase();

        //1º Forma (utilizando array) - essa forma é flaha, pois se houver 2 espaços seguidos, contará 1 palavra
        //String[] palavras = _frase.split(" ");
        //System.out.print(palavras.length);
        

        int backspace = 0;
        
        //2º forma
        for (int i = 0; i < _frase.length(); i++) {
            char _char = _frase.charAt(i);
            if ( (_char == ' ') && (i!=0) && (i!=_frase.length()-1) ) {
              if(_frase.charAt(i-1) != ' '){
                  backspace++;
              }
            }
        }
        
        System.out.println("quantidade de palavras => "+(backspace+1));

    }

}
