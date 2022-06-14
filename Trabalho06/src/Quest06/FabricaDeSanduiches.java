package Quest06;

public class FabricaDeSanduiches extends FabricaAbstratc {

    public Object FactorySanduiches(String pao, String salada, String presunto, String queijo) {
        if (pao.equals("Integral") && queijo.equals("Prato") && presunto.equals("de Frango") && salada.equals("sem Verdura")) {
            return new SanduicheCG("Fabricando o sanduiche CG");
        } else if (pao.equals("Bola") && queijo.equals("Cheddar") && presunto.equals("de Peru") && salada.equals("sem Verdura")) {
            return new SanduicheRT("Fabricando o sanduiche RT");
        } else if (pao.equals("Francês") && queijo.equals("Mussarela") && presunto.equals("de Frango") && salada.equals("com Verdura")) {
            return new SanduichesJP("Fabricando o sanduiche JP");
        } else {
            return new Sanduiches(pao, queijo, presunto, salada);
        }
    }
}
