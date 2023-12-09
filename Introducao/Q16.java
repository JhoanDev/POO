public class Q16 {
    public static void main(String[] args) {
        System.out.println("Todos os números de 3 algarismos cuja soma dos cubos de seus algarismos sejam iguais ao próprio número.\n");
        for (int i = 100; i < 1000; i++) {
            soma_alg(i, algarismos(i));
        }
    }

    public static int[] algarismos(int num) {
        int cdu[] = new int[3];
        int resto;
        int i = 0;
        while (num != 0) {
            resto = num % 10;
            num = num / 10;
            cdu[i] = resto;
            i++;
        }
        return cdu;
    }

    public static void soma_alg(int num, int[] cdu) {
        if (((cdu[2] * cdu[2] * cdu[2]) + (cdu[1] * cdu[1] * cdu[1]) + (cdu[0] * cdu[0] * cdu[0])) == num) {
            System.out.printf("%d = %d^3 + %d^3 + %d^3 = %d + %d + %d\n", num, cdu[2], cdu[1], cdu[0],
                    cdu[2] * cdu[2] * cdu[2], cdu[1] * cdu[1] * cdu[1], cdu[0] * cdu[0] * cdu[0]);
        }
    }
}
