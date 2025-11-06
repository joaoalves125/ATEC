package FichaPratica2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex12 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String opcao,escolha;

       System.out.println("Escolha uma opcao:\n1. Criar\n2. Atualizar\n3. Eliminar\n4. Sair");
       opcao= input.next();
       switch(opcao){
           case "Criar": System.out.print("Foi escolhida a primeira opcao: Criar");
           break;
           case "Atualizar": System.out.print("Foi escolhida a segunda opcao: Atualizar");
           break;
           case "Eliminar": System.out.print("Foi escolhida a terceira opcao: Eliminar");
           break;
           case "Sair": break;
           default: System.out.print("erro");
               break;
       }






    }
}
