/*Desenvolva um programa que leia uma cadeia de caracteres e através de uma mensagem
indique se esta cadeia representa uma sequência binária de 8 bit’s ou não.
Ex:
- não é uma sequência de 8bit’s: 01101, 10192898, 10001jaA
- é uma sequência de 8bit’s: 01101011, 10110101, 10000000*/


public class App_18 {
    public static void main(String[] args) {
        //objeto de leitura
        java.util.Scanner leia = new java.util.Scanner(System.in);
        
        System.out.print("Frase => ");
        String _input = leia.nextLine();
        
        //System.out.println(_input.length());
        if(_input.length()!=8){
            System.out.println("não é uma sequência binária de 8 bits");
        }else{ //verificar se todos os elementos são 0 e 1
            boolean ok=true;
            for ( char _char : _input.toCharArray() ) {
                
                if( (_char != '0') && (_char != '1') ){
                    ok=false;
                    break;
                }
                
            }
            System.out.println( (ok)?"sequência binária de 8 bits":"Não é uma sequência binária de 8 bits" );
            
        }
        
        
    }
}
