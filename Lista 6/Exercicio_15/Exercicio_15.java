package Exercicio_15;
/*15) O mesmo exercício anterior, mas agora, considere que o segundo valor lido poderá ser maior ou menor
que o primeiro valor lido, ou seja, deve-se testá-los.*/
public class Exercicio_15 {
    public static void main(String[] args) {
        java.util.Scanner js = new java.util.Scanner(System.in);
        
        
        System.out.print("n1 => ");
        int n1 = js.nextInt();
        
        System.out.print("n2 => ");
        int n2 = js.nextInt();
        
        int soma=0;
        if(n1<n2){
            for (int i = n1 ; i <= n2; i++) {
                soma+=i;
            }
        }else{
            for (int i = n2 ; i <= n1; i++) {
                soma+=i;
            }
        }
        
        System.out.println("total => "+soma);
        
    }
}
