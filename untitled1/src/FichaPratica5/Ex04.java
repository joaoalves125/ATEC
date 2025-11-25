package FichaPratica5;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero[]=new int [10];
        for (int i = 0; i < numero.length; i++) {
            System.out.println("insira um numero:");
            numero[i]= input.nextInt();
        }

        int menor=numero[0];
        for (int i = 0; i < numero.length ; i++) {
            if (numero[i]<menor) {
                menor=numero[i];
            }
        }System.out.print("numero menor é: "+menor);

    }
    }

