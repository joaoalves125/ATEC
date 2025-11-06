package FichaPratica2;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String AM,PM,escolha;
        int horas,minutos,soma;
        System.out.print("Introduza horas: ");
        horas=input.nextInt();
        System.out.print("Introduza os minutos: ");
        minutos=input.nextInt();
        System.out.print("Escolhe o tipo de horario AM ou PM: ");
        escolha=input.next();
        switch(escolha){
        case "AM": System.out.println(horas+":"+minutos+" AM");
        break;
        case "PM":soma=horas-10;
        System.out.print(soma+":"+minutos+" PM");
        break;
            default: System.out.print("erro");
        }
        }

}
