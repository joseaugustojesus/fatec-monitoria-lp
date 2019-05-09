/*Imprima os números perfeitos na faixa de 1 a 900.*/

class Exercicio_56{
	
	public static void main (String[]args){
			
			System.out.println("---------");
			
			int soma=0;
			
			for(int i = 1; i<901; i++){
					
					soma=0;
					
					for(int j = 1; j < i; j++ ){
						if(i%j==0){
							soma+=j;
						}
					}
					
					if(soma==i){
						System.out.print(i+", ");
					}
					
			}
			
	}

}
