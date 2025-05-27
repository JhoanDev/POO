public class Automovel {
    protected int ano;
    protected String modelo;
    protected String cor;

    public Automovel(int ano, String modelo, String cor) {
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
    }

    

    public int getAno() {
        return ano;
    }



    public String getModelo() {
        return modelo;
    }



    public String getCor() {
        return cor;
    }



    public double quantoCusta(){
        return 10*ano*ano;
    }
    
}