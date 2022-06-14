package Quest04;

public class SanduicheCG extends Sanduiches {
    private String fabricandoSanduiche;

    protected SanduicheCG(String fabricandoSanduiche) {
        super("Integral", "Prato", "de Frango", "sem Verdura");
        this.fabricandoSanduiche = fabricandoSanduiche;
    }

    public String toString() {
        return super.toString() + this.fabricandoSanduiche;
    }
}
