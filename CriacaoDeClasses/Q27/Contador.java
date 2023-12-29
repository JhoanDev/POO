public class Contador {
    private int contagem = 0;

    public void zerar() {
        this.contagem = 0;
    }

    public void incrementar() {
        this.contagem++;
    }
    
    public void imprimirContagem() {
        System.out.println("Contador: " + this.contagem);
    }
}