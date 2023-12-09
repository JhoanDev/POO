public class Q15 {
    public static void main(String[] args) {
        int cont = 0;
        int perfeito = 1;
        int divisores = 0;
        while (true) {
            for (int i = 1; i < perfeito; i++) {
                if (perfeito % i == 0) {
                    divisores += i;
                }
            }
            if (divisores == perfeito) {
                cont++;
                System.out.printf("%d° Número perfeito: %d\n",cont, perfeito);
            }
            perfeito++;
            divisores = 0;
            if (cont == 4) {
                break;
            }
        }
    }
}
