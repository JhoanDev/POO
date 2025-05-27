import java.util.Scanner;

public class Q20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sair = 1;
        int n1;
        int n2;
        while (true) {
            System.out.print("\n\nCalcular mdc de dois números, digite 0 para sair e 1 para continuar: ");
            sair = scan.nextInt();
            System.out.println("");
            if (sair == 0) {
                break;
            }
            System.out.print("Digite o primeiro número: ");
            n1 = scan.nextInt();
            System.out.print("Digite o segundo número: ");
            n2 = scan.nextInt();
            System.out.printf("mdc de %d e %d é: %d", n1, n2, mdc(n1, n2));
        }
        scan.close();
    }

    public static int mdc(int m, int n) {
        if (n > m) {
            return mdc(n, m);
        } else if (n == 0) {
            return m;
        } else {
            return mdc(n, m % n);
        }
    }
}