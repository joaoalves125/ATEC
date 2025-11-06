package FichaPratica2;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Levantamento,Deposito,escolha;
        double saldo,montante,saldo_atual,soma,menos;
        System.out.print("Introduza o seu saldo: ");
        saldo= input.nextDouble();
        System.out.print("Valor a movimentar: ");
        montante= input.nextDouble();
        System.out.println("Escolhe uma opção: \nLevantamento:  \nDeposito: ");
        escolha=input.next();
        switch (escolha){
            case "Levantamento": menos=saldo-montante;
            if(saldo<montante){
                System.out.print("Saldo insuficiente\n Saldo Atual: "+saldo);
                break;
            }else{
                System.out.print("Operação realizada com sucesso\nSaldo atual: "+menos);
                break;
            }
            case "Deposito":soma=saldo+montante;
                System.out.print("Operação realizada com sucesso\nSaldo atual: "+soma);
                break;
            default: System.out.print("erro");


        }

    }
}
