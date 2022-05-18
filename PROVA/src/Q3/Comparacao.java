package Q3;
import Q2.Pessoa;

import java.util.Objects;

public class Comparacao implements Comparavel {

    Pessoa pessoa = new Pessoa() {
        @Override
        public int getIdade() {
            return super.getIdade();
        }
    };

    @Override
    public boolean comparar(Object o, Object a) {
        Integer p1 = pessoa.setIdade(17);
        Integer p2 = pessoa.setIdade(18);
        //Comparando se a p1 e igual a p2, caso a p1 tiver a idade de 17 e a p2 18 o retorno e false.
        if(p1 == p2) {
            return true;
        } else {
            return false;
        }

    }

    //Testando se a pessoa1 e igual a pessoa2
    public static void main(String[] args) {
        Comparacao comparacao = new Comparacao();
        Pessoa pessoa = new Pessoa() {};

        Pessoa pessoa1 = new Pessoa() {};

        System.out.println(comparacao.comparar(pessoa, pessoa1));
    }
}
