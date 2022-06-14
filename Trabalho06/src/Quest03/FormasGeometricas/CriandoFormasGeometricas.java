package Quest03.FormasGeometricas;

public class CriandoFormasGeometricas extends CriandoAbstractFormas{

    public CriandoFormulas FactoryFormaGeometricas(String nome, String lados, String vertices) {
        if (nome.equals("Circulos") && lados.equals(0) && vertices.equals(0)) {
            return new Circulo("Criando circulo.");
        }else if (nome.equals("Triangulo") && lados.equals(3) && vertices.equals(3)) {
            return new Triangulo("Criando triangulo.");
        }else if (nome.equals("Quadrado") && lados.equals(4) && vertices.equals(4)) {
            return new Quadrado("Criando quadrado.");
        }else {
            return new CriandoFormulas(nome, lados, vertices);
        }

    }
}
