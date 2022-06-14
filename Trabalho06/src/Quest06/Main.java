package Quest06;

import Quest04.FabricaAbstratc;
import Quest04.FabricaDeSanduiches;
import Quest04.Sanduiches;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sanduiches para serem fabricados na lanchonete: ");
        Quest04.FabricaAbstratc cg = new Quest04.FabricaDeSanduiches();
        Quest04.FabricaAbstratc rt = new Quest04.FabricaDeSanduiches();
        FabricaAbstratc jp = new FabricaDeSanduiches();

        Sanduiches sanduichesUM = cg.FactorySanduiches("Integral", "Prato", "de Frango", "sem verdura");
        Sanduiches sanduichesDOIS = rt.FactorySanduiches("Bola", "Cheddar", "de peru", "sem verdura");
        Sanduiches sanduichesTRES = jp.FactorySanduiches("Fraces", "Mussarela", "de Franfo", "com Verdura");

        System.out.println(sanduichesUM);
        System.out.println(sanduichesDOIS);
        System.out.println(sanduichesTRES);

    }
}
