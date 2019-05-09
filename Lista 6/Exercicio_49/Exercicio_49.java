
/*Solicite ao usuário a quantidade de termos da sequência de números primos
e imprima a sequência do final para o início.*/



class Exercicio_49{
	
	public static void main (String []args){
		
		java.util.Scanner leia = new java.util.Scanner(System.in);
		System.out.print("qtd => ");
		int n = leia.nextInt();
		
		System.out.println("Nº PRIMOS");
		for(int j = n; j>=1; j--){
						
			int primo=0;
			
			for(int i = 1; i <= j; i++){
				//System.out.println(i);
				primo = (j%i==0)? primo+1 : primo ;
			}
		
			if(primo==2){
				System.out.println("=> "+j);
			}
			
		}
		
	}

}
