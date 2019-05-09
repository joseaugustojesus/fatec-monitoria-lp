/*Solicite ao usuário a quantidade de termos que ele deseja e imprima a sequência abaixo e a
soma dos termos.
* em cima sequência de Fibonacci e embaixo sequência de Primos.*/

class Exercicio_63{
	
	public static void main (String []args){
		
		java.util.Scanner leia = new java.util.Scanner (System.in);
		System.out.print("qtd termos => ");
		int n = leia.nextInt();
		
		int x1=0;
		int x2=1;
		int next=0;
		
		int fibbos [] = new int [n];
		int primos [] = new int [n];
		
		for(int i=0; i<n; i++){
			if(i==0){
				fibbos[0]=1;
			}else{
				next=x1+x2;
				x1=x2;
				x2=next;
				fibbos[i]=next;
			}
		}
		
		int qtd=0;
		
		
		for(int j = 1; qtd<n; j++){
						
			int primo=0;
			
			for(int i = 1; i <= j; i++){
				//System.out.println(i);
				primo = (j%i==0)? primo+1 : primo ;
			}
		
			if(primo==2){
				//System.out.println("=> "+j);
				primos[qtd]=j;
				qtd++;
			}
			
		}
		
		
		for(int i=0; i<n; i++){
			System.out.println(fibbos[i]+"/"+primos[i]);
		}
	
		
	}
}
