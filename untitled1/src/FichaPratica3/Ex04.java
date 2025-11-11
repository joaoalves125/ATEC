package FichaPratica3;

import java.util.Scanner;

public class Ex04 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero,numero2=0;
        System.out.print("introduza um numero: ");
        numero= input.nextInt();
        while(numero2!=numero){

            System.out.print("\n"+numero2);
            numero2=numero2+1;
        }
        System.out.print("\n"+numero);
    }
}
