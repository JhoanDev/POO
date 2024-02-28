
public abstract class Terrestre extends Veiculo {
    private int qntRodas;

    public Terrestre(int capacidade, int qntRodas) {
        super(capacidade);
        this.qntRodas = qntRodas;
    }

    @Override
    public String toString() {
        return super.toString() + ", qntRodas=" + qntRodas;
    }

}