/*Solicite ao usuário o termo inicial e o termo final da sequência de Fibonacci
(intervalo fechado) e imprima o resultado.*/
class Exercicio_54{
	
	public static void main (String []args){
	
	
		int x1=0;
		int x2=1;
		int next=0;
		
		java.util.Scanner leia = new java.util.Scanner (System.in);
		
		System.out.print("Início => ");
		int inicio = leia.nextInt();
		System.out.print("Fim => ");
		int fim = leia.nextInt();
		boolean ok = false;
		
		for(int  i = 3; i<=45; i++){
			next = x1+x2;
			x1=x2;
			x2=next;
			
			if( (inicio!=1) && (inicio!=2) ){
				if(i>=inicio && i<=fim){
					System.out.println("=> "+next);
				}
			}else{
				if( (inicio == 1) ){
						if(!ok){
							System.out.println("=> "+0);
							System.out.println("=> "+1);
							ok=true;
						}
						if(i<=fim){
							System.out.println("=> "+next);
						}
				}else if((inicio == 2)){
					if(!ok){
						System.out.println("=> "+1);
						ok=true;
					}
					if(i<=fim){
						System.out.println("=> "+next);
					}
				}
			}
			
		}
		
	
	}
	
}
