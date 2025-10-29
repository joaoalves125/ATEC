package FichaPratica1;

import java.util.Scanner;

public class Ex01 {
    public static void  main(String[] args){
        Scanner input=new Scanner(System.in);

        int numero1,numero2,soma;
        System.out.print("Da-me um numero: ");
        numero1=input.nextInt();
        System.out.print("Da-me o segundo numero: ");
        numero2=input.nextInt();
        soma=numero1+numero2;

        System.out.print("A soma dos dois numeros é: "+soma);




    }

}
