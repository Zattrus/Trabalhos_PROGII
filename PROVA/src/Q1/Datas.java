package Q1;

public class Datas {
    private String dia;
    private String mes;
    private String ano;

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    //Metodo para validar se a data está correta
    public boolean equals(int dia, int mes, int ano) {
        if((dia >= 1 && dia < 30) && (mes >= 1 && mes <= 12) && (ano >= 1950 && ano <= 2050)) {
            return true;
        }else {
            return false;
        }

    }

    //cirar metodo para avançar a data.
    public String avancarData() {
        Integer data = Integer.valueOf(this.getDia());
        data += 1;
        return "Data do dia seguinte: " + data  + "/" + this.mes + "/" + this.ano;
    }
}
