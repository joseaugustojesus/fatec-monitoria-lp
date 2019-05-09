/*30) Escreva um programa em Java que imprima sequência 6:
1, 1
2, 2 4
3, 1 3 5
4, 2 4 6 8
5, 1 3 5 7 9
6, 2 4 6 8 10 12
7, 1 3 5 7 9 11 13
8, 2 4 6 8 10 12 14 16
9, 1 3 5 7 9 11 13 15 17
10, 2 4 6 8 10 12 14 16 18 20*/

class Exercicio_30{


	public static void main (String []args){
		
		for(int i=1; i<11; i++){
			System.out.print(i+" =>\t");
			int aux=(i%2==0)?2:1;
			for(int j=0; j<i; j++){
				System.out.print(aux+"\t");
				aux+=2;
			}
			System.out.println("");
		}
		
	}
}
