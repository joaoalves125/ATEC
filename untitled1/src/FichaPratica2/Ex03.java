package FichaPratica2;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario;


        System.out.print("Qual é o teu salario: ");
        salario=input.nextDouble();

        if(salario <1500) {
            salario = salario * 0.20;
            System.out.print("Tens uma taxa de 20%: "+salario+"€");
        }else if(salario >=1500 && salario<2000) {
            salario = salario * 0.30;
            System.out.print("Tens uma taxa de 30%: " + salario + "€");
        }else if(salario >= 2000 && salario<2500){
            salario=salario* 0.35;
            System.out.print("Tens uma taxa de 35%: "+salario+"€");
        }else{
            salario=salario*0.40;
            System.out.print("Tens uma taxa de 40%: "+salario+"€");
        }

    }
}
