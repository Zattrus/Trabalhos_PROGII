package Questao02.pessoas;

public class Vendedor extends Empregado {
    private double valorVendas;
    private int qntVendas;

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    public double valorINSS() {
        return super.getSalario() * 0.11;
    }

    public String toString() {
        return super.getNome() + ", " + "R$"+ valorVendas + ", " + qntVendas +  " vendas" + " e " + "R$" + valorINSS() + " do INSS";
    }
}
