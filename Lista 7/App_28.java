
public class App_28 {

    public static void main(String[] args) {

        java.util.Scanner js = new java.util.Scanner(System.in);

        System.out.print("Insira uma frase => ");
        String $text = js.nextLine();
        String $sequencia = "";

        if ($text.length() % 2 == 0) { //texto com caracteres par

            for (int i = 0; i < $text.length() / 2; i++) {
                $sequencia += $text.charAt(i);
                $sequencia += $text.charAt((($text.length() - 1) - i));
            }

            System.out.println("Saída => " + $sequencia);
            //maanrai 
        } else { //texto com caracteres ímpar 

            String $text_1 = $text.substring(0, $text.length()/2);
            String $text_2 = $text.substring($text.length()/2+1, $text.length());
            char $meio = $text.charAt($text.length()/2);
            $text = $text_1+$text_2;
            
            for (int i = 0; i < $text.length() / 2; i++) {
                $sequencia += $text.charAt(i);
                $sequencia += $text.charAt((($text.length() - 1) - i));
            }
            
            $sequencia += $meio;
            System.out.println("Saída => " + $sequencia);
            

        }

    }

}
