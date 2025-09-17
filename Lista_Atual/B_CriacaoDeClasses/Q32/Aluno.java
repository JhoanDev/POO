package Lista_Atual.B_CriacaoDeClasses.Q32;

public class Aluno {
    private int matricula;
    private String nome;
    private double p1;
    private double p2;
    private double t;

    public Aluno(int matricula, String nome, double p1, double p2, double t) {
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.t = t;
    }

    public double media() {
        double mp = (2.5 * this.p1 + 2.5 * this.p2 + 2 * this.t) / 7.0;
        return mp;
    }

    public double provaFinal() {
        double mp = this.media();
        if (mp < 3.0 || mp >= 7.0) {
            return 0;
        }
        double precisa = (50 - 6 * mp) / 4;
        precisa =  Math.ceil(precisa * 10) / 10;
        return precisa;
    }
}

