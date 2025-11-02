package FichaPratica2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int posicao;
        System.out.print("lugar:");
        posicao=input.nextInt();
        switch(posicao) {
            case 1:System.out.print("10 pontos");
            break;
            case 2: System.out.print("8 pontos");
            break;
            case 3: System.out.print("6 pontos");
            break;
            case 4: System.out.print("5 pontos");
            break;
            case 5: System.out.print("4 pontos");
            break;
            case 6: System.out.print("3 pontos");
            break;
            case 7: System.out.print("2 pontos");
            break;
            case 8: System.out.print("1 ponto");
            break;
            case 9: System.out.print("Nao ganhou pontos");
            break;
            case 10: System.out.print("Nao ganhou pontos");
            break;
        }

        }
    }

