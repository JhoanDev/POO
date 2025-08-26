package Lista_Atual.A_Introducao;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número de 3 dígitos no formato (CDU): ");
        int CDU = Integer.parseInt(scan.nextLine());
        int U = CDU % 10;
        CDU /= 10;
        int D = CDU % 10;
        CDU /= 10;
        int C = CDU;
        int UCD = U * 100 + C * 10 + D;
        System.out.println("O número no formato (UCD) é: " + UCD);
        scan.close();
    }
}
