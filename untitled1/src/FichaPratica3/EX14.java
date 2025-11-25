package FichaPratica3;

import java.util.Scanner;

public class EX14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limite, quantidade = 0, numero = 0, anterior = 0;
        boolean crescente=true;
        System.out.print("Quantos numeros deseja inserir: ");
        limite = input.nextInt();

        while (quantidade < limite) {
            System.out.printf("introduza um numero: ");
            numero = input.nextInt();
            quantidade++;
            if (numero< anterior) {
                crescente=false;

            } anterior=numero;

        }
        if (crescente) {
            System.out.print("Crescente");
        }

        else{
            System.out.printf("Nao crescente");
        }


    }
}
