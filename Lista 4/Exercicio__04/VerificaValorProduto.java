package Exercicio__04;
/*4 - Crie um arquivo chamado VerificaValorProduto.java. Solicite ao usuário que digite os valores
para as variáveis precoProduto1 e precoProduto2. O programa deve testar o valor digitado pelo
usuário, para as duas variáveis e caso não estejam na faixa de 1 até 1000 (inclusos), exibir a
mensagem VALOR INVALIDO e finalizer o programa. Caso os valores digitados sejam válidos,
exibir a mensagem O produto 1 é o mais barato quando o preço do primeiro produto for menor.
Caso contrário, se o preço do segundo produto for menor, a mensagem O produto 2 é o mais barato
deve ser exibida. Caso contrário, a mensagem Os preços dos dois produtos são iguais é que deve ser
exibida.*/
public class VerificaValorProduto {
    public static void main (String []args){
        java.util.Scanner leitor = new java.util.Scanner(System.in);
        System.out.println("entre com os valores");
        System.out.print("valor 1 => ");
        int precoProduto1 = leitor.nextInt();
        System.out.print("valor 2 => ");
        int precoProduto2 = leitor.nextInt();
        
        System.out.println(
                (precoProduto1<1 || precoProduto1>1000 || precoProduto2<1 || precoProduto2>1000)?"Ops, valores inválidos":
                (precoProduto1>precoProduto2)?"Produto 2 é o mais barato":
                        (precoProduto1==precoProduto2)?"Os preços são iguais":
                                "O produto 1 é o mais barato");
        
        //System.out.println(precoProduto1+" - "+precoProduto2);
    }
}
