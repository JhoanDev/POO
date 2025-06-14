package Lista_Atual.D_ReusoDeClasses.Q65;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double aumento){
        this.salario += aumento;
    }

    public double ganhoAnual(){
        return this.salario *13;
    }

    @Override
    public String toString() {
        return ", nome=" + nome + ", salario=" + salario + " ";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
