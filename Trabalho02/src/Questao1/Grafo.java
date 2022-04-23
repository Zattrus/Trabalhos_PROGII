package Questao1;

public class Grafo {

    public static int[][] matriz;


    public void add_Matriz() {
        matriz = new int[][]{
                {0, 1, 0, 0, 1},
                {1, 0, 1, 1, 1},
                {0, 1, 0, 1, 0},
                {0, 1, 1, 0, 1},
                {1, 1, 0, 1, 0}
        };
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++)
                System.out.print(matriz[i][j]);
                System.out.print("\n");
            }
            System.out.print("\n");
        }

        public void op_Vizinhos(int Vet, int Adj) {
            if(matriz[Vet][Adj] != 0) {
                System.out.println("Vertice " + Vet + " e Adjacente com " + Adj);
            }else {
                if (matriz[Vet][Adj] == 0){
                    System.out.println("\n O verticeis nao possui adjacencia!");
                }
            }
        }

        public void todos_Vizinhos(int Vet) {
            for (int i =0; i < 5; i++) {
                if (matriz[i][Vet] != 0 ) {
                    System.out.println("" + i + "");
                    System.out.print("");
                }
            }
        }
    }

