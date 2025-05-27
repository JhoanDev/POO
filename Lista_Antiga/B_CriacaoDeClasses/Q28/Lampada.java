public class Lampada {
    private boolean estadoDaLampada;
    private Contador quantidadeDeVezesAcesa = new Contador();

    public Lampada() {
        this.estadoDaLampada = false;
        this.quantidadeDeVezesAcesa.zerar();
    }

    public void acende() {
        if (estadoDaLampada) {
            System.out.println("A lampada já está acesa.");
        } else {
            this.estadoDaLampada = true;
            this.quantidadeDeVezesAcesa.incrementar();
        }
    }

    public void apaga() {
        if (!estadoDaLampada) {
            System.out.println("A lampada já está apagada.");
        } else {
            this.estadoDaLampada = false;
        }
    }

    public void mostraEstado() {
        System.out.println("Lampada ligada: " + (this.estaLigada() ? "Sim" : "Não"));
    }

    public boolean estaLigada() {
        return this.estadoDaLampada;
    }

    public void vezesAcesa() {
        this.quantidadeDeVezesAcesa.imprimirContagem();
    }

    @Override
    public String toString() {
        return "Lampada [estadoDaLampada=" + (estadoDaLampada ? "Ligada" : "Desligada") + ", quantidadeDeVezesAcesa="
                + quantidadeDeVezesAcesa.getContagem()
                + "]";
    }

}