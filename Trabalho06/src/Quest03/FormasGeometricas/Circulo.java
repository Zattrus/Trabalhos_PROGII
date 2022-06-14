package Quest03.FormasGeometricas;

public class Circulo extends CriandoFormulas {
    private String criacaoDeFormulas;

    protected  Circulo(String criacaoDeFormulas) {
        super("Quadrado", "0", "0");
        this.criacaoDeFormulas = criacaoDeFormulas;
    }

    @Override
    public String toString() {
        return super.toString() + this.criacaoDeFormulas;
    }
}
