package Lista_Atual.A_Introducao;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o valor do lado do quadrado: ");
        double lado = Double.parseDouble(scan.nextLine());
        System.out.println("A area do quadrado é: " + lado * lado);
        scan.close();
    }
}
