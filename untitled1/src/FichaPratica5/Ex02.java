package FichaPratica5;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] comissao= new double [12];
        for (int i = 0; i < comissao.length; i++) {
            System.out.print("Valor da comissao do mes "+i+":");
            comissao[i]= input.nextDouble();
        }
        double total=0;
        for (int i = 0; i <comissao.length ; i++) {
            total=total+comissao[i];
        }
        System.out.print("o total é: "+total);
    }
}
