package Quest07;

import java.util.List;

public class SomadorExistente {
    public int somadorLista(List<Integer> lista) {
        int resultado = 0;
        for (int i : lista)
            resultado += i;
        return resultado;
    }
}
