import java.util.UUID;

public class FuncionarioEmp {
    private double salarioPorHora;
    private String nome;
    private UUID id;
    private int idade;

    FuncionarioEmp(String nome) {
        this.nome = nome;
        this.id = UUID.randomUUID();
        this.idade = 18;
        this.salarioPorHora = 2.0;
    }

    FuncionarioEmp(String nome, double salarioPorHora) {
        this.nome = nome;
        this.id = UUID.randomUUID();
        this.idade = 18;
        this.salarioPorHora = salarioPorHora;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    double salarioMensal(int horasQueTrabalhou){
        return salarioPorHora * horasQueTrabalhou;
    }

    @Override
    public String toString() {
        return "FuncionarioEmp [salarioPorHora=" + salarioPorHora + ", nome=" + nome + ", id=" + id + ", idade=" + idade
                + "]";
    }

    
}