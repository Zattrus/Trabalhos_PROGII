package Quest04;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sanduiches para serem fabricados na lanchonete: ");
        FabricaAbstratc cg = new FabricaDeSanduiches();
        FabricaAbstratc rt = new FabricaDeSanduiches();
        FabricaAbstratc jp = new FabricaDeSanduiches();

        Sanduiches sanduichesUM = cg.FactorySanduiches("Integral", "Prato", "de Frango", "sem verdura");
        Sanduiches sanduichesDOIS = rt.FactorySanduiches("Bola", "Cheddar", "de peru", "sem verdura");
        Sanduiches sanduichesTRES = jp.FactorySanduiches("Fraces", "Mussarela", "de Franfo", "com Verdura");

        System.out.println(sanduichesUM);
        System.out.println(sanduichesDOIS);
        System.out.println(sanduichesTRES);

    }
}
