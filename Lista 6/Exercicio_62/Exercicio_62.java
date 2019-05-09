/*Solicite ao usuário a quantidade de termos que ele deseja e imprima a sequência abaixo e a
soma dos termos.
2 + 4 + 6 + 8 + 10 + 12 + ...
1 	3 	5 	7 	9 	 11	+ ...	*/


class Exercicio_62{
	
	public static void main (String []args){
		
		java.util.Scanner leia = new java.util.Scanner(System.in); //obj de leitura
		
		System.out.print("qtd termos => ");
		int qtd = leia.nextInt();
		double soma=0;
		
		for(int i = 1; i<=qtd; i++){
			if(i==1){
				soma = (double)(i+1)/i;
			}else{
				soma -= (double) (i+1)/i;
			}
			
			System.out.println( (i+1) + "/" + i );
		}
		
		System.out.println("soma => "+soma);
		
	}
	
}

