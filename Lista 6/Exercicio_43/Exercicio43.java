
package Exercicio_43;
import java.util.Scanner;

public class Exercicio43 
{
	//feito por rossini rodrigues
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);		
		int i, c, qm = 1;
		
		for(c=1; c<=7;c++) 
		{
                 qm=1;
			System.out.println("Informe um numero: ");
			int fat = entrada.nextInt();
                        
			for(i=1; i<=fat;i++) 
			{
				qm *= i;
				System.out.println(qm);
			}
                       
                        
                        
			System.out.println("Resultado "+qm);
		}
	}

}
