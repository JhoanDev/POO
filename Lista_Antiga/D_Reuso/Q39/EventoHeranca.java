public class EventoHeranca extends DataHora {
    private String evento;

    public EventoHeranca(String hora, String dia, String mes, String ano, String evento) {
        super(hora, dia, mes, ano);
        this.evento = evento;
    }

    public String toString() {
        return "Evento: " + evento + "\nData: " + super.toString() + "\n";
    }
}