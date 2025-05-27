public class Governador extends Politico {
    private String estado;

    public Governador(String nome, String cpf, int idade, double altura, String partido, String estado) {
        super(nome, cpf, idade, altura, partido);
        this.estado = estado;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += "Estado: " + estado + "\n";
        return str;
    }

}