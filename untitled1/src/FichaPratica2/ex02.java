package FichaPratica2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario;

        System.out.print("Qual é o teu salario: ");
        salario= input.nextDouble();

        if (salario <= 1500) {
            salario = salario * 0.20;
            System.out.print("paga taxa de 20%: " + salario+"€");
        }
        else {
            salario = salario * 0.30;
            System.out.print("paga taxa de 30%: " + salario+"€");
        }
    }
}
