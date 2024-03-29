import java.util.Scanner;

public class DemoExtrato {
    public static void main(String[] args) {
        int op;
        double valor;
        Extrato extrato = new Extrato();
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("1 - Deposito");
            System.out.println("2 - Saque");
            System.out.println("3 - Visualizar Extrato");
            System.out.println("4 - Encerrar");
            op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Opção escolhida: Deposito");
                    System.out.print("Valor do deposito: ");
                    valor = scan.nextDouble();
                    extrato.deposito(valor);
                    break;
                case 2:
                    System.out.println("Opção escolhida: Saque");
                    System.out.print("Valor do saque: ");
                    valor = scan.nextDouble();
                    extrato.saque(valor);
                    break;
                case 3:
                    System.out.println("Opção escolhida: Vizualizar Extrato");
                    extrato.vizualizarExtrato();
                    break;
                case 4:
                    System.out.println("Opção escolhida: Encerrar");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (op != 4);

        scan.close();
    }
}