public class Produto {
    public static int produto(Integer... argumentos) {
        int prod = 1;
        for (Integer arg : argumentos) {
            prod *= arg;
        }
        return prod;
    }
}
