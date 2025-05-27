public class Prefeito extends Politico {
    private String cidade;

    public Prefeito(String nome, String cpf, int idade, double altura, String partido, String cidade) {
        super(nome, cpf, idade, altura, partido);
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += "Cidade: " + cidade + "\n";
        return str;
    }

}