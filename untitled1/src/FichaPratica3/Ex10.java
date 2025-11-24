package FichaPratica3;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero,limite=2;
        System.out.print("numero: ");
        numero= input.nextInt();
        while(limite<=numero){
            System.out.print("\n"+limite);
            limite=limite+2;
        }
    }
}
