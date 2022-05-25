package Q02;

import java.util.*;

public class MapEmpregado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ID;
        Map<String, CadastroDeEmpregado> empregadosMap = new HashMap<String, CadastroDeEmpregado>();

        CadastroDeEmpregado empregado1 = new CadastroDeEmpregado("Steve Jobs", 1300000.00, "Presidente");
        empregadosMap.put("a1234", empregado1);

        CadastroDeEmpregado empregado2 = new CadastroDeEmpregado("Scot McNealy", 780000.00, "Gestor de Empresas");
        empregadosMap.put("a1235", empregado2);

        CadastroDeEmpregado empregado3 = new CadastroDeEmpregado("Jeff Bezos", 7080000.00, "Dono da AMAZON");
        empregadosMap.put("a1236", empregado3);

        CadastroDeEmpregado empregado4 = new CadastroDeEmpregado("Larry Ellison", 4782311.00, "Empresario");
        empregadosMap.put("a1237", empregado4);

        CadastroDeEmpregado empregado5 = new CadastroDeEmpregado("Bill Gates", 9874512000.00, "Dono da Microsoft");
        empregadosMap.put("a1238", empregado5);

        System.out.println("Escolha entre 1 ou 2 para: " +
                "1 - VERIFCAR FUNCIONARIO PELO ID || " +
                "2 - EXIBIR TODOS OS FUNCIONARIOS");
        int leitura = sc.nextInt();

        if(leitura == 1) {
            System.out.println("Qual ID voce deseja procurar");
            ID = sc.next();
            if(empregadosMap.containsKey(ID.toLowerCase())) {
                System.out.println(empregadosMap.get(ID.toLowerCase().toString()));
            }else if(empregadosMap.containsKey(empregadosMap.get(ID.toUpperCase()).toString())) {
                System.out.println(empregadosMap.get(ID.toUpperCase().toString()));
            }else {
                System.out.println("FUNCIONARIO NAO SE ENCONTRA NA BASE DE DADOS");
            }
        }

        if(leitura == 2) {
            Set<String> dados = empregadosMap.keySet();
            System.out.println("EMPRIMINDO OS DADOS\n" +
                    "Aguarde...");
            for (String dado : dados) {
                System.out.println(empregadosMap.get(dado).toString());
            }
        }
    }
}
