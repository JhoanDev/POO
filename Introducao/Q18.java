import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sair = 1;
        int base = 0;
        int exp = 0;
        while (true) {
            System.out.print("\n\nCalcular potencia, digite 0 para sair e 1 para continuar: ");
            sair = scan.nextInt();
            System.out.println("");

            if (sair == 0) {
                break;
            }
            System.out.print("Digite a base: ");
            base = scan.nextInt();
            System.out.print("Digite um expoente >= 1: ");
            exp = scan.nextInt();
            if (exp < 1) {
                System.err.println("[ERRO], entrada inválida.");
                break;
            }
            System.out.printf("%d^%d = %d", base, exp, potencia(base, exp));
        }
        scan.close();
    }

    private static int potencia(int base, int expoente) {
        if (expoente == 1) {
            return base;
        } else {
            return base * potencia(base, expoente - 1);
        }
    }
}
