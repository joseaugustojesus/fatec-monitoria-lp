/*Solicite ao usuário a quantidade de termos da sequência de Fibonacci e imprima
o resultado*/
class Exercicio_51{
	
	public static void main (String []args){
		
		
		java.util.Scanner leia = new java.util.Scanner (System.in); 
		
		System.out.print("qtd => ");
		int qtd = leia.nextInt();
		
		
		int x1=0;
		int x2=1;
		int next=0;
		
		
		System.out.println("[1] => "+0);
		for(int i = 1; i<qtd; i++){
			next = x1+x2;
			x1 = x2;
			x2 = next;
			System.out.println("["+(i+1)+"] => "+next);
		}
		
		
	}

}
