public class Main {
    public static void main(String[] args) {
        DataHora dataHora = new DataHora("13/06/2025", "12:45");
        EventoDelegacao eventoDelegacao = new EventoDelegacao("Aniversário", dataHora);
        EventoHeranca eventoHeranca = new EventoHeranca("Jogar bola", "17/11/2025", "18:30");

        System.out.println(eventoDelegacao);
        System.out.println(eventoHeranca);
    }
}
