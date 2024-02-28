public abstract class Veiculo {
    private int capacidade;

    public Veiculo(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "capacidade=" + capacidade;
    }

    public abstract void moverFrente();
}