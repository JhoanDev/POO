import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número de 3 digítos no formato (CDU): ");
        String cdu = scan.nextLine();
        String ucd = cdu.charAt(2) + "" + cdu.charAt(0) + "" + cdu.charAt(1);
        System.out.printf("Seu número no formato (UCD) é: %s\n", ucd);
        scan.close();
    }
}
