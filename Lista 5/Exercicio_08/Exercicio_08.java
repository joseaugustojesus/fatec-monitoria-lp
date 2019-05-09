package Exercicio_08;

/*8) Escreva um programa em Java para ler a hora de início e a hora de fim de um jogo de
Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em
horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode
iniciar em um dia e terminar no dia seguinte.*/

public class Exercicio_08 {
    public static void main(String[] args) {
        
        java.util.Scanner leia = new java.util.Scanner(System.in);
        
        
        System.out.print("Hora Inicial => ");
        int inicio = leia.nextInt();
        System.out.print("Hora Final => ");
        int fim = leia.nextInt();
        
        int resultado=0;
        
        if(inicio==fim){
            System.out.println("O jogo durou 24 horas");
        }else{
            if(inicio>fim){ // 22 - 9 
                resultado = (fim)+(24-inicio);
                System.out.println("Resultado => "+resultado);
            }else{
                resultado = fim-inicio;
                System.out.println("Resultado => "+resultado);
            }
        }
        
    }
}
