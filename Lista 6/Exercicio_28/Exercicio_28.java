
/*
 * 
 * 
 * 28) Escreva um programa em Java que imprima sequência 4:
		1, 2 3 4 5 6 7 8 9 10
		2, 3 4 5 6 7 8 9 10
		3, 4 5 6 7 8 9 10
		4, 5 6 7 8 9 10
		5, 6 7 8 9 10
		6, 7 8 9 10
		7, 8 9 10
		8, 9 10
		9, 10
		10,
 * */
class Exercicio_28{

	public static void main (String args []){
	
		java.util.Scanner leia = new java.util.Scanner(System.in);
		java.util.Scanner leiaStr = new java.util.Scanner(System.in);
		
		
			for(int i =1; i<11; i++){
				System.out.print(i+" =>\t");
				for(int j=(i+1); j<11; j++){
					System.out.print(j+"\t");
				}
				System.out.println("");
			}
		
	}
	
}
