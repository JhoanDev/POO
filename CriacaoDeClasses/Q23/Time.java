import java.util.Random;

public class Time {
    String nome;
    int vitorias;
    int derrotas;
    int empates;
    int pontos;
    int saldo;

    Time(String nome) {
        this.nome = nome;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
        this.pontos = 0;
        this.saldo = 0;
    }

    void partida(Time b) {
        Random geradorAleatorio = new Random();
        int golsA = geradorAleatorio.nextInt(6);
        int golsB = geradorAleatorio.nextInt(6);
        if (golsA > golsB) {
            this.vitorias++;
            this.pontos += 3;
            b.derrotas++;
            this.saldo += golsA - golsB;
            b.saldo -= golsA - golsB;
        } else if (golsA < golsB) {
            this.derrotas++;
            b.pontos += 3;
            b.vitorias++;
            this.saldo -= golsB - golsA;
            b.saldo += golsB - golsA;
        } else {
            this.empates++;
            this.pontos++;
            b.empates++;
            b.pontos++;
        }
        System.out.printf("%s %dx%d %s\n", this.nome, golsA, golsB, b.nome);
    }

    public String toString() {
        return String.format("Nome:%s\tPontos:%d\tVitórias:%d\tDerrotas:%d\tEmpates:%d\tSaldo:%d",
                nome, pontos, vitorias, derrotas, empates, saldo);
    }
}
