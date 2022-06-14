package Quest03.FormasGeometricas;

public class Quadrado extends CriandoFormulas {
    private String criacaoDeFormulas;

    protected  Quadrado(String criacaoDeFormulas) {
        super("Quadrado", "4", "4");
        this.criacaoDeFormulas = criacaoDeFormulas;
    }

    @Override
    public String toString() {
        return super.toString() + this.criacaoDeFormulas;
    }
}
