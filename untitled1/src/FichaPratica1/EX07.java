package FichaPratica1;

import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double preco1,preco2,preco3,total;
        System.out.print("Preço do primeiro artigo: ");
        preco1=input.nextDouble();
        System.out.print("\nPreço do segundo artigo: ");
        preco2=input.nextDouble();
        System.out.print("\nPreço do terceiro artigo: ");
        preco3=input.nextDouble();
        total=(preco1+preco2+preco3)*0.90;

        System.out.print("\nTotal: "+total);
    }
}
