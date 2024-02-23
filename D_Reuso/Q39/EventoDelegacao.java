public class EventoDelegacao {
    private String evento;
    private DataHora dataHora;

    public EventoDelegacao(String hora, String dia, String mes, String ano, String evento) {
        this.evento = evento;
        this.dataHora = new DataHora(hora, dia, mes, ano);
    }

    public String toString() {
        return "Evento: " + evento + "\nData: " + dataHora.toString() + "\n";
    }
}