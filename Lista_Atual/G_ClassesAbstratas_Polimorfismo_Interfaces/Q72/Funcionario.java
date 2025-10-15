package Lista_Atual.G_ClassesAbstratas_Polimorfismo_Interfaces.Q72;

public class Funcionario {
    private double salarioPorHorasTrabalhadas;
    private int horasSemanais;
    private String nome;

    Funcionario(String nome) {
        this.nome = nome;
        this.salarioPorHorasTrabalhadas = 2.0;
        this.horasSemanais = 40;
    }

    Funcionario(String nome, int horasSemanais, double salarioPorHorasTrabalhadas) {
        this.nome = nome;
        this.horasSemanais = horasSemanais;
        this.salarioPorHorasTrabalhadas = salarioPorHorasTrabalhadas;
    }

    public double calculaSalarioSemanal() {
        return salarioPorHorasTrabalhadas * horasSemanais;
    }

    public String toString() {
        return String.format("%s\t horas por semana: %d\t valor hora: %.2fR$", nome, horasSemanais,
                salarioPorHorasTrabalhadas);
    }
}
