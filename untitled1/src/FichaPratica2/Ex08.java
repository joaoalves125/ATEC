package FichaPratica2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota1,nota2,nota3,media;
        System.out.print("Primeira nota: ");
        nota1= input.nextInt();
        System.out.print("Segunda nota: ");
        nota2=input.nextInt();
        System.out.print("Terceira nota: ");
        nota3=input.nextInt();
        media=(nota1+nota2+nota3)/3;
        if(media>9.5){
            System.out.print("Está aprovado");
        }
        else{
            System.out.print("Não esta aprovado");
        }
    }
}
