package Quest03;

import Quest03.FormasGeometricas.CriandoAbstractFormas;
import Quest03.FormasGeometricas.CriandoFormasGeometricas;
import Quest03.FormasGeometricas.CriandoFormulas;

public class Teste {
    public static void main(String[] args) {

        CriandoAbstractFormas circulo = new CriandoFormasGeometricas();
        CriandoAbstractFormas triangulo = new CriandoFormasGeometricas();
        CriandoAbstractFormas quadrado = new CriandoFormasGeometricas();

        CriandoFormulas circulo1 = circulo.FactoryFormaGeometricas("Circulo", "0", "0");
        CriandoFormulas triangulo1 = triangulo.FactoryFormaGeometricas("Triangulo", "3", "3");
        CriandoFormulas quadrado1 = quadrado.FactoryFormaGeometricas("Quadrado", "4", "4");

        System.out.println(circulo1);
        System.out.println(triangulo1);
        System.out.println(quadrado1);
    }
}
