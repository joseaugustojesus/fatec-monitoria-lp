package Exercicio_17;
/*Escreva um programa em Java para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a
média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota.
Ao final da execução a mensagem 'NOVO CÁLCULO (S/N)?' deve ser apresentada. Se for respondido 'S' deve
retornar e executar um novo cálculo, caso contrário deverá encerrar o programa.*/
public class Exercicio_17 {
    public static void main(String[] args) {
        
        java.util.Scanner leia = new java.util.Scanner(System.in); //obj leitura
        
        char opcao; //utilizado na condicional do dowhile;
        
        
        do {            
            
            System.out.print("nota 1 => ");
            int nota1 = leia.nextInt();
            System.out.print("nota 2 => ");
            int nota2 = leia.nextInt();
            
            
            System.out.println("===========");
            System.out.print("Deseja continuar? (s/n)");
            opcao = leia.next().toLowerCase().charAt(0); 
            //lendo string, formatando para minúsculo e depois pegando o primeiro caracter digitado
            
        } while (opcao=='s'); //irá repetir as instruções acima até que o valor de opco seja diferente de s.
        
        
    }
}
