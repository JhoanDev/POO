import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] v = {3, 7, 2, 3, 10};
        int index, aux, i, j;

        System.out.println("Array inicial: " + Arrays.toString(v));

        for (i = 0; i <= 3; i++) {
            index = i;
            for (j = i + 1; j <= 4; j++) {
                if (v[j] < v[index]) {
                    index = j;
                }
            }
            if (index != i) {
                aux = v[index];
                v[index] = v[i];
                v[i] = aux;
            }
        }

        System.out.println("Array final: " + Arrays.toString(v));
    }
}