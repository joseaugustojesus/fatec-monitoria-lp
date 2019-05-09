package Exercicio_01;
/*
    1 - Crie um arquivo chamado AprovadoReprovadoRandom.java. Gere um número aleatório com
valores entre 0 e 10 (inclusos) e atribua a variável nota. O programa deve exibir a mensagem
REPROVADO quando a nota do aluno for menor do que 6 ou APROVADO caso contrário. 
*/
public class AprovadoReprovadoRandom {
    public static void main(String[] args) {
        java.util.Random gerador = new java.util.Random();
        int nota = gerador.nextInt(11);
        System.out.println((nota<6)?"reprovado com a nota: "+nota:"aprovado com a nota: "+nota);
    }
}
