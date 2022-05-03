package Quest02.CriandoCartoes;

public class Aniverssario extends CartaoWeb {

    @Override
    public String getDestinatario() {
        return super.getDestinatario();
    }

    @Override
    public void showMessage() {
        String nome = this.getDestinatario();
        System.out.println(nome + ", Feliz Aniverssario!!!");
    }
}
