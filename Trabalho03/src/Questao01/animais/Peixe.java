package Questao01.animais;

public class Peixe extends Animal{
    private String tipoHabitat;

    public Peixe(String nome){
        super(nome);
    }

    public String getTipoHabitat(){
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    public String toString() {
        return super.getNome() + ", " + super.getPeso() + " e " + this.tipoHabitat;
    }
}
