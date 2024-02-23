public class Produto {
    public static int produto(int... valores) {
        int res = 1;
        for (int valor : valores) {
            res *= valor;
        }
        return res;
    }
}