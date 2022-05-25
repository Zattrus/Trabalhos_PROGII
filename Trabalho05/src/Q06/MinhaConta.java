package Q06;

import java.util.Scanner;

public class MinhaConta extends ContaExcecao{
    public double saldo;

    Scanner sc = new Scanner(System.in);
    public int menu() {
        System.out.println("Escolha uma opcao abaixo para realizar as operacoes!\n" +
                "1 - DEPOSITAR\n" +
                "2 - SACAR\n" +
                "3 - EXTRATO DO SALDO\n" +
                "4 - SAIR");
        int operacao = sc.nextInt();
        return operacao;
    }

    public MinhaConta () throws Exception {

        double quantidade;
        int operacao = menu();

        while (true) {

            if (operacao == 1) {
                System.out.println("-------- OPERACAO DE DEPOSITO! --------\n" +
                        "INFORME A QUANTIDADE QUE DESEJA DEPOSITAR");
                int dep = sc.nextInt();
                System.out.println("CONFIRMANDO O DEPOSITO..... \n" +
                        "DEPOSITO REALIZADO COM SUCESSO!");
            }

            if (operacao == 2) {
                try {
                    System.out.println("-------- OPERACAO DE SAQUE! --------\n" +
                            "INFORME A QUANTIDADE QUE DESEJA SACAR");
                    int saq = sc.nextInt();
                    System.out.println("CONFIRMANDO O SAQUE..... \n" +
                            "SAQUE REALIZADO COM SUCESSO!");
                    saldo -= saq;
                } catch (ClassCastException c) {
                    System.out.println("Erro");
                }
            }

            if (operacao == 3) {
                System.out.println("-------- OPERACAO DE EXTRATO! --------\n" +
                        "SEU SALDO E DE R$ " + saldo);
            }

            if (operacao == 4) {
                System.out.println("SAINDO DO SISTEMA");
            }
            break;

        }

    }

    public static void main(String[] args) throws Exception {
        new MinhaConta();
    }
}
