package FichaPratica3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero,valor=0;
        System.out.print("introduza um numero: ");
        numero= input.nextInt();
        while(valor<numero){
            System.out.print("\nadoro programação");
            valor=valor+1;

        }
    }
}
