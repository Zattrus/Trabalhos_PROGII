package Q01.Supermercado;

import java.util.Objects;

public class Produtos {
    private int ID;
    private String nome;
    private int preco;
    private String prodIgual;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getProdIgual() {
        return prodIgual;
    }

    public void setProdIgual(String prodIgual) {
        this.prodIgual = prodIgual;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produtos)) return false;
        Produtos produtos = (Produtos) o;
        return ID == produtos.ID && Objects.equals(prodIgual, produtos.prodIgual);
    }

    @Override
    public int hashCode() {
        return this.ID;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "nome=" + getNome() +
                ", ID='" + getID() + '\'' +
                ", preco=" + getPreco() +
                '}';
    }
}
