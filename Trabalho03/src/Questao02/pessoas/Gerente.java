package Questao02.pessoas;

public class Gerente extends Empregado{
    private String nomeGerente;

    public String getNomeGerente() {
        return nomeGerente;
    }

    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }

    public double valorINSS() {
        return super.getSalario() * 0.11;
    }

    public String toString() {
        return super.getNome() + ", " + super.getIdade() + " anos"+", " + "Matricula: "+super.getMatricula() + ", " + nomeGerente + " e " +"R$"+valorINSS()+" de INSS";
    }

}
