package FichaPratica3;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero=0, numero2 = 0, numero3 = 0, numero4 = 0, numero5 = 0;

        while (numero >= 0) {
            System.out.println("numero:");
            numero = input.nextInt();
            if (numero < 25 && numero > 0) {
                numero2++;
            } else if (numero >= 26 && numero <= 50) {
                numero3++;
            } else if (numero >= 51 && numero <= 75) {
                numero4++;
            } else if (numero >= 76 && numero <= 100) {
                numero5++;
            }



        }
        System.out.print("00,25: " + numero2 + "\n26,50: " + numero3 + "\n51,75: " + numero4 + "\n76,100: " + numero5);


    }
}
