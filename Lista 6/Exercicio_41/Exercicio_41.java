/*Solicite ao usuário um número e mostre o fatorial do número informado.*/
class Exercicio_41{
	
	public static void main (String []args){
		
		java.util.Scanner leia = new java.util.Scanner (System.in); 
		
		System.out.print("Nº => ");
		int n = leia.nextInt();
		
		int value=1; //não deve-se inicializar com 0, pois todo e qualquer número multiplicado por 0 irá retornar 0.
		
		for(int i = n; i>=1; i--){  //número em decremento, ex: 5-4-3-2-1
			System.out.println("[" + i + "]");
			value *= i; //ex:  5*4*3*2*1 = 120;
		}
		System.out.println("Result => "+value);
		
	}
	
}
