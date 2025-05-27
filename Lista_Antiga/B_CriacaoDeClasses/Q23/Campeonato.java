public class Campeonato {
    public static void main(String[] args) {
        Time flamengo = new Time("Flamengo");
        Time palmeiras = new Time("Palmeiras");
        Time vasco = new Time("Vasco");
        Time cruzeiro = new Time("Cruzeiro");

        System.out.print("Partida 1\t");
        flamengo.partida(palmeiras);
        System.out.print("Partida 2\t");
        flamengo.partida(vasco);
        System.out.print("Partida 3\t");
        flamengo.partida(cruzeiro);

        System.out.print("Partida 4\t");
        palmeiras.partida(flamengo);
        System.out.print("Partida 5\t");
        palmeiras.partida(vasco);
        System.out.print("Partida 6\t");
        palmeiras.partida(cruzeiro);

        System.out.print("Partida 7\t");
        vasco.partida(flamengo);
        System.out.print("Partida 8\t");
        vasco.partida(palmeiras);
        System.out.print("Partida 9\t");
        vasco.partida(cruzeiro);

        System.out.print("Partida 10\t");
        cruzeiro.partida(flamengo);
        System.out.print("Partida 11\t");
        cruzeiro.partida(palmeiras);
        System.out.print("Partida 12\t");
        cruzeiro.partida(cruzeiro);

        System.out.println("");
        System.out.println(flamengo);
        System.out.println(palmeiras);
        System.out.println(vasco);
        System.out.println(cruzeiro);

    }
}
