package FichaPratica2;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String escolha;
        double numero1,numero2,soma,menos,divisao;
        System.out.print("Da-me um numero: ");
        numero1=input.nextDouble();
        System.out.print("Da-me outro numero: ");
        numero2=input.nextDouble();
        System.out.print("Qual é a operação que queres fazer? ");
        escolha= input.next();;
        switch (escolha) {
            case "+": soma=numero1+numero2;
                System.out.print("Esta é a soma: "+soma);
                break;
            case "-": menos=numero1-numero2;
                System.out.print("Esta é a subtração: "+menos);
                break;
            case "%": divisao=numero1%numero2;
                System.out.print("Esta é a divisao: "+divisao);
                break;
            default:System.out.print("erro");
        }

    }
}
