package Exercício__07;

/*Crie um arquivo chamado Saudacao.java. Implemente um programa em Java que declare uma
variável chamada hora. Essa variável deve armazenar a hora do dia. Esse programa deve exibir a
mensagem Zzzzz se a hora estiver no intervalo [0, 6], Bom dia se a hora estiver no intervalo [7, 11],
Boa tarde se a hora estiver no intervalo [12, 17] ou Boa noite se a hora estiver no intervalo [18, 23].
Dê a opção do usuário informar a hora manualmente ou gerar a hora aleatoriamente, sempre
fazendo todas as validações necessárias.*/

public class Saudacao {
    public static void main(String[] args) {
      java.util.Scanner leitor = new java.util.Scanner(System.in);
      
        System.out.println("Padrão => Automático");
        System.out.print("Deseja inserir os dados manualmente? (s/n)");
        if(leitor.nextLine().charAt(0)=='s'){
            System.out.print("Horas => ");
            int horas = leitor.nextInt();
            System.out.println((horas<0 || horas>23)?"Valores inválidos":(horas>=0 && horas<=6)?"ZzZzZzZ":
                    (horas>=7 && horas<=11)?"Bom dia":
                            (horas>=12 && horas<=17)?"Boa tarde":"Boa noite");
        }else{
            java.util.Random random = new java.util.Random();
            int horas = random.nextInt(24);
            System.out.println(horas);
            System.out.println((horas>=0 && horas<=6)?"ZzZzZzZ":
                    (horas>=7 && horas<=11)?"Bom dia":
                            (horas>=12 && horas<=17)?"Boa tarde":"Boa noite");
        }
    }
}
