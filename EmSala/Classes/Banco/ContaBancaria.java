public class ContaBancaria {
    private String nomeCorrentista;
    private double saldo;
    private boolean especial;

    public ContaBancaria(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0.0;
        this.especial = false;
    }

    public ContaBancaria(String nomeCorrentista, double saldo, boolean especial) {
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
        this.especial = especial;
    }

    public String toString() {
        return "Correntista: " + nomeCorrentista + "\nSaldo: " + saldo + "\nEspecial: " + (especial ? "Sim" : "Não")
                + "\n";
    }
}