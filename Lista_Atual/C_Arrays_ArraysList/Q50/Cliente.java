public class Cliente {
    private final int id;
    private final String nome;
    private final int idade;
    private final String telefone;

    public Cliente(int id, String nome, int idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return ("Cliente[id = " + this.id + ", nome = " + this.nome + ", idade = " + this.idade + ", telefone = "
                + this.telefone + "]");
    }
}