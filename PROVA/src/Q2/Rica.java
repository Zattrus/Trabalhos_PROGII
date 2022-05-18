package Q2;

public class Rica extends Pessoa{
    private double dinheiro;

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void fazCompras() {
        if(getDinheiro() > 500) {
            System.out.println(super.getNome() + ", Voce pode ir as compras" + "Seu dinheiro e: " + "R$ " + this.dinheiro);
        }else {
            System.out.println(super.getNome() + ", Voce nao pode ir as compras" + "Seu dinheiro e: " + "R$ " + this.dinheiro);
        }
    }
}
