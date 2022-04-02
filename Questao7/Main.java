package Questao7;

import java.util.Scanner;

//testando aplicacao Ivoice
public class Main {
    public static void main(String[] args){
        Invoice item = new Invoice();
        Scanner sc = new Scanner(System.in);

        System.out.println("_______________________________");
        System.out.println(item.getDescricao());
        System.out.println("O preco do produto e R$ " + item.getPrecoUnitarioItem());
        System.out.println("_______________________________");
        System.out.println("Quantos itens voce deseja adiquirir? ");
        item.setQntdCompradaItem(sc.nextInt());
        System.out.println("_______________________________");
        System.out.println("O item que voce acabou de faturar e o produto N° " + item.getNumItemFaturado());
        System.out.println("_______________________________");
        System.out.println("O total de sua compra foi no total de R$ " + item.getInvoiceAmount());
        System.out.println("_______________________________");

    }
}