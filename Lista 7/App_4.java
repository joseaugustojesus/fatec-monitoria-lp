/*4) Declarar uma variável do tipo String com seu valor inicial igual a branco (“”) e a
seguir atribuir os caracteres numéricos (0123456789), um-a-um, as primeiras dez
posições da variável String. Imprimir o resultado.*/

class App_4{

	public static void main (String []args){
	
		String _numeros = ""; //inicialização necessária
		
		//0 = 48;
		//0 = 57;
		for(int i = 48; i < 58; i++) {
			//System.out.println("=> "+(char)i);
			_numeros += (char)i + " ";
		}
		
		System.out.println("números => "+ _numeros);
	
	}
	
}
