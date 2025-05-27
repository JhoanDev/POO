import java.util.Arrays;
import java.util.TreeSet;

public class DemoConjunto {
    public static void main(String[] args) {
        String cores[] = { "branco", "vermelho", "azul", "roxo", "verde", "rosa", "preto", "vermelho" };
        TreeSet<String> conjuntoCores = new TreeSet<String>(Arrays.asList(cores));
        System.out.println("Conjunto de cores: " + conjuntoCores);
        String cor = "rosa";
        System.out.println("Antes de " + cor + " temos " + conjuntoCores.headSet(cor));
        System.out.println("Depois de " + cor + " temos " + conjuntoCores.tailSet(cor));
        System.out.println("Subconjunto entre branco e rosa: " + conjuntoCores.subSet("branco", "rosa"));
        System.out.println("Primeira cor: " + conjuntoCores.first());
        System.out.println("Última cor: " + conjuntoCores.last());
    }
}