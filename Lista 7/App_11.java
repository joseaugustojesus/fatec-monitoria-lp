/*Escreva um programa que conte e exiba, separadamente, a quantidade de caracteres
alfabéticos e de dígitos numéricos existentes em uma frase fornecida pelo usuário.*/
public class App_11 {

    public static void main(String[] args) {

        //objeto de leitura
        java.util.Scanner leia = new java.util.Scanner(System.in);

        //lembrete
        //97-122 = 'a' até 'z'
        //48-57 = 0 até 9
        
        //inserir frase
        System.out.print("frase => ");
        String _frase = leia.nextLine().toLowerCase();

        boolean ok = true; //decisão de quais caracteres serão verificados = inicializado em números de 0 até 9
        

        for (int i = ((ok) ? 48 : 97); i <= ((ok) ? 57 : 122); i++) {
            int qtd = 0;
            //System.out.println(i + "" + ok + "" + (char) i);

            char _ascii = (char) i; //armazena caracter atual da tabela ascii de acordo com o índice
            
            for (char _char : _frase.toCharArray()) { //passando por cada uma dos caracteres digitado pelo usuário
                if (_char == _ascii) { //compara se cada uma das letras do input são compatíveis com o caracter da tabela ascii
                    qtd++;
                }
            }

            if (qtd > 0) { //só printa se houver uma ocorrêcia do caracter na frase inserida
                System.out.println((char) i + " = " + qtd);
            }
           
            if(i==57){ //se todos os números já foram verificados, é hora de verificar as letras
                ok = false;
            }
            
        }

    }
}
