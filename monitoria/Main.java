package monitoria;

public class Main {
    public static void main(String[] args) {
        EntradaEmAgenda compromisso1 = new EntradaEmAgenda(1, 13, 6, 2004, "Aniversario");
        EntradaEmAgenda compromisso2 = new EntradaEmAgenda(3, 15, 6, 2004, "jogar bola");
        Agenda agenda = new Agenda();
        agenda.adicionaCompromisso(compromisso1);
        agenda.adicionaCompromisso(compromisso2);

        agenda.listaDia(13, 6, 2004);
    }
}
