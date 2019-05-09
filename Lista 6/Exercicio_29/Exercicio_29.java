/*29) Escreva um programa em Java que imprima sequência 5:
1, 1 3 5 7 9
2, 2 4 6 8 10
3, 1 3 5 7 9
4, 2 4 6 8 10
5, 1 3 5 7 9
6, 2 4 6 8 10
7, 1 3 5 7 9
8, 2 4 6 8 10
9, 1 3 5 7 9
10, 2 4 6 8 10*/

class Exercicio_29{
	public static void main(String[]args){
		java.util.Scanner leia = new java.util.Scanner(System.in);
		java.util.Scanner leiaStr = new java.util.Scanner(System.in);
		
		for(int i=1; i<11; i++){
			System.out.print(i+ " =>\t");
			for(int j = !(i%2==0)?1:2; j<11; j+=2){
				System.out.print(j+"\t");
			}	
			System.out.println("");
		}
		
		
	}
}
