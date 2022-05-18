package Q2;

public abstract class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public int setIdade(int idade) {
        this.idade = idade;
        return idade;
    }

    public String Pessoa() {
        return this.nome + this.idade;
    }

    public int setIdade() {
        return 0;
    }
}
