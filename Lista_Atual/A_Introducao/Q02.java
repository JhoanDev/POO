package Lista_Atual.A_Introducao;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double soma = 0.0;
        for (int i = 0; i < 3; i++) {
            System.out.printf("Insira o %dº valor: ", i + 1);
            soma += Double.parseDouble(scan.nextLine());
        }
        System.out.printf("A soma dos valores é: %g \nA média é: %g \n", soma, soma / 3);
        scan.close();
    }
}
