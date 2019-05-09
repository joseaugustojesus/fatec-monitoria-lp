
/*Solicite ao usuário os dois primeiros termos da sequência de Ricci e depois
solicite a número e verifique se o número informado pertence a sequência de
Ricci ou não.*/


class Exercicio_60{
	
	public static void  main (String []args){
		
		java.util.Scanner leia = new java.util.Scanner(System.in);
		
		System.out.print("[1º] => ");
		int x1 = leia.nextInt();
		System.out.print("[2º] => ");
		int x2 = leia.nextInt();
		int next=0;
		boolean ok = false;
		
		System.out.print("Nº => ");
		int n = leia.nextInt();
		
		if(n==x1 || n==x2){
				System.out.println("faz parte");
		}else{
			for(int i = 1; i<45; i++){
				next=x1+x2;
				x1=x2;
				x2=next;
				if(next==n){
					ok =true;
					break;
				}
				//System.out.println(next);
			}
			System.out.print(ok?"faz parte":"nao faz parte");
		}
		
		
		
		
	}
	
}
