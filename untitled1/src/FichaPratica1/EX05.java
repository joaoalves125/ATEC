package FichaPratica1;

import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1,nota2,nota3,media,media_pond;

        System.out.print("Qual é o valor da primeira nota? ");
        nota1=input.nextDouble();
        System.out.print("\nQual é o valor da segunda nota? ");
        nota2=input.nextDouble();
        System.out.print("\nQual é o valor da terceira nota? ");
        nota3=input.nextDouble();
        media=(nota1+nota2+nota3)/3;
        System.out.print("\nO valor da média é: "+media);

        media_pond=(nota1*0.2)+(nota2*0.3)+(nota3*0.5);
        System.out.print("\nO valor da media ponderada é: "+media_pond);







    }
}
