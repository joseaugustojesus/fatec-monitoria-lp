package Exercicio_19;
/*O mesmo exercício anterior, mas agora não será informado o número de mercadorias em estoque.
Então o funcionamento deverá ser da seguinte forma: ler o valor da mercadoria e perguntar ‘MAIS
MERCADORIAS (S/N)?’. Ao final, imprimir o valor total em estoque e a média de valor das mercadorias em
estoque.*/
public class Exercicio_19 {
    public static void main(String[] args) {
        java.util.Scanner leia = new java.util.Scanner(System.in);      //para ler números
        java.util.Scanner leiaStr = new java.util.Scanner(System.in);   //para ler textos
        
        char opcao;
        int qtd=0;
        float sum=0;
        
        do {            
            System.out.print("Mercadoria["+qtd+"] =>    ");
            sum+= leia.nextFloat();
            qtd++;
            System.out.println("============");
            System.out.print("continuar? (S)");
            opcao = leiaStr.next().toUpperCase().charAt(0);
            
        } while (opcao=='S');
        
        
        System.out.println("total =>    "+sum);
        System.out.println("média =>    "+(sum/qtd));
    }
}
