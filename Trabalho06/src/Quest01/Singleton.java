package Quest01;

public class Singleton {
    private String nome;
    private String idade;


    private static Singleton singleton = null;

    private Singleton() {

    }

    public static Singleton getSingleton() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "nome= '" + nome + '\'' +
                ", idade= '" + idade + '\'' +
                '}';
    }
}
