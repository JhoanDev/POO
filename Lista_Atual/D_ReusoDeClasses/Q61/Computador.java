
public class Computador extends Equipamento {
    private String marca;
    private String cor;

    Computador(float preco, int garantia, String marca, String cor) {
        super(preco, garantia);
        this.marca = marca;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString(){
        String res = super.toString();
        res += String.format("Marca: %s\tCor:%s", marca, cor);
        return res;
    }
}
