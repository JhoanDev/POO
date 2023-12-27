import java.util.Scanner;

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
        if (p1 < 0.0)
            p1 = 0.0;
        if (p2 < 0.0)
            p2 = 0.0;
        if (t < 0.0)
            t = 0.0;
    }

    public double media() {
        return (((2.5 * p1) + (2.5 * p2) + (2 * t)) / 7);
    }

    public double provaFinal() {
        double mp = media();
        if (mp < 3 || mp >= 7) {
            return 0;
        } else {
            Scanner scan = new Scanner(System.in);
            System.out.println("Aluno na prova final!\n");
            System.out.println("Insira a nota do aluno no EF: ");
            double ef = scan.nextDouble();
            scan.close();
            return ((mp * 6) + (ef * 4)) / 10;
        }
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nome=" + nome + ", p1=" + p1 + ", p2=" + p2 + ", t=" + t + "]";
    }
}
