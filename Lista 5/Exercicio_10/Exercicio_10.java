package Exercicio_10;

/*10) 
1. Escreva um programa em Java para ler o salário fixo e o valor das vendas efetuadas pelo
vendedor de uma empresa. 

2. Sabendo-se que ele recebe uma comissão de 3% sobre o total das
vendas até R$ 1.500,00

mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu
salário total.*/

public class Exercicio_10 {
    public static void main(String[] args) {
        
        java.util.Scanner leitor = new java.util.Scanner(System.in);
        
        System.out.print("Salário fixo => ");
        double salario = leitor.nextDouble();
        
        System.out.print("Valor das vendas => ");
        double valorVendas = leitor.nextDouble();
        
        
        if(valorVendas>1500){
            double excesso = valorVendas - 1500;
            double comissao3 = 1500*0.03;
            double comissaoExcesso = excesso*0.05;
            salario +=comissao3+comissaoExcesso;
            System.out.println("Salário final => "+salario);
        }else{
            double comissao3 = valorVendas * 0.03;
            System.out.println("Salário final => "+(salario+comissao3));
        }
        
        
        //System.out.println(salario+" - "+valorVendas);
        
    }
}
