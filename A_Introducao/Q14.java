import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira quantos termos da série de fibonnaci deseja: ");
        int termos = scan.nextInt();
        if (termos <= 0) {
            System.err.println("[ERRO] insira um valor > 0");
            System.exit(0);
        }
        int ant = 0;
        int atual = 1;
        int aux = 0;
        for (int i = 0; i < termos; i++) {
            System.out.printf("%d° termo: %d\n", i + 1, atual);
            aux = atual;
            atual = fibonnaci(ant, atual);
            ant = aux;
        }
        scan.close();
    }

    private static int fibonnaci(int ant, int atual) {
        return (ant + atual);
    }
}
