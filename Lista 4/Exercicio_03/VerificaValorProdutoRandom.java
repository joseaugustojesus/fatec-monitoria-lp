package Exercicio_03;

public class VerificaValorProdutoRandom {
    public static void main(String[] args) {
        java.util.Random gerador = new java.util.Random();
        int precoProduto1 = gerador.nextInt(4);
        int precoProduto2 = gerador.nextInt(4);
        System.out.println(precoProduto1+" - "+precoProduto2);
        System.out.println(
                (precoProduto1<precoProduto2)?"o Produto 1 é o mais barato":
                        (precoProduto1==precoProduto2)?"Preços iguais":"Produto 2 é o mais barato");
    }
}
