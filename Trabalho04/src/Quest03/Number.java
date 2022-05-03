package Quest03;

import java.util.Objects;

public class Number {
    private Integer inteiro = 7;

    int getValue() {
        return inteiro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Number)) return true;
        Number number = (Number) o;
        return inteiro == number.inteiro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(inteiro);
    }

    @Override
    public String toString() {
        return "Number{" +
                "inteiro=" + inteiro +
                '}';
    }
}
