import java.util.Random;

public class Paciente {
    private String RG;
    private int idade;
    
    Random random = new Random();
    public Paciente() {
        RG = gerarRG(random);
        this.idade = gerarIdade(random, 1, 100);
    }
    
    public int getIdade() {
        return idade;
    }

    public static String gerarRG(Random random) {
        StringBuilder rg = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            rg.append(random.nextInt(10));
            if (i == 2 || i == 5) {
                rg.append(".");
            } else if (i == 8) {
                rg.append("-");
            }
        }
        return rg.toString();
    }

    public static int gerarIdade(Random random, int idadeMinima, int idadeMaxima) {
        return random.nextInt(idadeMaxima - idadeMinima + 1) + idadeMinima;
    }

    @Override
    public String toString() {
        return "Paciente [RG=" + RG + ", idade=" + idade + "]";
    }
}