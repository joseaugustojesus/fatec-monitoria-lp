/*Solicite ao usuário a quantidade de termos da sequência de fatoriais e
imprima o resultado.*/


class Exercicio_44{
	
	public static void main (String []args){
		
		
		java.util.Scanner leia = new java.util.Scanner (System.in);
		System.out.print("value => ");
		int quantidade = leia.nextInt();
		for(int i = 1; i<=quantidade; i++){
					
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
