
public class App_29 {

    public static void main(String[] args) {

        java.util.Scanner js = new java.util.Scanner(System.in);
        java.util.Scanner txt = new java.util.Scanner(System.in);

        boolean $continuar = true;
        do {
            System.out.println("*******MENU*********");
            System.out.println("1 - criptografar ");
            System.out.println("2 - descriptografar ");
            System.out.println("3 - sair ");
            System.out.println("********************");     //Z E N I T
            System.out.print("Escolha => ");             //P O L A R
            int $escolha = js.nextInt();
            String $frase = "";
            switch ($escolha) {
                case 1: //criptografar
                    System.out.print("digite a frase p/ criptografar => ");
                    $frase = txt.nextLine();
                    
                   
                    
                    System.out.println($frase);
                    break;
                case 2: //descriptografar
                    break;
                case 3:
                    $continuar = false;
                    break;
                default:
                    throw new AssertionError();
            }

        } while ($continuar);

    }

}
