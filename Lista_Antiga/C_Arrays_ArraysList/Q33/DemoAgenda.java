public class DemoAgenda {
    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();
        minhaAgenda.adicionarCompromisso("13:20", "13", "06", "2004", "Jogar bola");
        minhaAgenda.adicionarCompromisso("14:50", "14", "06", "2004", "Estudar para banco de dados");
        minhaAgenda.adicionarCompromisso("15:40", "13", "07", "2004", "Estudar para discreta");
        minhaAgenda.adicionarCompromisso("16:30", "13", "06", "2005", "Estudar para POO");
        minhaAgenda.adicionarCompromisso("17:20", "13", "06", "2004", "Jogar FIFA");
        minhaAgenda.listaDia("13", "06", "2004");
    }

}