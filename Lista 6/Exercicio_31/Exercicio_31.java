/*Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
positivo imprimir a sequência de termos: 1, 2, 3, 4, ...*/

class Exercicio_31 {

	public static void main (String args []){
		
		java.util.Scanner leia = new java.util.Scanner(System.in); //objeto de leitura
		
		int quantidadeTermos=0;
		do{
			
			System.out.print("Quantidade de termos => ");
			quantidadeTermos = leia.nextInt();	
			
			if( !(quantidadeTermos==0) && (quantidadeTermos>0) ){
				for(int i = 1 ; i <= quantidadeTermos; i++){
					System.out.println("=>\t"+i);
				}
			}
			
		}while(quantidadeTermos<0);
	}
	
}
