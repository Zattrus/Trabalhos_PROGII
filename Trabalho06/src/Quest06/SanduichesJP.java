package Quest06;

import Quest04.Sanduiches;

public class SanduichesJP extends Sanduiches {

    private String fabricandoSanduiches;

    protected SanduichesJP(String fabricacaoDeSanduiche) {
        super("Francês", "Mussarela", "de Frango", "com Verdura");
        this.fabricandoSanduiches = fabricacaoDeSanduiche;

    }

    public String toString() {
        return super.toString() + " - " + this.fabricandoSanduiches;
    }
}
