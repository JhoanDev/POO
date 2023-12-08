import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dia;
        boolean cont;
        do {
            System.out.print("Insira um dia do mês de fevereiro: ");
            dia = scan.nextInt();
            cont = dia >= 1 && dia <= 28;
            if (!cont) {
                System.err.println("[ERRO] Insira um valor entre 1 e 28");
            }
        } while (!cont);
        String diasem = null;
        switch (dia % 7) { // 0 - sábado, 1 - domingo, 2 - segunda, 3 - terça, 4 - quarta, 5 - quinta, 6 - sexta.
            case 0:
                diasem = "Sábado";
                break;
            case 1:
                diasem = "Domingo";
                break;
            case 2:
                diasem = "Segunda-feira";
                break;
            case 3:
                diasem = "Terça-feira";
                break;
            case 4:
                diasem = "Quarta-feira";
                break;
            case 5:
                diasem = "Quinta-feira";
                break;
            case 6:
                diasem = "Sexta-feira";
                break;
            default:
                System.err.println("ERRO");
                break;
        }
        System.out.printf("O dia %d será uma %s.\n", dia, diasem);
        scan.close();
    }
}
