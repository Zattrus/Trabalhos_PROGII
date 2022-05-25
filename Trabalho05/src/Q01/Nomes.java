package Q01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Nomes {
    public static void main(String[] args) {
        Set<String> nomesNaLista = new HashSet<String>();

        Scanner sc = new Scanner(System.in);

        nomesNaLista.add("Pedro");
        nomesNaLista.add("Jose");
        nomesNaLista.add("Roberta");
        nomesNaLista.add("Maria");

        System.out.print("Agora, vamos apresentar as opcoes e voce deve escolher entre 1 a 3\n" +
                "[1], Remover um determinado nome da lista\n" +
                "[2], Verificar se o nome esta na lista\n" +
                "[3], Remover todos os nome da lista\n" +
                "Qual opcao voce quer escolher? ");
        int op = sc.nextInt();


        if (op == 1){
            System.out.println("Qual Nome da lista de nomes voce seja remover?");
            System.out.println(nomesNaLista);
            String deletado = sc.next();
            if(nomesNaLista.contains(deletado)) {
                nomesNaLista.remove(deletado);
                System.out.println("O nome deletado foi " + deletado);
                System.out.println("Sua nova lista de nomes: " + nomesNaLista);
            }else {
                System.out.println("Esse nome nao esta na lista");
            }
        }

        if (op == 2){
            System.out.println("Qual nome deseja verificar na lista?");
            String verifica = sc.next();
            if(nomesNaLista.contains(verifica)) {
                System.out.println("O nome esta na lista");
            }else {
                System.out.println("Esse nome nao esta na lista");
            }
        }

        if (op == 3){
            System.out.println("Zerando os nomes na lista..... Aguarde");
            nomesNaLista.clear();
            System.out.println("Pronto! Lista zerada com sucesso!");
            System.out.println("Sua lista de nomes agora: " + nomesNaLista);
        }
    }
}
