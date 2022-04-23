package Questao2;
import Questao2.JogoDaVelha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        JogoDaVelha jogoDaVelha = new JogoDaVelha();
        Scanner sc = new Scanner(System.in);
        int linha;
        int coluna;
        char jogadorVitorioso;

        do {
            jogoDaVelha.printCampo();
            System.out.print("\nJogador Play 1 digite a linha e a coluna de sua jogada: ");
            linha = sc.nextInt();
            coluna = sc.nextInt();
            jogoDaVelha.jogada(linha, coluna, 'X');

            if (jogoDaVelha.ResultDoJogo() == ' ') {
                System.out.print("Jogador Play 2 digite a linha e a coluna de sua jogada: ");
                linha = sc.nextInt();
                coluna = sc.nextInt();
                jogoDaVelha.jogada(linha, coluna, 'O');
            }
        } while(jogoDaVelha.ResultDoJogo() == ' ');

        jogadorVitorioso = jogoDaVelha.ResultDoJogo();

        if (jogadorVitorioso == 'E') {
            System.out.println("Empate!");
        }else{
            System.out.println("O Campeao da vez e o " + jogadorVitorioso);
        }

        jogoDaVelha.printCampo();
    }

    }
