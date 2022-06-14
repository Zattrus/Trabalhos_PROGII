package Quest03.FormasGeometricas;

public class CriandoFormulas {

    private String nome;
    private String lados;
    private String vertices;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLados() {
        return lados;
    }

    public void setLados(String lados) {
        this.lados = lados;
    }

    public String getVertices() {
        return vertices;
    }

    public void setVertices(String vertices) {
        this.vertices = vertices;
    }

    protected CriandoFormulas(String nome, String lados, String vertices) {
        this.nome = nome;
        this.lados = lados;
        this.vertices = vertices;
    }

    @Override
    public String toString() {
        return "Formula Geometrica {" +
                "nome = '" + nome + '\'' +
                ", lados = '" + lados + '\'' +
                ", vertices = '" + vertices + '\'' +
                '}';
    }
}
