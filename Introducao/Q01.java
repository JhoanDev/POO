import java.util.Scanner;

public class Q01 {

    public static double quadrado(double l) {
        return l * l;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o lado de um quadrado: ");
        double lado = scan.nextDouble();
        double area = quadrado(lado);
        System.out.printf("A area do quadrado é: %g\n", area);
        scan.close();

    }

}