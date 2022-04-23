package Questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String plantas[] = new String[50];
        int estqIdeal[] = new int[50];  // Estouqe ideal.
        int qntdEmEstoque[] = new int[50]; //quantidade em estoque.
        int calcEstoque[]= new int[50];
        int i = 0;

        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 2; i++) {
            System.out.println("Qual é a planta? ");
            plantas[i] = sc.next();

            System.out.println("Qual é a quantidade de estoque atual? ");
            qntdEmEstoque[i] = sc.nextInt();

            System.out.println("Qual e seu estoque ideal: ");
            estqIdeal[i] = sc.nextInt();
        }

        for (i = 0; i < calcEstoque.length; i++){
            calcEstoque[i] =  (estqIdeal[i] - qntdEmEstoque[i]);
        }


        for (i = 0; i < qntdEmEstoque.length; i++) {
            if(qntdEmEstoque[i] < estqIdeal[i]){
                System.out.println("=================================================");
                System.out.println("Seu estoque de " + plantas[i] + ": " + qntdEmEstoque[i]);
                System.out.println("Quantidades de plantas do tipo " + plantas[i] + " que voce precisa comprar: " + calcEstoque[i]);

            }
        }

    }

}
