package Questao1;
import Questao1.Grafo;

import java.util.List;

public class Main {

    public static void main(String[] args){
        int Vet = 1;
        int Adj = 2;

        Grafo grafo = new Grafo();

        System.out.println("Matriz De Adjacencia ");
        grafo.add_Matriz();

        grafo.op_Vizinhos(Vet, Adj);
        grafo.todos_Vizinhos(Vet);


    }
}
