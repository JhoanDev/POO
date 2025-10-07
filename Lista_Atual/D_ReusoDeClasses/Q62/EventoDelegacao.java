public class EventoDelegacao {
    private DataHora dataHora;
    private String evento;

    EventoDelegacao(String evento, DataHora dataHora) {
        this.evento = evento;
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return String.format("Evento: %s\t%s", evento, dataHora.toString());
    }
}
