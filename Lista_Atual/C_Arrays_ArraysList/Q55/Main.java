import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] vetor = {14, 40, 16, 22, 60};
        int aux = 0;
        int i, j;

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 4; j++) {
                if (vetor[j] < vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }

        System.out.println("Estado final do vetor: " + Arrays.toString(vetor));
    }
}