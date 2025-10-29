package FichaPratica1;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int segundo1,minutos1,segundo2,minutos2,segundo3,minutos3,segundo4,minutos4,segundo5,minutos5,total,totalhoras,totalminutos,totalsegundos;
        System.out.print("-----------------------Primeira Musica-----------------------");
        System.out.print("\nIntruduza os Minutos da musica: ");
        minutos1=input.nextInt();
        System.out.print("\nIntruduza os Segundos da musica: ");
        segundo1=input.nextInt();

        System.out.print("-----------------------Segunda Musica-----------------------");
        System.out.print("\nIntruduza os Minutos da musica: ");
        minutos2=input.nextInt();
        System.out.print("\nIntruduza os Segundos da musica: ");
        segundo2=input.nextInt();

        System.out.print("-----------------------Terceira Musica-----------------------");
        System.out.print("\nIntruduza os Minutos da musica: ");
        minutos3=input.nextInt();
        System.out.print("\nIntruduza os Segundos da musica: ");
        segundo3=input.nextInt();

        System.out.print("-----------------------Quarta Musica-----------------------");
        System.out.print("\nIntruduza os Minutos da musica: ");
        minutos4=input.nextInt();
        System.out.print("\nIntruduza os Segundos da musica: ");
        segundo4=input.nextInt();

        System.out.print("-----------------------Quinta Musica-----------------------");
        System.out.print("\nIntruduza os Minutos da musica: ");
        minutos5=input.nextInt();
        System.out.print("\nIntruduza os Segundos da musica: ");
        segundo5=input.nextInt();

        total=segundo1+segundo2+segundo3+segundo4+segundo5+(minutos1+minutos2+minutos3+minutos4+minutos5)*60;

        totalhoras = total / 3600;

        System.out.print(""+total);




    }
}
