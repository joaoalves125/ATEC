package FichaPratica3;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limite, salto = 0, valor;
        System.out.print("introduza o limite: ");
        limite = input.nextInt();
        System.out.print("introduza o valor do salto: ");
        valor = input.nextInt();
        while (salto <= limite) {
            System.out.print("\n" + salto);
            salto = salto + valor;
        }
    }
}
