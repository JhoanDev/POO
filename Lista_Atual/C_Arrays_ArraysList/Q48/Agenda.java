import java.util.ArrayList;

public class Agenda {
    private final ArrayList<EntradaEmAgenda> compromissos;

    public Agenda() {
        this.compromissos = new ArrayList<>();
    }

    public void adicionaCompromisso(EntradaEmAgenda compromisso) {
        compromissos.add(compromisso);
    }

    public void listaDia(int dia, int mes, int ano) {
        for (EntradaEmAgenda compromisso : compromissos) {
            if(compromisso.ehNoDia(dia, mes, ano)) System.out.println(compromisso);
        }
    }
}
