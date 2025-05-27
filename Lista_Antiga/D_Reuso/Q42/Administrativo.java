
public class Administrativo extends Assistente {
    private boolean turno; // true = dia, false = noite
    private double adicionalNoturno;

    public Administrativo(String nome, double salario, int numMatricula, boolean turno) {
        super(nome, salario, numMatricula);
        this.turno = turno;
        this.adicionalNoturno = turno ? 0 : salario * 0.2;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() + 12*adicionalNoturno;
    }
}