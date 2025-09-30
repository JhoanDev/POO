package B_CriacaoDeClasses.Q37;

public class Contador {
    private int quantidadeDeEventos;

    public Contador(int quantidadeDeEventos) {
        this.quantidadeDeEventos = quantidadeDeEventos;
    }

    public Contador() {
        this.quantidadeDeEventos = 0;
    }

    public void zerarContador(){
        this.quantidadeDeEventos = 0;
    }

    public void incrementarContador(){
        this.quantidadeDeEventos++;
    }

    public String toString(){
        return ("Contador: " + this.quantidadeDeEventos);
    }

}
