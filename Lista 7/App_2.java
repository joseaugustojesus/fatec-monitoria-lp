/*2) Declarar uma variável do tipo String com seu valor inicial igual a branco (“”) e a
seguir atribuir as letras maiúsculas do alfabeto (ABCDE...Z), uma-a-uma, as primeiras
vinte e seis posições da variável String. Imprimir o resultado.*/

class App_2{

	public static void main (String []args){

		String _alfabeto = ""; //deve-se inicializar para evitar erro quando houver a concatenação
		//A = 65; Z = 90;
		for(int i = 65; i < 91; i++){  
			//System.out.print((char)i+" - "); 
			_alfabeto +=(char)i+" ";
		}
		
		System.out.println("Alfabeto => "+ _alfabeto);
		
	}
	
}
