package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        int n4;
        int n5;

        System.out.println("Digite o primeiro número: ");
        n1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = input.nextInt();

        System.out.println("Digite o terceiro número: ");
        n3 = input.nextInt();

        System.out.println("Digite o quarto número: ");
        n4 = input.nextInt();

        System.out.println("Digite o quinto número: ");
        n5 = input.nextInt();

        if ( (n1 > n2) && (n1 > n3) && (n1 > n4) && (n1 > n5) ) {
            System.out.println("Maior número é: " + n1);
        } else if ( (n2 > n1) && (n2 > n3) && (n2 > n4) && (n2 > n5) ) {
            System.out.println("Maior número é: " + n2);
        } else if ( (n3 > n1) && (n3 > n2) && (n3 > n4) && (n3 > n5) ) {
            System.out.println("Maior número é: " + n3);
        } else if ( (n4 > n1) && (n4 > n2) && (n4 > n3) && (n4 > n5) ) {
            System.out.println("Maior número é: " + n4);
        } else if ( (n5 > n1) && (n5 > n2) && (n5 > n3) && (n5 > n4) ) {
            System.out.println("Maior número é: " + n5);
        } else {
            System.out.println("Todos são iguais");
        }

        if ( (n1 < n2) && (n1 < n3) && (n1 < n4) && (n1 < n5) ) {
            System.out.println("Menor número é: " + n1);
        } else if ( (n2 < n1) && (n2 < n3) && (n2 < n4) && (n2 < n5) ) {
            System.out.println("Menor número é: " + n2);
        } else if ( (n3 < n1) && (n3 < n2) && (n3 < n4) && (n3 < n5) ) {
            System.out.println("Menor número é: " + n3);
        } else if ( (n4 < n1) && (n4 < n3) && (n4 < n2) && (n4 < n5) ) {
            System.out.println("Menor número é: " + n4);
        } else if ( (n5 < n1) && (n5 < n3) && (n5 < n4) && (n5 < n2) ) {
            System.out.println("Menor número é: " + n5);
        }

    }
}
