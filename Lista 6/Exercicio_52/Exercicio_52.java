/*Solicite um número inteiro ao usuário e informe se ele pertence a sequência
de Fibonacci ou não.*/
class Exercicio_52{
	
	public static void main (String []args){
		
			java.util.Scanner leia = new java.util.Scanner(System.in);
			
			System.out.print("nº => ");
			int n = leia.nextInt();
			
			
			int x1=0;
			int x2=1;
			int next=0;
			boolean isFibbo=false;
			
			for(int i=0; i < 45; i++){ //45 vezes é a quantidade que o espaço da variável do tipo int aguentará antes de estourar.
				
				next=x1+x2;
				x1=x2;
				x2=next;
				
				System.out.print(n+" - ");
				System.out.println(next);
				
				if(n==next || n==0){
					isFibbo=true;
				}
					
			}
			
			System.out.println(isFibbo?"Faz parte":"Não faz parte");
			
			
			
	}
}
