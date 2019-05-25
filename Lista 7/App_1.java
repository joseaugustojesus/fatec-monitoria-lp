/*1) Exibir na tela os caracteres da tabela de códigos ASCII (American Standard Code for
Information Interchange).*/

class App_1 {

	public static void main (String []args){
		
		for(int i = 0; i < 177; i++){  //tabela ascii vai de 0 até 176 (inclusive)
			System.out.println((char)i);
		}
	
	}
	
}
