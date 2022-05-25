package Q02;

public class CadastroDeEmpregado {
//    private int id;
    private String nome;
    private double salario;
    private String cargo;

    public CadastroDeEmpregado(String nome, double salario, String cargo) {
        super();
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "CadastroDeEmpregado: " +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                ", cargo='" + getCargo() + '\'';
    }
}
