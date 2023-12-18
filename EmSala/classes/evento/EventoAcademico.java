package EmSala.classes.evento;

public class EventoAcademico {
    String nomeDoEvento;
    String localDoEvento;
    int numeroDeParticipantes;

    EventoAcademico(String nomeDoEvento, String localDoEvento, int numeroDeParticipantes){
        this.nomeDoEvento = nomeDoEvento;
        this.localDoEvento = localDoEvento;
        this.numeroDeParticipantes = numeroDeParticipantes;
    }

    void mostrarEvento(){
        System.out.println("Nome do evento: " + nomeDoEvento);
        System.out.println("Local do evento: " + localDoEvento);
        System.out.println("Número de participantes: " + numeroDeParticipantes);
    }
}
