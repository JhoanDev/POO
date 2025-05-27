import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o fatorial que deseja calcular: ");
        int n = scan.nextInt();
        int fat = fatorial(n, n);
        System.out.println("\nO fatorial de " + n + " é: " + fat);
        scan.close();
    }

    public static int fatorial(int fat, int nivelRecursao) {
        if (fat == 0) {
            System.out.println(getRecuo(nivelRecursao) + "0! = 1");
            return 1;
        } else {
            int resultado = fat * fatorial(fat - 1, nivelRecursao - 1);
            System.out.println(getRecuo(nivelRecursao) + fat + "! = " + resultado);
            return resultado;
        }
    }

    private static String getRecuo(int nivelRecursao) {
        StringBuilder recuo = new StringBuilder();
        for (int i = 0; i < nivelRecursao; i++) {
            recuo.append("\t");
        }
        return recuo.toString();
    }
}
