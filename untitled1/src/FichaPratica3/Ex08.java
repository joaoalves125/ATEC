package FichaPratica3;

import java.util.Scanner;

public class Ex08 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int numero,contador=0;

         System.out.print("numero: ");
         numero= input.nextInt();
         contador=numero-5;
         while(contador<numero){
             System.out.print("\n"+contador);
             contador++;
         }contador=numero+5;
         while(contador>numero){
             numero++;
             System.out.print("\n"+numero);

         }
    }
}
