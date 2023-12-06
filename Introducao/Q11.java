import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o x do primeiro ponto: ");
        double x1 = scan.nextDouble();
        System.out.print("Insira o y do primeiro ponto: ");
        double y1 = scan.nextDouble();
        System.out.print("Insira o x do Segundo ponto: ");
        double x2 = scan.nextDouble();
        System.out.print("Insira o y do Segundo ponto: ");
        double y2 = scan.nextDouble();
        System.out.printf("P1 (%g||%g)\n", x1, y1);
        System.out.printf("P2 (%g||%g)\n", x2, y2);
        if (x2 > x1) {
            System.out.print("O ponto está a direita");
            if (y2 > y1) {
                System.out.print(" e acima");
            } else if (y2 < y1) {
                System.out.print(" e abaixo");
            }
            System.out.println(" do primeiro ponto.");
        } else if (x2 < x1) {
            System.out.print("O ponto está a esquerda");
            if (y2 > y1) {
                System.out.print(" e acima");
            } else if (y2 < y1) {
                System.out.print(" e abaixo");
            }
            System.out.println(" do primeiro ponto.");
        } else {
            if (y2 > y1) {
                System.out.print("O ponto está acima do primeiro ponto.");
            } else if (y2 < y1) {
                System.out.print("O ponto está abaixo do primeiro ponto.");
            } else {
                System.out.print("O ponto está exatamente no mesmo local do primeiro ponto.");
            }
            System.err.println("");
        }
        scan.close();
    }
}
