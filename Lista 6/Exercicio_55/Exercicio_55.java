class Exercicio_55{
	
		public static void main (String[]args){
			
		
			java.util.Scanner leia = new java.util.Scanner (System.in);
			
			System.out.print("Nº => ");
			int n = leia.nextInt();
			
			int soma=0;
			for(int i=1; i<n; i++){
				if(n%i==0){
					soma+=i;
				}
			}
			
			if(soma==n){
				System.out.println(n + " é perfeito!");
			}
			
		}
	
}
