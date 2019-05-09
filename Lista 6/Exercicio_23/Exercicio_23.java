class Exercicio_23{
	/*A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Escreva um programa em
		Java para coletar dados sobre 
		* 1. o salário e 
		* 2. número de filhos de cada habitante e 
		* 
		* 
		* após as leituras, escrever:
		a) Média de salário da população;  total/qtd
		b) Média do número de filhos;		total/qtd
		c) Maior salário dos habitantes;	
		d) Percentual de pessoas com salário menor que R$ 150,00.
		* 
		Obs.: O final das leituras dos dados se dará com a entrada de um “salário negativo”.*/
		
	public static void main (String[]args){
		
		java.util.Scanner leia = new java.util.Scanner(System.in);
		java.util.Scanner leiaStr = new java.util.Scanner(System.in);
		
		
		float index     = 0;
		float salario = 0;
		int filho     = 0;
		float sal_soma=0;
		int fil_soma=0;
		float maior=0;
		float qtd150=0;
		do{
		
			System.out.print("Salário ["+index+"] => ");
			salario = leia.nextFloat();
			System.out.print("Nº de filhos ["+index+"] => ");
			filho = leia.nextInt();
			
			if(salario<=0){
				break;
			}else{
				maior = (index==0)?salario:(salario>maior)?salario:maior;
				index++;
				//soma salário
				sal_soma += salario;
				//soma filhos
				fil_soma += filho;
				if(salario>150){
					qtd150++;
				}
			}
			
		}while(salario>=0);
		
		System.out.println("Média Salarial => \t"+(sal_soma/index));
		System.out.println("Médio de filhos => \t"+(fil_soma/index));
		System.out.println("Maior salário => "+maior);
		System.out.println("Porcentagem de salários maior que 150 => "+(qtd150/index)*100);
	}
}
