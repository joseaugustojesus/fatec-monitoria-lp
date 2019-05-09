/*Escreva um programa em Java para ler uma quantidade e a seguir ler esta quantidade de números.
Depois de ler todos os números o algoritmo deve apresentar na tela o maior dos números lidos e a média
dos números lidos.*/
public class Exercicio_21 {
	
	public static void main (String[] args) {
		
		java.util.Scanner leia = new java.util.Scanner (System.in); //para números
		java.util.Scanner leiaStr = new java.util.Scanner (System.in); //para textos
		
		System.out.print("Quantidade => ");
		int qtd = leia.nextInt();
		
		int maior=0;
		int soma=0;
		for(int i=0; i<qtd; i++){
			System.out.print("["+i+"] => ");
			int value = leia.nextInt();
			if(i==0){
				maior=value;
			}else{
				maior = (value>maior)?value:maior;
			}
			soma += value;
		}
		
		System.out.println("Maior elemento => "+maior);
		System.out.println("Soma => "+soma);
		System.out.println("Média => "+(soma/qtd));
	}
}

