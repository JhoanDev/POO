import java.util.ArrayDeque;

public class Consultorio {
    static ArrayDeque<Paciente> filaPrioritaria = new ArrayDeque<>();
    static ArrayDeque<Paciente> filaComum = new ArrayDeque<>();
    static int max_pacientes = 0;

    public static void main(String[] args) {

        int tempoAtual = 0;
        adicionaAFila();
        for (tempoAtual = 1; tempoAtual <= 100; tempoAtual++) {
            if (tempoAtual % 4 == 0 && max_pacientes < 20) {
                adicionaAFila();
            }
            if (tempoAtual % 5 == 0)
                atende();

        }
    }

    public static void adicionaAFila() {
        Paciente novo = new Paciente();
        if (novo.getIdade() > 60) {
            filaPrioritaria.add(novo);
            System.out.println("Paciente " + ++max_pacientes + " foi adicionado a fila prioritaria");
        } else {
            filaComum.add(novo);
            System.out.println("Paciente " + ++max_pacientes + " foi adicionado a fila comum");
        }
    }

    public static void atende() {
        if (!filaPrioritaria.isEmpty())
            System.out.println("Atendido da prioritaria: " + filaPrioritaria.removeFirst());
        else if (!filaComum.isEmpty())
            System.out.println("Atendido da comum: " + filaComum.removeFirst());
        else
            System.out.println("Filas vazias!");
    }
}
