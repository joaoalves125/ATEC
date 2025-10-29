package FichaPratica1;

import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor1,valor2,troca;
        System.out.print("Qual é o primeiro valor? ");
        valor1=input.nextInt();
        System.out.print("\nQual é o segundo valor?");
        valor2=input.nextInt();
        troca=valor1;
        valor1=valor2;
        valor2=troca;

        System.out.print("\nO primeiro valor trocado: "+valor1+"\nSegundo valor trocado: " + ""+valor2);


    }
}
