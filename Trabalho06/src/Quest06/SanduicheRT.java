package Quest06;

import Quest04.Sanduiches;

public class SanduicheRT extends Sanduiches {
    private String fabricandoSanduiche;

    protected SanduicheRT(String fabricandoSanduiche) {
        super("Bola", "cheddar", "de Peru", "sem verdura");
        this.fabricandoSanduiche = fabricandoSanduiche;
    }

    public String toString() {
        return super.toString() + this.fabricandoSanduiche;
    }
}
