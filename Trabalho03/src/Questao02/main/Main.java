package Questao02.main;

import Questao02.pessoas.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Jonathan");
        cliente.setIdade(22);
        cliente.setSexo("Masculino");
        cliente.setValorDivida(2000.47);
        cliente.setAnoNascim(1999);
        System.out.println(cliente.toString());

        Gerente gerente = new Gerente();
        gerente.setNome("Fabio");
        gerente.setIdade(50);
        gerente.setMatricula("1938");
        gerente.setNomeGerente("Gerente Geral de Segurança");
        gerente.setSalario(25000);
        System.out.println(gerente.toString());

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Thiago");
        vendedor.setSalario(1400);
        vendedor.setValorVendas(8000);
        vendedor.setQntVendas(25);
        System.out.println(vendedor.toString());
    }
}
