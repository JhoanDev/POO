import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("||                     ||");
        System.out.println("||     MEGA - SENA     ||");
        System.out.println("||                     ||");
        System.out.println("=========================\n");

        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < 11; j++) {
                if (j < 10 && i == 0) {
                    System.out.printf("[0%d]", j + i * 10);
                } else {
                    System.out.printf("[%d]", j + i * 10);
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Insira quantos jogos deseja fazer");
        System.out.println("[ 1] [ 2] [ 3]");
        int qntjogos = 0;
        while (true) {
            if (scan.hasNextInt()) {
                qntjogos = scan.nextInt();
                if (qntjogos >= 1 && qntjogos <= 3) {
                    break;
                } else {
                    System.out.println("Por favor, insira um número entre 1 e 3.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                scan.next();
            }
        }
        System.out.println("");
        int[][] numerosJogos = new int[qntjogos][];

        for (int i = 0; i < qntjogos; i++) {
            System.out.println("Insira quantos números estará marcando no jogo " + (i + 1));
            System.out.println("[ 6] [ 7] [ 8] [ 9] [10] [11] [12] [13] [14] [15]");
            while (true) {
                if (scan.hasNextInt()) {
                    int qntNumeros = scan.nextInt();
                    if (qntNumeros >= 6 && qntNumeros <= 15) {
                        numerosJogos[i] = new int[qntNumeros];
                        break;
                    } else {
                        System.out.println("Por favor, insira um número entre 6 e 15.");
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, insira um número válido.");
                    scan.next();
                }
            }
            System.out.println("");
            System.out.println("Insira os números do jogo " + (i + 1));
            for (int j = 0; j < numerosJogos[i].length; j++) {
                System.out.print("Insira o " + (j + 1) + "° número: ");
                while (true) {
                    if (scan.hasNextInt()) {
                        int numero = scan.nextInt();
                        if (numero >= 1 && numero <= 60 && !contains(numerosJogos[i], numero)) {
                            numerosJogos[i][j] = numero;
                            break;
                        } else if (contains(numerosJogos[i], numero)) {
                            System.out.println("Número repetido. Por favor, insira um número diferente.");
                        } else {
                            System.out.println("Por favor, insira um número entre 1 e 60.");
                        }
                    } else {
                        System.out.println("Entrada inválida. Por favor, insira um número válido.");
                        scan.next();
                    }
                }
            }
        }
        int[] numerosSorteados = sortearNumeros(6);
        System.out.println("");
        System.out.println("Números sorteados: " + Arrays.toString(numerosSorteados));
        for (int i = 0; i < qntjogos; i++) {
            System.out.println("Números do usuário no jogo " + (i + 1) + ": " + Arrays.toString(numerosJogos[i]));
            int numerosCorretos = contarNumerosCorretos(numerosJogos[i], numerosSorteados);
            System.out.println("Números corretos no jogo " + (i + 1) + ": " + numerosCorretos);
            System.out.println("");
        }

        scan.close();
    }

    private static boolean contains(int[] array, int element) {
        for (int num : array) {
            if (num == element) {
                return true;
            }
        }
        return false;
    }

    private static int[] sortearNumeros(int quantidade) {
        Random random = new Random();
        int[] numerosSorteados = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            int numero;
            do {
                numero = random.nextInt(60) + 1;
            } while (contains(numerosSorteados, numero));
            numerosSorteados[i] = numero;
        }
        return numerosSorteados;
    }

    private static int contarNumerosCorretos(int[] numerosUsuario, int[] numerosSorteados) {
        int count = 0;
        for (int numero : numerosUsuario) {
            if (contains(numerosSorteados, numero)) {
                count++;
            }
        }
        return count;
    }
}
