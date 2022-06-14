package Quest02;

public class TesteIncremental {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
//            Incremental incremental = new Incremental();
            Incremental incremental = Incremental.getInstance();
            System.out.println(incremental);
        }
    }
}
//Com o Incremental o programa rodou o for 10 vezes
//Com o metodo Singleton o programa rodou o for 10 vezes, porem com 1 incremento