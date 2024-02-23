public class DemoEvento {
    public static void main(String[] args) {
        EventoDelegacao eventod = new EventoDelegacao("10:00", "13", "11", "2024", "Ecop");
        EventoHeranca eventoe = new EventoHeranca("12:00", "18", "10", "2024", "Maratona SBC");
        System.out.println(eventod);
        System.out.println(eventoe);
    }

}