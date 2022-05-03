package Quest03;

public class main {

    public static void main(String[] args) {
        Number number = new Number();

        number.getValue();
        number.equals(3);
        number.hashCode();
        number.toString();

        // Se eu comparar sem comentar a classe equals, o resultado será true.
        // Se eu comentar a classe equals, o resultado sera false porque os objetos são diferentes.
        System.out.println(number.equals(number.getValue()));

        // Retorna o valor hashing do obj (no meu caso foi 38), caso eu comente o codigo
        // hashCode o resultado sera diferente (1705736037).
        System.out.println(number.hashCode());

        // Traz o resultado com facilidade de compreensão relacionada ao obj da classe (Number{inteiro=7}).
        // Caso eu comente o resultado sera esse (Quest03.Number@26) o "Quest03" sera a pasta onde esta armazenado as classes
        // "Number" nome da classe e o "26" representa um codigo hexa do seu valor hashing.
        System.out.println(number.toString());
    }
}
