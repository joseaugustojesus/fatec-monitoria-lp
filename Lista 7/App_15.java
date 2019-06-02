/*Escreva um programa que informe se em uma frase fornecida pelo usuário existem
caracteres numéricos.*/

public class App_15 {

    public static void main(String[] args) {

        
        //objeto de leitura
        java.util.Scanner leia = new java.util.Scanner(System.in);
        
        System.out.print("frase => ");
        String _input = leia.nextLine().toLowerCase();
        //48-57
        
        boolean existe = false;
        
        
        for ( char _char : _input.toCharArray() ) {
            
            for (int i = 48; i <= 57; i++) {
                char __char = (char)i;
                if(_char == __char){
                    existe = true;
                }
            }
            
        }
        
        System.out.println( (existe)?"Existe!":"Não existe!" );
        

    }
}
