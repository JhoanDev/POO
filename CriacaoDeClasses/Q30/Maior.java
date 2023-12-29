public class Maior {

    private static void sort(int[] vet) {
        int i, j, aux;
        for (i = 0; i < vet.length; i++) {
            for (j = 0; j < vet.length - i - 1; j++) {
                if (vet[j] < vet[j + 1]) {
                    aux = vet[j + 1];
                    vet[j + 1] = vet[j];
                    vet[j] = aux;
                }
            }
        }
    }

    private static void sort(double[] vet) {
        int i, j;
        double aux;
        for (i = 0; i < vet.length; i++) {
            for (j = 0; j < vet.length - i - 1; j++) {
                if (vet[j] < vet[j + 1]) {
                    aux = vet[j + 1];
                    vet[j + 1] = vet[j];
                    vet[j] = aux;
                }
            }
        }
    }

    public static int maiorValor(int n1, int n2, int n3, int n4, int n5) {
        int[] vet = {n1, n2, n3, n4, n5};
        sort(vet);
        return vet[0];
    }

    public static int maiorValor(int n1, int n2, int n3, int n4) {
        int[] vet = {n1, n2, n3, n4};
        sort(vet);
        return vet[0];
    }

    public static int maiorValor(int n1, int n2, int n3) {
        int[] vet = {n1, n2, n3};
        sort(vet);
        return vet[0];
    }

    public static int maiorValor(int n1, int n2) {
        return Math.max(n1, n2);
    }

    public static double maiorValor(double n1, double n2, double n3, double n4, double n5) {
        double[] vet = {n1, n2, n3, n4, n5};
        sort(vet);
        return vet[0];
    }

    public static double maiorValor(double n1, double n2, double n3, double n4) {
        double[] vet = {n1, n2, n3, n4};
        sort(vet);
        return vet[0];
    }

    public static double maiorValor(double n1, double n2, double n3) {
        double[] vet = {n1, n2, n3};
        sort(vet);
        return vet[0];
    }

    public static double maiorValor(double n1, double n2) {
        return Math.max(n1, n2);
    }
}
