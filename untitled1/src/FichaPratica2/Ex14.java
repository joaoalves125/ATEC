package FichaPratica2;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2, numero3;
        System.out.print("Introduza um numero: ");
        numero1 = input.nextInt();
        System.out.print("Introduza um numero: ");
        numero2 = input.nextInt();
        System.out.print("Introduza um numero: ");
        numero3 = input.nextInt();
        if (numero1 < numero2 && numero2 < numero3) {
            System.out.println(""+numero1+"\n" + numero2+"\n" + numero3);
        } else if(numero2 < numero1 && numero1 < numero3){
            System.out.println(""+numero2+ "\n"+ numero1 +"\n"+ numero3);
        }else if(numero3<numero2&&numero2<numero1){
            System.out.println(""+numero3+ "\n"+ numero2 +"\n"+ numero1);
        }else if (numero1<numero3&&numero3<numero2){
            System.out.println(""+numero1+ "\n"+ numero3 +"\n"+ numero2);
    }
        }




    }

