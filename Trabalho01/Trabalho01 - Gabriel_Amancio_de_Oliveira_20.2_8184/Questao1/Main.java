package Questao1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pes = 30;
        int maos = 25;
        int podologia = 50;

        manicure(pes, maos, podologia);
    }

    public static void manicure(int p, int m, int pad){

        Scanner ler = new Scanner(System.in);

        String pessoas[] = new String[5];
        pessoas[0] = "Fabricia";
        pessoas[1] = "Vanessa";
        pessoas[2] = "Eliane";
        pessoas[3] = "Carla";
        pessoas[4] = "Roberta";


        int pes[] = new int[5];
        int maos[] = new int[5];
        int podologia[] = new int[5];

        int valorTotalPes[] = new int[5];
        int valorTotalMaos[] = new int[5];
        int valorTotalPodologia[] = new int[5];

        int valorTotal[] = new int[5];
        int i;
        for (i = 0; i < pessoas.length; i++){
            System.out.printf("Informe quantos pes a " + pessoas[i] + " fez neste mes: ");
            pes[i] = ler.nextInt();
            System.out.printf("Informe quantas maos a " + pessoas[i] + " fez neste mes: ");
            maos[i] = ler.nextInt();
            System.out.printf("Informe quantos podologia a " + pessoas[i] + " fez neste mes: ");
            podologia[i] = ler.nextInt();
        }

        for (i = 0; i < valorTotalPes.length; i++){
            valorTotalPes[i] = ((pes[i] * p) / 2);
        }

        for (i = 0; i < valorTotalMaos.length; i++){
            valorTotalMaos[i] = ((maos[i] * m) / 2);
        }

        for (i = 0; i < valorTotalPodologia.length; i++){
            valorTotalPodologia[i] = ((podologia[i] * pad) / 2);
        }

        for (i = 0; i < valorTotal.length; i++){
            valorTotal[i] = (valorTotalPodologia[i] + valorTotalPes[i] + valorTotalMaos[i]);
        }

        for (i = 0; i < 5; i++) {
            System.out.println("A " + pessoas[i] + " faturou: " + valorTotal[i]);
        }

    }

}
