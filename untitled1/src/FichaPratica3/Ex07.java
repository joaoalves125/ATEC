package FichaPratica3;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        int numero = 0, soma = 0;
        while (numero <= 100) {
            System.out.print("\n" + numero);
            soma = soma + numero;
            numero++;
        }
        System.out.println("\nA soma é: " + soma);

    }

}
