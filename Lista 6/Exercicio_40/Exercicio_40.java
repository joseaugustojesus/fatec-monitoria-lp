/* Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
positivo imprimir a sequência de termos: 1, 2, 3, ..., 10, 10, 9, 8, ..., 1. Exemplo com entrada de 20
termos.*/

class Exercicio_40{
	
	public static void main (String []args){
		
		java.util.Scanner leia = new java.util.Scanner (System.in);
		
		
		int termos=0;
		int index=0;
		String reverse = "";
		
		do{
			System.out.print("Termos => ");
			termos = leia.nextInt();
			
			if( (termos!=0) && (termos>0) ){
				
				index = termos/2;
				
				for (int i = 1; i <= ((termos%2==0)?termos/2:(termos/2)+1); i++){
					System.out.println(i);
					if(index>=1){
						reverse += index+"\n";
					}
					index--;
				}
				
				System.out.println(reverse);
			}
			
		}while(termos<0);
	
	
		
	}
	
}
