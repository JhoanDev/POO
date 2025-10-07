public class Equipamento {

    private float preco;
    private int anosDeGarantia;

    Equipamento(float preco, int anosDeGarantia) {

        this.preco = preco;
        this.anosDeGarantia = anosDeGarantia;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;

    }

    public int getAnosDeGarantia() {
        return anosDeGarantia;
    }

    public void setAnosDeGarantia(int anosDeGarantia) {
        this.anosDeGarantia = anosDeGarantia;

    }

    @Override
    public String toString() {
        return String.format("Preco: %f\tGarantia: %d Anos\n", preco, anosDeGarantia);
    }
}