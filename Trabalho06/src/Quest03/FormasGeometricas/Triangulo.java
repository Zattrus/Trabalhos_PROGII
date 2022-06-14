package Quest03.FormasGeometricas;

public class Triangulo extends CriandoFormulas{
    private String criacaoDeFormulas;

    protected  Triangulo(String criacaoDeFormulas) {
        super("Triangulo", "3", "3");
        this.criacaoDeFormulas = criacaoDeFormulas;
    }

    @Override
    public String toString() {
        return super.toString() + this.criacaoDeFormulas;
    }
}