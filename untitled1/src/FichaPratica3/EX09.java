package FichaPratica3;


import java.util.Scanner;

public class EX09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero,media=0,contador=0;
        System.out.print("numero: ");
        numero= input.nextInt();
        while(numero != -1){
            media=media+numero;
            System.out.print("numero: ");
            numero= input.nextInt();
            contador++;
        } media=media/contador;
        System.out.print("esta é a media: "+media);

    }

}
