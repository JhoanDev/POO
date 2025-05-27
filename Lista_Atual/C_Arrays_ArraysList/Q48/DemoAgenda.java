
public class DemoAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionaCompromisso(new EntradaEmAgenda("08:30", 13, 06, 2025, "Meu aniversario"));
        agenda.adicionaCompromisso(new EntradaEmAgenda("20:30", 13, 06, 2025, "Dormir depois do aniversario"));

        agenda.listaDia(13, 06, 2025);

    }
}
