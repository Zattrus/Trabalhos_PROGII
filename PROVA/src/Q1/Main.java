package Q1;
import Q1.Datas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Datas> data = new ArrayList<Datas>();
        Datas datas = new Datas();
        datas.setDia("18");
        datas.setMes("05");
        datas.setAno("2022");

        data.add(datas);

        System.out.println(datas.toString());

//      Validando se a data é correta
        System.out.println(datas.equals(18,05,2022));

//      Avancando para a dia seguinte
        System.out.println(datas.avancarData());


    }
}
