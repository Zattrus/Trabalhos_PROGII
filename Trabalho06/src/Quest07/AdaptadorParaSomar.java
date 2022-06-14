package Quest07;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorParaSomar implements SomadorEsperado {

    private static SomadorExistente somador = new SomadorExistente();

    public int somaVetor(int[] vetor) {
        List<Integer> lista = new ArrayList<Integer>();

        for (int i = 0; i < vetor.length; i++) {
            lista.add(vetor[i]);
        }

        return somador.somadorLista(lista);
    }
}
