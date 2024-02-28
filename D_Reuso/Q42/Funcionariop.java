public class Funcionariop {
    private String nome;
    private double salario;

    
    public Funcionariop(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(float valor) {
        salario += valor;
    }

    public double ganhoAnual() {
        return salario * 13;
    }

    @Override
    public String toString() {
        String str = "";
        str += "Nome: " + nome + "\n";
        str += "Salario: " + salario + "\n";
        return str;
    }
}