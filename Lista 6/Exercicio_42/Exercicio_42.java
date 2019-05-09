/*Construa um programa para mostrar o fatorial dos números inteiros na
faixa de 1 a 10.*/
class Exercicio_42{
	
	public static void main (String []args){
		
	
		for(int i = 1; i<11; i++){
					
			int value=1; //não deve-se inicializar com 0, pois todo e qualquer número multiplicado por 0 irá retornar 0.
			
			System.out.print("[" + i + "] \t");
			
			for(int j = i; j>=1; j--){  //número em decremento, ex: 5-4-3-2-1
				System.out.print("[" + j + "]*");
				value *= j; //ex:  5*4*3*2*1 = 120;
			}
			
			System.out.println("Result => "+value);
		}
		
		
		
	}
	
}
