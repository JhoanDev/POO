public class AutomovelDeLuxo extends AutomovelBasico {
    private boolean arCondicionado;
    private boolean direcaoHidraulica;

    public AutomovelDeLuxo(int ano, String modelo, String cor, boolean airbag, boolean radio, boolean arCondicionado,
            boolean direcaoHidraulica) {
        super(ano, modelo, cor, airbag, radio);
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
    }

    @Override
    public double quantoCusta() {
        double custo = super.quantoCusta();
        if (arCondicionado)
            custo += 10000;
        if (direcaoHidraulica)
            custo += 2000;
        return custo;
    }

    @Override
    public String toString() {
        return "ano=" + ano + ", modelo=" + modelo + ", cor=" + cor + ", airBag=" + this.isAirbag() + ", radio="
                + this.isRadio() + ", arCondicionado=" + arCondicionado + ", direcaoHidraulica=" + direcaoHidraulica;
    }

}