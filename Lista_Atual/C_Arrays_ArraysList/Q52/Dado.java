import java.util.Random;

public class Dado {
    private static final Random randomGenerator = new Random();
    private final int numeroFaces;
    private int valorAtual;


    public Dado() {
        this(6); 
    }

    public Dado(int numeroFaces) {
        if (numeroFaces <= 0) {
            throw new IllegalArgumentException("O número de faces deve ser um valor positivo.");
        }
        this.numeroFaces = numeroFaces;
        lancar();
    }
    public int lancar() {
        this.valorAtual = randomGenerator.nextInt(this.numeroFaces) + 1;
        return this.valorAtual;
    }

    public int getValorAtual() {
        return this.valorAtual;
    }
    
    public int getNumeroFaces() {
        return this.numeroFaces;
    }
}