/*Solicite ao usuário um número e verifique se este número é primo ou não*/


class Exercicio_46{
	
	public static void main (String []args){
		
		java.util.Scanner leia = new java.util.Scanner(System.in);
		
		System.out.print("Nº => ");
		int n = leia.nextInt();
		
		int primo=0;
		
		for(int i = 1; i <= n; i++){
			//System.out.println(i);
			primo = (n%i==0)? primo+1 : primo ;
		}
		
		System.out.println( (primo==2)? "O Nº " + n + " eh primo" : "O Nº " + n + " NÃO eh primo" );
		
		
	}

}
