/*Desenvolva um programa que leia uma String (que representa uma sequência de dígitos
0's e 1's) e que determine o tamanho da maior sequência consecutiva de números 1 existente
na String. No exemplo seguinte a maior cadeia consecutiva de números 1 tem tamanho 8
(oito).
001010100110110100001011101111111101101001011000*/


public class App_24 {
    public static void main(String[] args) {
        
        java.util.Scanner leia = new java.util.Scanner(System.in);
        
        System.out.println("insira a sequência de dígitos => ");
        String _sequencia = leia.nextLine();
        
        
        int quantidade = 0;
        int maior = 0;
        
        
        for ( char c : _sequencia.toCharArray() ) {
            if(c == '1'){
                quantidade++;
                if(quantidade>maior){
                    maior = quantidade;
                }
            }else{
                quantidade=0;
            }
        }
        
        System.out.println("maior quantidade => " + maior);
        
    }
}
