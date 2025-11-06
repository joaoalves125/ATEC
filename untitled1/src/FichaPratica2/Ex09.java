package FichaPratica2;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1,numero2,numero3;
        System.out.print("primeiro numero: ");
        numero1=input.nextInt();
        System.out.print("segundo numero: ");
        numero2=input.nextInt();
        System.out.print("terceiro numero: ");
        numero3=input.nextInt();
        if(numero1<numero2 && numero1<numero3){
            System.out.print("este é o menor: "+numero1);
        }else if(numero2<numero1&&numero2<numero3){
            System.out.print("este é o menor: "+numero2);
        }else {
            System.out.print("este é o menor: "+numero3);
        }
    }
}
