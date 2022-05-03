package Quest02.CriandoCartoes;

public class DiasDosNamorados extends CartaoWeb {
    @Override
    public String getDestinatario() {
        return super.getDestinatario();
    }

    @Override
    public void showMessage() {
        String nome = getDestinatario();
       System.out.println(nome + ", Feliz dias dos Namorados!!!");
    }
}
