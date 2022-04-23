package Questao2;

import Questao1.Grafo;

public class JogoDaVelha {

    private char Campo[][] = new char[3][3];
    int cont;

    // Construtor com o campo vazio
    public JogoDaVelha() {
        for (int i = 0; i < Campo.length; i++) {
            for (int j = 0; j < Campo.length; j++){
                Campo[i][j] = ' ';
            }
        }
    }

    // Metodo para printar o campo
    public void printCampo() {
        int j = 0;
        for(int i = 0; i < Campo.length; i++){
            System.out.print(Campo[i][j] + "|" + Campo[i][j+1] + "|" + Campo[i][j+2]);

            if(i != Campo.length - 1) {
                System.out.println("\n-----");
            }
        }
    }


    // metodo do enum
    public void Game(StatusPlace player, int nLinha, int nColuna) {
        if (Campo[nLinha][nColuna] == 0) {
            if (player == StatusPlace.PLAY1) {
                Campo[nLinha][nColuna] = 1;
            }
            if (player == StatusPlace.PLAY2) {
                Campo[nLinha][nColuna] = 2;
            }
        }
    }

    public int jogada(int nLinha, int nColuna, char play) {
        if (Campo[nLinha][nColuna] == ' ') {
            this.Campo[nLinha][nColuna] = play;
            return 1;
        } else {
            System.out.println("Tente de novo");
            return 0;
        }
    }

    public char ResultDoJogo() {
        for(int i = 0; i < Campo.length; i++) {
            if(Campo[i][0] == Campo[i][1] && Campo[i][0] == Campo[i][2] && Campo[i][0] != ' ') {
                cont++;
                return Campo[i][0];
            }

            if(Campo[0][i] == Campo[1][i] && Campo[0][i] == Campo[2][i] && Campo[0][i] != ' ') {
                cont++;
                return Campo[0][i];
            }

            if (Campo[0][0] == Campo[1][1] && Campo[0][0] == Campo[2][2] && Campo[0][0] != ' '){
                cont++;
                return Campo[0][0];
            }
            if (Campo[2][0] == Campo[1][1] && Campo[2][0] == Campo[0][2] && Campo[2][0] != ' '){
                cont++;
                return Campo[2][0];
            }

            if (cont == 8)
                return 'E';

        }
        cont++;
        return ' ';
    }

}
