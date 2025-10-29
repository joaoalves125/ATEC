package FichaPratica1;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int numero1, numero2, soma, subtracao, multiplicacao, divisao;
        System.out.print("da-me um numero:");

        numero1 = input.nextInt();

        System.out.print("da-me outro numero: ");
        numero2 = input.nextInt();

        soma=numero1+numero2;
        subtracao=numero1-numero2;
        multiplicacao=numero1*numero2;
        divisao=numero1/numero2;

        System.out.print("Soma: "+soma  + "\nSubtracao: "+subtracao+"\nmultiplicação: "+multiplicacao+ "\ndivisao: "+divisao);


    }
}
