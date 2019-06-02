/*Elabore um programa para obter o nome completo de uma pessoa e a seguir forneça o
sobrenome do nome completo informado. Por exemplo, para o nome completo: Omero
Francisco Bertol, o programa deverá fornecer como resultado: Bertol.*/


public class App_23 {
    public static void main(String[] args) {
        java.util.Scanner leia = new java.util.Scanner(System.in);
        
        System.out.print("nome => ");
        String _nome = leia.nextLine();
        
        int backspace = 0;
        
        //contando quantas palavras tem
        for (int i = 0; i < _nome.length(); i++) {
            char _char = _nome.charAt(i);
            if ( (_char == ' ') && (i!=0) && (i!=_nome.length()-1) ) {
              if(_nome.charAt(i-1) != ' '){
                  backspace++;
              }
            }
        }
        
        
        String [] nomes = _nome.split(" ");
        int qtdNomes = backspace+1;
        if(qtdNomes>2){
            System.out.println("sobrenome => "+nomes[2]);
        }else{
            System.out.println("sobrenome => "+nomes[1]);
        }
        
        
        
    }
    
}
