package FichaPratica5;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] numero=new int[10];

        for (int i = 0; i < numero.length; i++) {
            System.out.println("insira um numero no array"+i+":");
            numero[i]= input.nextInt();
        }
        for (int i = 0; i < numero.length; i++) {
            System.out.println("numero:"+numero[i]);

        }
    }
}