package FichaPratica5;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor[]=new double[10]; double media=0; int contador=0;
        for (int i = 0; i < valor.length; i++) {
            System.out.print("insira um valor:");
            valor[i]= input.nextDouble();
        }
        for (int i = 0; i < valor.length; i++) {
            contador++;
            media=media+valor[i];


        }
        media=media/contador;
        System.out.print("valor da media é:"+media);
        }
}
