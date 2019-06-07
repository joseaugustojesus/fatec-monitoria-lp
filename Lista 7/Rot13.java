
/*
 * @author josé augusto
 */
public class Rot13 {

    public static void main(String[] args) {
        java.util.Scanner leiaStr = new java.util.Scanner(System.in);
        java.util.Scanner leiaNum = new java.util.Scanner(System.in);

        int opcao = 0;

        do {

            System.out.println("========================");
            System.out.println("[1]  - Criptografar");
            System.out.println("[2]  - Descriptografar");
            System.out.println("[3]  - Sair");
            System.out.println("========================");
            opcao = leiaNum.nextInt();

            if (opcao == 1 || opcao == 2) {
                String novoTexto = "";
                
                System.out.print( ((opcao==1)?"Criptografar => ":"Descriptografar =>") );
                String s = leiaStr.nextLine();
                for (char c : s.toCharArray()) {
                    if (c >= 'a' && c <= 'm') {
                        c += 13;
                    } else if (c >= 'A' && c <= 'M') {
                        c += 13;
                    } else if (c >= 'n' && c <= 'z') {
                        c -= 13;
                    } else if (c >= 'N' && c <= 'Z') {
                        c -= 13;
                    }
                    novoTexto += c;
                }
                System.out.println(novoTexto);
                //System.out.println(s);

            } else if (opcao != 3) {
                System.out.println("opção inválida");
            }

        } while (opcao != 3);

    }
}
