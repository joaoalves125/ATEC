package FichaPratica1;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base,altura,area,perimetro;

        System.out.print("Insere o valor da base: ");
        base = input.nextInt();

        System.out.print("Insere a altura: ");
        altura=input.nextInt();
        area=base*altura;
        perimetro=base*2+altura*2;

        System.out.print("Valor da area: "+area+"\nvalor do perimetro: "+perimetro);


    }
}
