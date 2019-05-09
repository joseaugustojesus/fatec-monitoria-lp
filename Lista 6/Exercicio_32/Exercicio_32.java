/*Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
positivo imprimir a sequência de termos: 0, 2, 4, 6, ...*/

class Exercicio_32{

	public static void main (String []args){
		
	
		java.util.Scanner leia = new java.util.Scanner (System.in);
		
		int qtdTermos=0;
		do{
		
			System.out.print("Qtd termos => ");
			qtdTermos = leia.nextInt();
			
			if( (qtdTermos!=0) && (qtdTermos>0) ){
				
				for(int i = 0; i < (qtdTermos*2); i+=2){
					System.out.println("["+i+"]");
				}
			
			}
		
		}while(qtdTermos<0);
	
	}
	
}
