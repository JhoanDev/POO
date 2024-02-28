public class Politico extends Pessoap {
    private String partido;

    public Politico(String nome, String cpf, int idade, double altura, String partido) {
        super(nome, cpf, idade, altura);
        this.partido = partido;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += "Partido: " + partido + "\n";
        return str;
    }
}