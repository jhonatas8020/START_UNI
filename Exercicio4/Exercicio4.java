package Exercicio4;

import java.util.Scanner;

public class Exercicio4 {

   public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       int numero;
       String Incomoda = "Incomoda";
       int p = 1;

       System.out.println("Digite um número: ");
       numero = input.nextInt();

       while (p<=numero) {
           System.out.println(Incomoda);
           p++;
       }

           System.out.println("muito mais.");
    }
}
