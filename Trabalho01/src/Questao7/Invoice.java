package Questao7;
public class Invoice {
    private int numItemFaturado;
    private String descricao;
    private int qntdCompradaItem;
    private double precoUnitarioItem;

    //Metodos set para as variaveis:

    public void setNumItemFaturado(int numItemFaturado) {
        this.numItemFaturado = numItemFaturado;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQntdCompradaItem(int qntdCompradaItem) {
        this.qntdCompradaItem = qntdCompradaItem;
    }

    public void setPrecoUnitarioItem(double precoUnitarioItem) {
        this.precoUnitarioItem = precoUnitarioItem;
    }

    // Metodos get para as variaveis:

    public int getNumItemFaturado(){
        return this.numItemFaturado;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public int getQntdCompradaItem(){
        return this.qntdCompradaItem;
    }

    public double getPrecoUnitarioItem(){
        return this.precoUnitarioItem;
    }

    public double getInvoiceAmount(){
        return (this.qntdCompradaItem * this.precoUnitarioItem);
    }

    // Pre definindo o preco e o numero do produto
    public Invoice(){

        this.setNumItemFaturado(7);
        this.setDescricao("Placa de video RTX3080ti");
        this.setPrecoUnitarioItem(15000);

        // Condicao para ver a quantidade de item comprada
        if(qntdCompradaItem < 0) {
            qntdCompradaItem = 0;
        }
        // Condicao para ver o preco unitario do produto
        if(precoUnitarioItem < 0) {
            precoUnitarioItem = 0.0;
        }


    }

}
