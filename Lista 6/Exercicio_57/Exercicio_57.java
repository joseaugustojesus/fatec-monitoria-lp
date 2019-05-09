/*Solicite ao usuário a quantidade de termos da sequência de números perfeitos e
imprima o resultado. (Atenção! Este processamento pode demorar MUITO)*/


class Exercicio_57{
	
	public static void main (String[]args){
		
		java.util.Scanner leia = new java.util.Scanner(System.in);
		System.out.print("qtd => ");
		int qtd = leia.nextInt();
		int qtdPerfeitos=0;
		int soma=0;
		
		
		for(int i=1; qtdPerfeitos<qtd; i++){
			soma=0;
			for(int j =1; j<i; j++){
				if(i%j==0){
					soma+=j;
				}
			}
			
			if(soma==i){
				qtdPerfeitos++;
				System.out.println("perfeito => "+i);
			}
			if(qtdPerfeitos==qtd){
				break;
			}
			
		}
		
		System.out.println("fim");
		
	
	}
	
}
