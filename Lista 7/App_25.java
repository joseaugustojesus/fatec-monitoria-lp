/*
Escreva um programa validador de senhas. A regra para a criação de uma senha forte é
que a senha deve ser de tamanho mínimo 10. (OK)

A senha deve conter:
letras maiúsculas, (ok)
letras minúsculas, (ok
números (ok)
caracteres especiais/símbolos (!@#$%&*()+). (ok)

Outra regra, deve ter
pelo menos 3 caracteres (maiúsculo ou minúsculo),  (OK)
pelo menos 3 números (OK)
pelo menos 2 símbolos. 

O programa deve solicitar uma senha forte ao usuário até ele conseguir uma senha
que respeite esses critérios. Após cada senha digitada, apresentar as regras e se a senha
passou pelos quesitos ou não.*/

public class App_25 {

    public static void main(String[] args) {
        java.util.Scanner leia = new java.util.Scanner(System.in);

        boolean ok = false;

        do {
            System.out.print("Senha => ");
            String _senha = leia.nextLine();

            int _maiusculas = 0;
            int _minusculas = 0;
            int _numeros = 0;
            int _caracteresEspeciais = 0;

            if (_senha.length() > 9) {

                for (char _char : _senha.toCharArray()) {
                    int _ascii = (int) _char;
                    if ((_ascii >= 65) && (_ascii <= 90)) {
                        _maiusculas++;
                    } else if ((_ascii >= 97) && (_ascii <= 122)) {
                        _minusculas++;
                    } else if ((_ascii >= 48) && (_ascii <= 57)) {
                        _numeros++;
                    } else if ((_char == '!') || (_char == '@')
                            || (_char == '#') || (_char == '$')
                            || (_char == '%') || (_char == '&')
                            || (_char == '(') || (_char == '*')
                            || (_char == ')') || (_char == '+')) {
                        _caracteresEspeciais++;
                    }
                }

                if (((_minusculas > 2) || (_maiusculas > 2)) && (_minusculas > 0) && (_maiusculas > 0)) {
                    if (_numeros > 2 && _numeros > 0) {
                        if (_caracteresEspeciais > 1 && _caracteresEspeciais > 0) {
                            System.out.println("ok");
                            ok = true;
                        } else {
                            //caracteres insuficientes
                            System.out.println("[erro] - Caracteres especiais insuficientes");
                        }
                    } else {
                        //numeros insuficientes
                        System.out.println("[erro] - Números insuficientes");
                    }
                } else {
                    //letras minúsculas ou maiúsculas insuficientes
                    if (_maiusculas < 3) {
                        System.out.println("[erro] - Letras maiúsculas insuficientes");
                    } else {
                        System.out.println("[erro] - Letras minúsculas insuficientes");
                    }
                }

            } else {
                System.out.println("[Inválida][Tamanho insuficiente]"); //00
            }
        } while (!ok);

    }

}
