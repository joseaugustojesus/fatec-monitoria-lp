/*Escreva um programa que calcule e escreva a quantidade de letras maiúsculas de uma
frase fornecida pelo usuário.*/

public class App_10 {
    public static void main(String[] args) {
        
        //objeto de leitura
        java.util.Scanner leiaStr = new java.util.Scanner(System.in);
        
        //65-90 = letras maiúsculas
        
        System.out.print("frase => ");
        String _frase = leiaStr.nextLine();
        
        int qtd=0;
        for (char _char : _frase.toCharArray()) {
            
            for (int i = 65; i < 91; i++) {
                if(_char == (char)i){
                    qtd++;
                }
            }
            
        }
        System.out.println("quantidade de letras maiúsculas => "+qtd);
        
        
    }
    
}
