/* Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
positivo imprimir a sequência de termos: 1, 1/2, 2/3, 3/4, 4/5, ...*/
class Exercicio_37{
	
	public static void main (String []args){
		
		java.util.Scanner leia = new java.util.Scanner (System.in);
		
		
		int termos=0;
		int index=1;
		
		do{
			System.out.print("Termos => ");
			termos = leia.nextInt();
			
			if( (termos!=0) && (termos>0) ){
				
				for (int i = 1; i <= termos; i++){
					
					System.out.println(	(i==1)?"[1]":"[" + (i-1) + " / " + i + "]");
					
				}
				
			}
			
		}while(termos<0);
	
	}
	
}
