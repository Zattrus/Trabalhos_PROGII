package Questao02.pessoas;

public class Cliente extends Pessoa{
    private double valorDivida;
    private int anoNascim;

    public double getValorDivida() {
        return valorDivida;
    }
    public void setValorDivida(double valorDivida) {

        this.valorDivida = valorDivida;
    }

    public int getAnoNascim() {
        return anoNascim;
    }
    public void setAnoNascim(int anoNascim) {
        this.anoNascim = anoNascim;
    }

    public String toString() {
        return super.getNome() + ", " + super.getIdade() +" anos"+ ", " + super.getSexo() + ", " + "R$" + valorDivida + " de divida" + " e " + "Nasceu em " + anoNascim;
    }
}
