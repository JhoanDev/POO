public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public Elevador(int andarAtual, int totalAndares, int capacidade, int pessoasPresentes) {
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.pessoasPresentes = pessoasPresentes;
    }

    public void entra() {
        if (capacidade > pessoasPresentes)
            pessoasPresentes++;
        else
            System.out.println("Capacidade máxima atingida!");
    }

    public void sai() {
        if (pessoasPresentes > 0)
            pessoasPresentes--;
        else
            System.out.println("O elevador está vazio!");
    }

    public void sobe(){
        if (totalAndares > andarAtual) 
            andarAtual++;
        else
            System.out.println("Já estamos no ultimo andar!");
    }

    public void desce(){
        if (andarAtual > 0) 
            andarAtual--;
        else
            System.out.println("Já estamos no terreo andar!");
    }

    @Override
    public String toString() {
        return "Elevador [andarAtual=" + andarAtual + ", totalAndares=" + totalAndares + ", capacidade=" + capacidade
                + ", pessoasPresentes=" + pessoasPresentes + "]";
    }
}