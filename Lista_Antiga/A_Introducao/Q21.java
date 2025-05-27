import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sair = 1;
        int qnt = 0;
        int num = 0;
        while (true) {
            System.out.print("\nVerificar se um número é primo, digite 0 para sair e 1 para continuar: ");
            sair = scan.nextInt();
            System.out.println("");
            if (sair == 0) {
                break;
            }
            System.out.print("Insira o número: ");
            num = scan.nextInt();
            qnt = primo(num, num, qnt);
            if (qnt == 2) {
                System.out.println("O número " + num + " é primo!");
            } else {
                System.out.println("O número " + num + " não é primo!");
            }
            qnt = 0;
        }
        scan.close();
    }

    public static int primo(int num, int divisores, int cont) {
        if (divisores == 0) {
            return cont;
        } else if (num % divisores == 0) {
            return primo(num, divisores - 1, cont + 1);
        } else {
            return primo(num, divisores - 1, cont);
        }
    }
}
