// Escreva uma funcao recursiva que calcule a sequencia dada por:
// F(1) = 1
// F(2) = 2
// F(n) = 2 * F(n - 1) + 3 * F(n - 2)
package Questao3;

import java.util.Scanner;

public class Main {

    public static int FuncRecursiva(int numero){
        if(numero < 2) {
            return numero;
        }else {
            return 2 * FuncRecursiva(numero - 1) +3 * FuncRecursiva(numero - 2);
        }
    }

    public static void main(String[] args) {
        int numero, resultado;
        int i = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        numero = sc.nextInt();

        for (i = 0; i <= numero; i++){
            resultado = FuncRecursiva(i);
            System.out.println("F(" + i + ") = " + resultado);
        }
    }


}


