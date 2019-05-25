/*3) Declarar uma variável do tipo String com seu valor inicial igual a branco (“”) e a
seguir atribuir as letras minúsculas do alfabeto (abcde...z), uma-a-uma, as primeiras
vinte e seis posições da variável String. Imprimir o resultado.*/


class App_3{
	
	public static void main (String []args){
		
		
		String _alfabeto = ""; //deve-se inicializar para evitar erro quando houver a concatenação
		//A = 97; Z = 122;
		for(int i = 97; i < 123; i++){  
			//System.out.print((char)i+" - "); 
			_alfabeto +=(char)i+" ";
		}
		
		System.out.println("Alfabeto => "+ _alfabeto);
		
	
	}
	
}
