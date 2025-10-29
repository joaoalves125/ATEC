package FichaPratica1;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi=3.14;
        double raio;

        System.out.print("Vamos calcular a area qual é o raio?");
        raio=input.nextDouble();
        raio=(raio*raio)*pi;

        System.out.print("Aqui tens o valor da area: "+raio);

    }
}
