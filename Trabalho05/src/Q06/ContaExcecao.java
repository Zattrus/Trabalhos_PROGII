package Q06;

public class ContaExcecao <LimiteException> {
    private String nome;
    private double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double deposito(double quantidade) {
        try {
            if (quantidade > 0 ) {
                quantidade += saldo;
            }
        }catch (IllegalArgumentException a) {
            System.out.println("Erro!\n" +
                    "Impossivel realizar deposito");
        }
        return quantidade;
    }

    public boolean sacar(double quantidade) throws Exception {
        if (quantidade > saldo) {
            LimiteException limiteException = (LimiteException) "Impossivel realizar saque!";
            throw (Exception) limiteException;
        }
        try {
            if (quantidade > 0) {
                quantidade += saldo;
            }
        }catch (IllegalArgumentException e) {
            System.out.println("Erro!\n" +
                    "Impossivel sacar, sem valor na conta!");
        }
        return true;
    }

    @Override
    public String toString() {
        return "Saldo na conta{" +
                "saldo=" + this.saldo +
                '}';
    }
}
