public class EventoHeranca extends DataHora {

    private String evento;

    EventoHeranca(String evento, String data, String hora) {
        super(data,hora);
        this.evento = evento;
    }

    @Override
    public String toString() {
        return String.format("Evento: %s\t%s", evento, super.toString());
    }
}
