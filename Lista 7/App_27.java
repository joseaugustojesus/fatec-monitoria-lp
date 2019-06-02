
public class App_27 {

    public static void main(String[] args) {
        
        
        java.util.Scanner js = new java.util.Scanner(System.in);
        
        //dados input
        System.out.print("frase 1 => ");
        String $fraseUm = js.nextLine();
        System.out.print("frase 2 => ");
        String $fraseDois = js.nextLine();
        
        
        //=====================================//
        String $sequencia = "";
        
        
        if($fraseUm.length() == $fraseDois.length()){
           
            for (int i = 0; i < $fraseUm.length(); i++) {
                $sequencia += $fraseUm.charAt(i);
                $sequencia += $fraseDois.charAt(i);
            }
            
            System.out.println("Sequência => "+$sequencia);
            
        }else{
            System.err.println("[erro] => Tamanhos diferentes!");
        }
        
        
        
    }
    
}
