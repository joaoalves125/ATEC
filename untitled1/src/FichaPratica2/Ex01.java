package FichaPratica2;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1,numero2;

        System.out.print("primeiro numero: ");
        numero1=input.nextInt();
        System.out.print("Segundo numero: ");
        numero2=input.nextInt();
        if(numero1>numero2)
            System.out.print("este é o maior:  "+numero1);
        else
            System.out.print("este é o maior: "+numero2);
    }
}
