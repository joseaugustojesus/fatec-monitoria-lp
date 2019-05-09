
class Exercicio_26{
	/*
	 * 26) Escreva um programa em Java que imprima sequência 2:
		1, 1
		2, 1 2
		3, 1 2 3
		4, 1 2 3 4
		5, 1 2 3 4 5
		6, 1 2 3 4 5 6
		7, 1 2 3 4 5 6 7
		8, 1 2 3 4 5 6 7 8
		9, 1 2 3 4 5 6 7 8 9
		10, 1 2 3 4 5 6 7 8 9 10
	 * 
	 * */
		public static void main (String args[]){
			//System.out.println("Ok");
			
			for(int i=1; i<11; i++){
				System.out.print(i + " =>\t");
					for(int j=1; j<=i; j++){
						System.out.print(j+"\t");
					} 
					System.out.println("");
			}
		}
}
