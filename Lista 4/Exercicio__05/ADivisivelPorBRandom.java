
package Exercicio__05;



/*5 - Crie um arquivo chamado ADivisivelPorBRandom.java. Implemente um programa em Java que
guarde dois valores numéricos inteiros: a e b, gerados aleatoriamente, sendo a de 0 até 1000
(inclusos) e b de 0 a 20 (inclusos). Exiba na saída padrão a mensagem É divisível quando a for
divisível por b ou a mensagem Não é divisível, caso contrário.*/
public class ADivisivelPorBRandom {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        int a = random.nextInt(1001);
        int b = random.nextInt(21);
        System.out.println(a+" - "+b);
        System.out.println((a%b==0)?"É divisível":"Não é divisível");
    }
}
