package FichaPratica3;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero,numero1;
        System.out.print("Inicio: ");
        numero= input.nextInt();
        System.out.print("Fim: ");
        numero1= input.nextInt();
        while(numero<numero1){
            System.out.print("\n"+numero);
            numero=numero+1;
        }
    }
}
