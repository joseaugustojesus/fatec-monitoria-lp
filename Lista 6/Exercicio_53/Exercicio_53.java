/*Imprima os números da sequência de Fibonacci que estão presentes na faixa de 1
até 250.*/

class Exercicio_53{
	
	public static void main (String []args){
	
			
			int x1=0;
			int x2=1;
			int next=0;
			
			while(next<=250){
				next=x1+x2;
				x1=x2;
				x2=next;
				if(next<=250){
					System.out.println("[Fibbo] => " + next);
				}
			}
			
			
			
	
	}

}
