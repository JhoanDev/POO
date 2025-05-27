import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira a temperatura em °C: ");
        Double celsius = scan.nextDouble();
        Double fehrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("Sua temperatura em °F é: %.4g\n", fehrenheit);

        scan.close();
    }

}
