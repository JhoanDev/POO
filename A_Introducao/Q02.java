import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double[] vet = new Double[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Insira o %dº valor: ", i + 1);
            vet[i] = scan.nextDouble();
        }
        System.out.printf("A soma dos valores é: %g\nA média é: %g\n", (vet[0] + vet[1] + vet[2]),
                (vet[0] + vet[1] + vet[2]) / 3);
        scan.close();
    }
}