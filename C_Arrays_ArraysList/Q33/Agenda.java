import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> compromissos;

    public Agenda() {
        this.compromissos = new ArrayList<>();
    }

    public void adicionarCompromisso(String hora, String dia, String mes, String ano, String assunto) {
        EntradaEmAgenda compromisso = new EntradaEmAgenda(hora, dia, mes, ano, assunto);
        compromissos.add(compromisso);
    }

    public void listaDia(String dia, String mes, String ano) {
        for (EntradaEmAgenda compromisso : compromissos) {
            if (compromisso.ehNoDia(dia, mes, ano)) {
                System.out.println(compromisso);
            }
        }
    }
}