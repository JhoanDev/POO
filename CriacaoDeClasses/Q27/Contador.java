public class Contador {
    private int contagem = 0;

    public void zerar() {
        this.contagem = 0;
    }

    public void incrementar() {
        this.contagem++;
    }

    public int getContagem() {
        return this.contagem;
    }

    public void imprimirContagem() {
        System.out.println("Contador: " + getContagem());
    }
}