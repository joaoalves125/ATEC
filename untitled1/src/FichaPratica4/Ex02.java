package FichaPratica4;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma,numero,numero2=0;
        for(numero=11;numero<=51;numero+=2){
            System.out.printf("\nnumero: "+numero);

            numero2=numero2+numero;
        } System.out.printf("\nsoma: "+numero2);

    }

}
