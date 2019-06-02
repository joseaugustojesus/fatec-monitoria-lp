/*Escreva um programa que leia uma cadeia de caracteres qualquer é determine se a
palavra lida representa um palíndromo ou não (exemplo de palavras palíndromas: ovo, natan,
sos, arara, etc).*/


public class App_19 {
    public static void main(String[] args) {
        java.util.Scanner leiaStr = new java.util.Scanner (System.in);
        
        
        System.out.print("Frase => ");
        String _frase = leiaStr.nextLine().toLowerCase();
        
        //1º forma
        StringBuilder sb = new StringBuilder(_frase);
        System.out.println( "1º forma => " + sb.reverse().toString());
        
        //2º forma
        String _reverse = "";
        for (int i = _frase.length()-1; i>=0 ; i--) {
            _reverse += _frase.charAt(i);
        }
        System.out.println( "2º forma => " + _reverse);
        
        //comparando se a frase invertida é igual a frase normal
        //utilizando a segunda forma
        System.out.println( (_reverse.equals(_frase))?"palíndromas":"NÃO palíndromas" );
        
        
    }
}
