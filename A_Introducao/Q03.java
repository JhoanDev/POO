import java.util.Scanner;

import java.lang.Math;

public class Q03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um angulo em graus: ");
        double graus = scan.nextDouble();
        double rad = Math.toRadians(graus);
        double seno = Math.sin(rad);
        double cosseno = Math.cos(rad);
        double tangente = seno / cosseno;
        double cossecante = 1 / seno;
        double secante = 1 / cosseno;
        double cotangente = 1 / tangente;
        System.out.printf(
                "Graus: %g°\nRadianos: %g\nSeno:%g\nCosseno: %g\nTangente: %g\nCossecante: %g\nSecante: %g\nCotangente: %g\n",
                graus, rad, seno, cosseno, tangente, cossecante, secante, cotangente);

        scan.close();
    }
}
