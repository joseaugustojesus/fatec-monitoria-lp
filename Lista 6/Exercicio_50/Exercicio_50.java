/*Solicite ao usuário o termo inicial e a quantidade de termos da sequência de
números primos e imprima o resultado.*/


class Exercicio_50{
	
	public static void main (String []args){
		
		java.util.Scanner leia = new java.util.Scanner(System.in);
		System.out.print("qtd => ");
		int n = leia.nextInt();
		System.out.print("inicio => ");
		int inicio = leia.nextInt();
		int qtd=1;
		
		System.out.println("Nº PRIMOS");
		for(int j = 1; qtd<=n; j++){
						
			int primo=0;
			
			for(int i = inicio; i <= j; i++){
				//System.out.println(i);
				primo = (j%i==0)? primo+1 : primo ;
			}
		
			if(primo==2){
				System.out.println("=> "+j);
				qtd++;
			}
			
		}
		
		
		
		
	}

}

