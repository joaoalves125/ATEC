package FichaPratica4;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.print("inicio: ");
        num1= input.nextInt();
        System.out.print("fim: ");
        num2= input.nextInt();
        while(num1<=num2){
            if(num1%5==0){
                System.out.println(num1);
            }
            num1++;
        }
    }
}


















































