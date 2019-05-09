package Exercicio_12;

public class Exercicio_12 {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        
        System.out.print("Preço do produto => ");
        double preco = in.nextDouble();
        System.out.print("Código de Origem => ");
        int codigo = in.nextInt();
        
       
        System.out.println(
        (codigo==1)?"Origem => Norte \nPreço => R$"+preco+"\nPreço+frete => R$"+(preco+(preco*0.1)):
        (codigo==2 || codigo==5 || codigo==9)?
        "Origem => Sul \nPreço => R$"+preco+"\nPreço+frete => R$"+(preco+(preco*0.03)):
        (codigo==2 || codigo==5 || codigo==9)?
        "Origem => Sul \nPreço => R$"+preco+"\nPreço+frete => R$"+(preco+(preco*0.03)):
        (codigo==3 || (codigo>=10 && codigo<=15))?"Origem => Leste \nPreço => R$"+preco+"\nPreço+frete => R$"+(preco+(preco*0.012)):
        (codigo==7 || codigo==20)?"Origem => Oeste \nPreço => R$"+preco+"\nPreço+frete => R$"+(preco+(preco*0.073)):
        "Origem => Importado \nPreço => R$"+preco+"\nPreço+frete => R$"+(preco+(preco*0.222))
        );
        
        
        
    }
}
