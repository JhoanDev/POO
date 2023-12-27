public class Fatura {
    private int numeroDeIdentificacao;
    private String descricao;
    private int quantidadeComprada;
    private double precoUnitario;

    public Fatura(int numeroDeIdentificacao, String descricao, int quantidadeComprada, double precoUnitario) {
        this.numeroDeIdentificacao = numeroDeIdentificacao;
        this.descricao = descricao;
        this.quantidadeComprada = quantidadeComprada;
        this.precoUnitario = precoUnitario;
        if (quantidadeComprada < 0)
            this.quantidadeComprada = 0;
        if (precoUnitario < 0)
            this.precoUnitario = 0.0;
    }

    public double calculaTotal() {
        return quantidadeComprada * precoUnitario;
    }

    @Override
    public String toString() {
        return "Fatura [numeroDeIdentificacao=" + numeroDeIdentificacao + ", descricao=" + descricao
                + ", quantidadeComprada=" + quantidadeComprada + ", precoUnitario=" + precoUnitario + "]";
    }
}
