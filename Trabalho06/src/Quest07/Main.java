package Quest07;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(new AdaptadorParaSomar());

        System.out.println("=================================");
        cliente.executar();
        System.out.println("=================================");

    }
}
