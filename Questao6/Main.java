//Descreva em no maximo 200 palavras o que e um automovel e o que ele faz. Liste
//os substantivos e verbos separadamente. Cada substantivo corresponde a um objeto que precisara ser
//construindo para implementar um sistema, nesse caso, um carro. Selecione 5 dos objetos que voce listou
//e, para cada um, liste varios atributos e comportamentos. Descreva brevemente como esses objetos
//interagem entre si e com outros objetos na sua descricao. Estes passos que voce seguiu sao topicos do
//projeto orientado a objetos.
package Questao6;

public class Main {
    public static void main(String[] args){
        // O que é um automóvel?
        // Automóvel ou carro é um veículo motorizado que pode *ligar e desligar, *acelerar e freiar,
        // eles usam rodas para transporte.
        // A maioria das definições de carro diz que eles correm basicamente em estradas,
        // acomodam de uma a oito pessoas, têm quatro pneus e,
        // principalmente, transportam pessoas em vez de mercadorias,
        // Em relacao a *precos, pode sofrer variacao dependendo da *marca do carro.

        // Palavras reservadas para construção do sistema:
        // Preco, ligar, Marca, acelerar, freiar;
        Carro c1Carro = new Carro();
        c1Carro.marca = "Peugeot";
        c1Carro.preco = 37000;

        // Apresentando a marca preco e cor cor carro c1
        System.out.println("A marca do carro e " + c1Carro.marca + " e tem um valor de R$" + c1Carro.preco);


        //Ligando o carro c1
        c1Carro.ligar();
        System.out.println(c1Carro.marca + c1Carro.estaLigado());


        // Acelerando o carro c1
        c1Carro.acelerar();
        System.out.println(c1Carro.marca + c1Carro.estaAcelerando());

        // Freiando o carro c1
        c1Carro.freiar();
        System.out.println(c1Carro.marca + c1Carro.estaFreiando());

        //Desligando o carro c1
        c1Carro.desligar();
        System.out.println(c1Carro.marca + c1Carro.estaLigado());


    }

}
