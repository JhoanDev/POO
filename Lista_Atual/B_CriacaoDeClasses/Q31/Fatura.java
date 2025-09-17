package Lista_Atual.B_CriacaoDeClasses.Q31;

public class Fatura {
    private int numeroId;
    private String descricao;
    private int qntComprada;
    private double precoUnd;

    public Fatura(int numeroId, String descricao,
            int qntComprada, double precoUnd) {
        this.numeroId = numeroId;
        this.descricao = descricao;
        this.precoUnd = (precoUnd < 0.0) ? 0.0 : precoUnd;
        this.qntComprada = (qntComprada < 0) ? 0 : qntComprada;
    }

    public double calculaTotal() {
        return this.qntComprada * this.precoUnd;
    }

}
