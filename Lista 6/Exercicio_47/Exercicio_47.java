
/*Imprima somente os números primos existentes na faixa de um 1 até 100.*/


class Exercicio_47{
	
	public static void main (String []args){
		
		System.out.println("Nº PRIMOS");
		for(int j = 1; j<101; j++){
						
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
