/*Escreva um programa para ler uma frase fornecida pelo usuário e contar a
quantidade de cada caractere do alfabeto, imprimindo ao final uma listagem onde
consta o caractere e na frente a quantidade de ocorrências. Caso a quantidade de
ocorrências de um caractere seja zero, não apresentar o caractere na listagem. Não
diferenciar maiúsculo de minúsculo.*/


public class App_8 {

    public static void main(String[] args) {
        //objeto de leitura
        java.util.Scanner leiaStr = new java.util.Scanner(System.in);
    
        System.out.print("frase => ");
        String _frase = leiaStr.nextLine().toLowerCase();
        
        //97=a 122=z;
        
        //passando pela letras do alfabeto de "a" até "z"
        for (int i = 97; i < 123; i++) {
            
            int qtd = 0; //reseta a cada letra/passagem
            
            for (char _char : _frase.toCharArray()) { //passando por cada letra da frase digitada
                
                if(_char == (char)i){ //verifica se a letra atual da frase é igual a letra atual do alfabeto
                    qtd++; 
                }
                
            }
            
            if(qtd>0){
                //result
                System.out.println( (char)i + " = " + qtd);
            }
        }
    }
}
