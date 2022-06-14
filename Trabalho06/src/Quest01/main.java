package Quest01;

public class main {
    public static void main(String[] args) throws Exception {
        Singleton singleton = Singleton.getSingleton();

        singleton.setIdade("22");
        singleton.setNome("Joao nao sei das quantas");

        System.out.println(singleton);

    }
}
