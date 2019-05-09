
class Exercicio_24{
	
	/* 
	 * Escreva um programa em Java que imprima a tabuada do 1 ao 10, 
	 * para os números de 0 a 10.
	 */
	 
	public static void main (String args[]){
			//System.out.println("Olá mundo");
			
			
			for(int i=1; i<11; i++){
				//System.out.println("=> "+i);
				for(int j=0; j<11; j++){
					System.out.println(i + " * " + j + " = "+ (i*j) );
				}
				System.out.println("-------");
			}
	}
	
}
