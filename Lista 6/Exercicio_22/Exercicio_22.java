class Exercicio_22{
	public static void main (String []args){
		
		/*	
		 * Escreva um programa em Java para ler o código e o preço de 15 produtos, calcular e escrever:
		 * - o maior preço lido;
		 * - a média aritmética dos preços dos produtos
		 */
		 
		java.util.Scanner leia = new java.util.Scanner(System.in);
		java.util.Scanner leiaStr = new java.util.Scanner(System.in);
		 
		float maior=0;
		int pro_qtd=3; 
		float soma=0;
		for(int i=0;i<pro_qtd;i++){
			
			System.out.print("Código do produto\t["+(i+1)+"] => ");
			int pro_codigo = leia.nextInt();
			
			System.out.print("Preço do produto \t["+(i+1)+"] => ");
			float pro_preco = leia.nextFloat();
			soma+=pro_preco;
			/*caso seja o primeiro valor a ser digitado, ele será o maior para criar uma base
			 * se não, ele vai comparar o preço digitado já com o preço armazenado*/
			maior = (i==0)?pro_preco:(pro_preco>maior)?pro_preco:maior;
			
			System.out.println(""); //para pular linha entre as leituras apenas
		}
		
		System.out.println("maior valor => "+maior);
		System.out.println("Soma  => "+soma);
		System.out.println("Média  => "+(soma/pro_qtd));
		
	}
}
