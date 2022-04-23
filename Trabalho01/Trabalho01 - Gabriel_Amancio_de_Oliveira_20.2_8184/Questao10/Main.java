package Questao10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        int[] fatores = new int[10];
        int cont = 0;

        System.out.println("Digite um numero: ");
        num = Integer.parseInt(new Scanner(System.in).nextLine());

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                fatores[cont] = i;
                cont++;
            }
        }

//        System.out.println("\n\n");

        for (int i = 0; i < fatores.length; i++) {
            if (fatores[i] != 0) {
                System.out.println(fatores[i]);
            }
        }
    }
}

