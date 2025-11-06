package FichaPratica2;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        System.out.print("Da-me um numero: ");
        numero= input.nextInt();
        if(numero % 2 ==0){
            System.out.print("é par");
        }
        else{
            System.out.print("é impar");
        }
    }

}
