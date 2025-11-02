package FichaPratica2;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2;
        System.out.print("Da-me um numero: ");
        numero1 = input.nextInt();
        System.out.print("Da-me o segundo numero: ");
        numero2 = input.nextInt();
        if (numero1 < numero2) {
            System.out.print("este numero é o mais pequeno: " + numero1+" este é o maior: "+numero2);
        } else {
            System.out.print("este é o mais pequeno: " + numero2+" este é o maior: "+numero1);
        }

    }
}
