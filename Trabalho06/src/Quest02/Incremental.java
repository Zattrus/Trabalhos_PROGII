package Quest02;

public class Incremental {
//    private static  int count = 0;
//
//    private int numero;
//    public Incremental() {
//        numero = ++count;
//    }
//    public String toString() {
//        return "Incremental " + numero;
//    }

    private static  int count = 0;
    private int numero;

    public Incremental() {
       numero = ++count;
    }
    private static Incremental incremental = null;

    public static Incremental getInstance() {
        if (incremental == null) {
            incremental = new Incremental();
        }
        return incremental;
    }

    @Override
    public String toString() {
        return "Incremental{" +
                "numero = " + numero +
                '}';
    }
}

