package Quest02;

import Quest02.CriandoCartoes.Aniverssario;
import Quest02.CriandoCartoes.CartaoWeb;
import Quest02.CriandoCartoes.DiasDosNamorados;
import Quest02.CriandoCartoes.Natal;

import java.util.ArrayList;

public class main {
    public static void main(String[] args){

        ArrayList<CartaoWeb> cartoes  = new ArrayList<>();

        Natal cartaoP1 = new Natal();
        cartaoP1.setDestinatario("Gabriel");

        DiasDosNamorados cartaoP2 = new DiasDosNamorados();
        cartaoP2.setDestinatario("Joana");

        Aniverssario cartaoP3 = new Aniverssario();
        cartaoP3.setDestinatario("Pedro");

        cartoes.add(cartaoP1);
        cartoes.add(cartaoP2);
        cartoes.add(cartaoP3);

        for (CartaoWeb C : cartoes) {
           C.showMessage();
         }
    }
}
