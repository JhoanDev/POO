public class ElevadorTest {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(0, 5, 5, 0);

        System.out.println("Estado inicial do elevador:");
        System.out.println(elevador);

        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra(); 
        elevador.entra();

        System.out.println("\nEstado após algumas pessoas entrarem:");
        System.out.println(elevador);

        elevador.sai();
        elevador.sai();
        elevador.sai();
        elevador.sai();
        elevador.sai(); // O elevador está vazio
        elevador.sai();

        System.out.println("\nEstado após algumas pessoas saírem:");
        System.out.println(elevador);

        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe(); // maximo andar
        elevador.desce();
        elevador.desce();
        elevador.desce();
        elevador.desce();
        elevador.desce(); 
        elevador.desce(); // terreo andar

        System.out.println("\nEstado após algumas operações de subir e descer:");
        System.out.println(elevador);
    }
}
