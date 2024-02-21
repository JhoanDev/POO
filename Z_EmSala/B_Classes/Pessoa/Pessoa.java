public class Pessoa {
    private String nome;
    private double altura;

    public Pessoa(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome() {
        return "Nome: " + this.nome;
    }

    public void setNome(String novoNome) {
        if (!novoNome.equals(" ")) {
            this.nome = novoNome;
        } else {
            System.out.println("Novo nome inválido!");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double novaAltura) {
        if (novaAltura > 0) {
            this.altura = novaAltura;
        } else {
            System.out.println("Nova altura inválida!");
        }
    }

    public String toString() {
        String res = "";
        res += "Nome: " + this.nome + "\n";
        res += "Altura: " + this.altura + "\n";
        return res;
    }
}