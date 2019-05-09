package Exercicio_09;

public class Exercicio_09 {
    public static void main(String[] args) {
        java.util.Scanner js = new java.util.Scanner(System.in);
        
        int qtdIntervalo=0;
        int valor, n=10;
        
        for (int i = 0; i <10; i++) {
            System.out.print("n"+(i+1)+" =>");
            valor = js.nextInt();
            qtdIntervalo = (valor>=10 && valor<=20)?qtdIntervalo+1:qtdIntervalo;
        }
        
        System.out.println("total no intervalo => "+qtdIntervalo);
        System.out.println("total fora do intervalo => "+(n-qtdIntervalo));
        
    }
}
