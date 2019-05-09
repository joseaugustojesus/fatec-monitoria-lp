public class Exercicio_34 {
    public static void main(String[] args) {
        
        java.util.Scanner leia = new java.util.Scanner(System.in);  //para números
        java.util.Scanner leiaStr = new java.util.Scanner(System.in); //para textos
        
        int value; //cria-se fora devido ao escopo do => do while
        
        do {            
            
            System.out.print("valor =>");
            value=leia.nextInt();
            
            
            if(value>0){ //só realiza o processo se for positivo
                for (int i = 0; i < value; i++) {
                    System.out.println((i*(i+1))/2);
                }
            }else if(value==0){ //fim progama
                System.out.println("CLOSE");
                break;
            }
            
        } while (value<0); //repete enquanto o value for negativo
        
        
    }
}
