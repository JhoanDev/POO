import java.util.Scanner;

public class Fatrec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.print("Informe o fatorial que deseja calcular: ");
        int n = scan.nextInt();
        int fat = fatorial(n);
        System.err.println("O fatorial de " + n + " é: " + fat);
        scan.close();
    }

    public static int fatorial(int fat) {
        if (fat == 0) {
            return 1;
        } else {
            return fat * fatorial(fat - 1);
        }
    }
}
