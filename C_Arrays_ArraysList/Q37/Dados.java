import java.util.Random;

public class Dados {

    private static int lancarDado(Random aleatorio) {
        int dadovalor = aleatorio.nextInt(6) + 1;
        return dadovalor;
    }

    public static int somaDosDados(Random aleatorio) {
        int dado1 = Dados.lancarDado(aleatorio);
        int dado2 = Dados.lancarDado(aleatorio);
        return dado1 + dado2;
    }

}