/*Solicite ao usuário os dois primeiros termos da sequência de Ricci e depois
solicite a quantidade de termos que ele deseja gerar. Imprimir o resultado.*/



class Exercicio_59{
	
	public static void main (String []args){
		
			java.util.Scanner leia = new java.util.Scanner(System.in);
			
			System.out.print("[1º]Termo Inicial => ");
			int x1 = leia.nextInt();
			
			System.out.print("[2º]Termo Inicial => ");
			int x2 = leia.nextInt();
			
			System.out.print("qtd de termos desejados => ");
			int qtdTermos = leia.nextInt();
			int next=0;
			
			int qtd=0;
			
			for(int  i = 1; qtd<qtdTermos; i++){
				
				next=x1+x2;
				x1=x2;
				x2=next;
				System.out.print(next+" => ");
				qtd++;
			}
			
	
	}

}
