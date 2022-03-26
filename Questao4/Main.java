package Questao4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] vendas = new int[12][4];
        int totalMes = 0;
        int totalSemana = 0;
        int totalAno = 0;

        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                System.out.print("Digite o valor total de vendas na semana " + (j + 1 ) + ": ");
                vendas[i][j] = Integer.parseInt(new Scanner(System.in).nextLine());
                totalMes += vendas[i][j];
                totalSemana += vendas[i][j];
                totalAno += vendas[i][j];
            }
            System.out.println("Total vendido no " + (i + 1) + " mês: " + totalMes);
            totalMes = 0;
        }

        System.out.println("Total vendido na semana: " + totalSemana);
        System.out.println("Total vendido no ano: " + totalAno);
    }
}
