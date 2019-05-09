/* Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
positivo imprimir a sequência de termos: 1/50 + 2/49, 3/48 + ... + 50/1. Exemplo com entrada de 50
termos. Apresentar a soma desta sequência no final.*/

class Exercicio_39{
	
	public static void main (String []args){
		
		java.util.Scanner leia = new java.util.Scanner (System.in);
		
		
		int termos=0;
		int value=0;
		
		do{
			System.out.print("Termos => ");
			termos = leia.nextInt();
			
			if( (termos!=0) && (termos>0) ){
				
				for (int i = 1; i <= termos; i++){
					
					System.out.println(i + " / " + (termos-(i-1)));
					value += i / ((termos)-(i-1)) ;
				}
				
			}
			
		}while(termos<0);
	
	
		System.out.println("Total => "+value);
	}
	
}
