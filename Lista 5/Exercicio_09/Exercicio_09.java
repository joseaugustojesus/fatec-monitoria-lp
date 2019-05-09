package Exercicio_09;

/*
A jornada de trabalho semanal de um funcionário é de 40 horas.
O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo
de 50%. 

1. Escreva um programa em Java que leia o número de horas trabalhadas em um mês
2. o salário por hora 
3. e escreva o salário total do funcionário, que deverá ser acrescido das horas
extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).*/

public class Exercicio_09 {
    public static void main(String[] args) {
        java.util.Scanner leitor = new java.util.Scanner(System.in);
        
        float salario = 0;
        
        System.out.print("Quantidade de horas mensais => ");
        int horasTrabalhadas =  leitor.nextInt();
        System.out.print("Valor da hora => ");
        float horaValor = leitor.nextFloat();
        
        if(horasTrabalhadas>160){
            int horasExtras = horasTrabalhadas-160;
            salario = 160*horaValor;
            salario += horasExtras * (horaValor+horaValor*0.5);
            
            System.out.println("Horas trabalhadas mensais => "+horasTrabalhadas);
            System.out.println("Horas mensais (padrão) x valor hora =>  160"+" x "+horaValor+" = "+160*horaValor);
            System.out.println("Horas Extras  x valor hora + 50% do valor =>  "+(horasTrabalhadas-160)*(horaValor+horaValor*0.5));
            System.out.println("Salário total => "+salario);
        }else{
            salario = horasTrabalhadas*horaValor;
            System.out.println("Salário total => "+salario);
        }
        
        
        
        //System.out.println(horasTrabalhadas);
    }
}
