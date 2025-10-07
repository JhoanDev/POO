package monitoria;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> agenda;

    Agenda() {
        agenda = new ArrayList<>();
    }

    public void adicionaCompromisso(EntradaEmAgenda compromisso){
        agenda.add(compromisso);
    }

    public void listaDia(int dia, int mes, int ano){
        for (EntradaEmAgenda entradaEmAgenda : agenda) {
            if (entradaEmAgenda.ehNoDia(dia, mes, ano)) {
                System.out.println(entradaEmAgenda);
            }
        }
    }
}
