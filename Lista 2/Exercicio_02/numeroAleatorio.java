package Exercicio_02;

public class numeroAleatorio {
    public static void main(String[] args) {
        //1 maneira
//        java.util.Random aleatorio = new java.util.Random();
//        double numeroAleatorio = aleatorio.nextInt(101);
//        System.out.println(numeroAleatorio);


        //2 maneira
        double numeroAleatorio = 0 + Math.random()*(100-0+1);
        System.out.println((int)numeroAleatorio);
    }
}
