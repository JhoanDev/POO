package Lista_Atual.D_ReusoDeClasses.Q65;

public class Administrativo extends Assistente {
    private String turno;

    public Administrativo(String nome, double salario, String matricula, String turno) {
        super(nome, salario, matricula);
        this.turno = turno;
    }

    public double ganhoAnual() {
        double ganho = 0;

        if (turno == "noite") {
            ganho = (super.getSalario() * 1.10) * 12 + super.getSalario();
        } else {
            ganho = super.getSalario() * 13;
        }
        return ganho;
    }

    @Override
    public String toString() {
        return "Administrativo [turno=" + turno + super.toString() + "]";
    }
    
}
