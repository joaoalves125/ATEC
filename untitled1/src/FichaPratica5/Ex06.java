package FichaPratica5;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero[] = new int[15];
        for (int i = 0; i < numero.length; i++) {
            System.out.print("insira um numero:");
            numero[i] = input.nextInt();
        }
        int valor = numero[0];
        for (int i = 0; i < numero.length; i++) {

            if (valor > numero[i]) {
                System.out.print("certo");
            } else if (valor < numero[i]) {
                System.out.print("errado");

            }

        }
    }
}

