import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Consultorio {
    public static void main(String[] args) {
        PriorityQueue<Paciente> filaPrioritaria = new PriorityQueue<>((a, b) -> b.getIdade() - a.getIdade());
        Queue<Paciente> filaComum = new LinkedList<>();
        int tempoAtual = 0;
        int tempoUltimaPaciente = 0;
        int max_Atendimentos = 20;
        int atendimentos_atuais = 0;

        while (atendimentos_atuais < max_Atendimentos) {
            if (tempoAtual - 4 >= tempoUltimaPaciente) {
                Paciente novo = new Paciente();
                if (novo.getIdade() > 60) {
                    filaPrioritaria.offer(novo);
                    System.out.println("Paciente prioritário adicionado à fila: " + novo);
                } else {
                    filaComum.offer(novo);
                    System.out.println("Paciente comum adicionado à fila: " + novo);
                }
                tempoUltimaPaciente += 4;
            }

            if (!filaPrioritaria.isEmpty()) {
                System.out.println("Paciente prioritário atendido: " + filaPrioritaria.poll());
                atendimentos_atuais++;
                tempoAtual += 5;
                if (tempoAtual - 4 >= tempoUltimaPaciente && atendimentos_atuais < max_Atendimentos) {
                    Paciente novo = new Paciente();
                  if (novo.getIdade() > 60) {
                        filaPrioritaria.offer(novo);
                        System.out.println("Paciente prioritário adicionado à fila: " + novo);
                    } else {
                        filaComum.offer(novo);
                        System.out.println("Paciente comum adicionado à fila: " + novo);
                    }
                    tempoUltimaPaciente += 4;
                }

            } else if (!filaComum.isEmpty()) {
                System.out.println("Paciente comum atendido: " + filaComum.poll());
                atendimentos_atuais++;
                tempoAtual += 5;
                if (tempoAtual - 4 >= tempoUltimaPaciente && atendimentos_atuais < max_Atendimentos) {
                    Paciente novo = new Paciente();
                    if (novo.getIdade() > 60) {
                        filaPrioritaria.offer(novo);
                        System.out.println("Paciente prioritário adicionado à fila: " + novo);
                    } else {
                        filaComum.offer(novo);
                        System.out.println("Paciente comum adicionado à fila: " + novo);
                    }
                    tempoUltimaPaciente += 4;
                }
            } else {
                tempoAtual++;
            }
        }
    }
}
