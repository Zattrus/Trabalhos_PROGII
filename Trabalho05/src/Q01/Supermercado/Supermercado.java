package Q01.Supermercado;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Supermercado {
    public static void main(String[] args) {
        Set<Produtos> produtos = new HashSet<Produtos>();

        System.out.println("Cadastro de Produtos!\n" +
                "Prezado cliente, informe para nos quantos produtos voce deseja cadastra...");
        Scanner leitura = new Scanner(System.in);
        int lendoProdutos = leitura.nextInt();

        String nome = null;
        int id = 0;
        int preco = 0;
        for (int i = 0; i < lendoProdutos; i++) {
            System.out.println("Prezado cliente, informe o dados do produto\n" +
                    "Nome: [" + i + "]: ");
            nome = leitura.next();
            System.out.println("Prezado cliente, informe o dados do produto\n" +
                    "Cod. Produto: [" + i + "]: ");
            id = leitura.nextInt();
            System.out.println("Prezado cliente, informe o dados do produto\n" +
                    "Preco Produto: [" + i + "]: ");
            preco = leitura.nextInt();

            Produtos addProdutos = new Produtos();
            addProdutos.setID(id);
            addProdutos.setNome(nome);
            addProdutos.setPreco(preco);

            if (produtos.contains(addProdutos)) {
                System.out.println("Desculpe, mas esse produto ja esta cadastrado!");
            }else {
                System.out.println("Esse produto nao esta cadastrado!" +
                        "Cadastrando agora...");
                produtos.add(addProdutos);
            }
        }

        for(Produtos produtos1 : produtos) {
           System.out.println(produtos1.toString());
        }
    }
}
