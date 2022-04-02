package Questao5;

public class Main {
    public static void main(String[] args) {
        int [][] matriz = new int [][]{
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8, 9}
        };
        int largura = matriz.length;
        int altura = matriz[0].length;
        int [][] ret = new int [altura][largura];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++){
                ret[i][j] = matriz[i][j];
                System.out.print("|" + ret[i][j] + "|");
            }
            System.out.println();
        }
        System.out.print("\n");
        funcMatriz(matriz);
    }
    public static int [][] funcMatriz(int[][] matriz) {
        int largura = matriz.length;
        int altura = matriz[0].length;
        int [][] ret = new int [altura][largura];

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++){
                ret[i][j] = matriz[largura - j - 1][i];
                System.out.print("|" + ret[i][j] + "|");
            }
            System.out.println();
        }
        return ret;

    }
}
